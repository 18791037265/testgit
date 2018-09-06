package com.ots.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cmx.vtools.VTools;
import com.cmx.xatools.XaTools;
import com.ots.service.remote.FPDFeignMMService;
import com.ots.timeout.TimeOutRetry;

/**
 * 发送到各种数据源，包括决策引擎和渠道OTS
 * @author hzhx
 *
 */
@Scope("prototype")
@Service("bigDataService")
public class BigDataService {
	
	private static final Logger logger = Logger.getLogger(BigDataService.class);
	
	
	/**
	 * 发送到数据源 智帆金科多头（初审）、 聚信立（终审），并记录日志和超时重发表
	 * @param vt
	 * @param fMap
	 * @return true，表示不重发
	 */
	@SuppressWarnings("unchecked")
	public boolean sendToData(VTools vt) throws Exception{
		String requestModel=vt.getStr("${发送配置}");
		logger.info("数据源  发送报文 模板 = ["+ requestModel +"]");
		String requestMsg = vt.getStr(requestModel);
		logger.info("数据源  发送报文 = ["+ requestMsg +"]");

		vt.run("${StepStartTime}=${sysdate}");

		logger.info("发送 数据源=["+ vt.getStr("${通讯名称}") +"]url=["+ vt.getStr("${发送类}") +"] 发送方法=["+  vt.getStr("${发送方法}")+"] ");

		String response="";

		//从数据取更新时间
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));   // 超时重发表用到
		//序号提取
		String xuHao='4'+"";

		// 智帆金科多头（初审）
		if ( vt.getStr("${发送方法}").equals("querySingleLiab")) {
			//TODO   QIN
			try{
			response = sendDataSourceZhiFanJinKe(vt, requestMsg, response, xuHao);
			} catch (Exception e) {
				logger.error("发送失败",e);
				return false;
			}
			if(response==null){
				return false;
			}
		}
		 //  聚信立（终审）
		if (vt.getStr("${发送方法}").equals("queryCommOper")) {  
			logger.info("========查询 聚信立（终审） start==========");
			try{
				Map autoMap = (Map) vt.getObjMap("autoMap");
				FPDFeignMMService fPDFeignmmService = (FPDFeignMMService) autoMap.get("fPDFeignmmService");
				response=fPDFeignmmService.queryCommOper(requestMsg).replace("\"{", "{").replace("}\"", "}").replace("\\\"", "\"");
			} catch (Exception e) {
				return false;
			}
			logger.info("========查询 聚信立（终审） end ==========");
		}
		logger.info("数据源返回报文为=["+response+"]");
		//将返回报文 放入 接收报文中
		vt.run("${JieShouBaoWen}="+response);
		// response 超时 网络中断 处理  ？？？
		String recvDict = vt.getStr("${接收字典}");
		logger.info("数据源返回 接收字典为=["+recvDict+"]");
		// 解包接收到的报文，计入变量
		unpackDataSource(vt, recvDict, response);	
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
		vt.run("TAB_INS(ShouXinRiZhi[id]{RenWuMingCheng:决策引擎名称,XiangMuMingCheng:proj_no,JieShuShiJian:sysdate,KaiShiShiJian:StepStartTime,InsertTime:sysdate,UpdateTime:myTime})");
		vt.printMap(" ------ 数据源解包后 vt 数据  -----");
		return true;
	}

    /**
     * 发送智帆金科数据源
     * @param vt
     * @param fMap
     * @param requestMsg
     * @param response
     * @param firstFlag
     * @param xuHao
     * @return
     */
	public String sendDataSourceZhiFanJinKe(VTools vt, String requestMsg, String response, String xuHao) throws Exception{
		 Map map = (Map) vt.getObjMap("autoMap");
		 FPDFeignMMService fPDFeignmmService =(FPDFeignMMService) map.get("fPDFeignmmService");
		 TimeOutRetry 	timeOutRetry =(TimeOutRetry) map.get("timeOutRetry");
		//  智帆金科多头 个人多头单笔负债查询  				 
		logger.info("======== 智帆金科多头（初审） 个人多头单笔负债 第一次 查询  ==start===");
		vt.run("${RenWuMingCheng}=${决策引擎名称}");
		try{
			logger.info("======== 智帆金科多头（初审）发送报文fsbw1:" + requestMsg);
			vt.run("${FaSongBaoWen}="+ requestMsg);
			response=fPDFeignmmService.querySingleLiab(requestMsg);
			logger.info("======== 智帆金科多头（初审）接收报文jsbw1: response=["+response +"]");
		} catch (Exception e) {  
			logger.info("======== 智帆金科多头（初审）个人多头单笔负债查询 querySingleLiab======超时==", e );
			timeOutRetry.setTimeOutRetry(vt,true);
			return null;			
		}
		vt.run("${JieShouBaoWen}="+response);
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
		vt.run("TAB_INS(ShouXinRiZhi[id]{XiangMuMingCheng:proj_no,JieShuShiJian:sysdate,KaiShiShiJian:StepStartTime,InsertTime:sysdate,UpdateTime:myTime})");
		@SuppressWarnings("unchecked")
		Map<String,String> rspMap = (Map<String,String>)JSONObject.parse(response);

		if("999999".equals(rspMap.get("respCode"))){
			logger.info("======== 智帆金科多头（初审） 个人多头单笔负债 第一次查询  返回超时======999999============");
			timeOutRetry.setTimeOutRetry(vt,true);
			return null;	
		}

		// 第二次及 二次以上的请求报文
		String secondSendStr = getSecondReqStr(rspMap);

	

		vt.run("${FaSongBaoWen}="+ secondSendStr);
		int i=0;
		for(i=0; i<4; i++){
			try{
				response = "";
				logger.info("智帆金科多头（初审） 第" + (i+2) + "次请求报文 fsbw: =["+ secondSendStr +"]");
				response=fPDFeignmmService.queryMulLiab(secondSendStr);
				logger.info("智帆金科多头（初审） 第" + (i+2) + "次接收报文 jsbw: =["+ response +"]");
			} catch (Exception e) {
				logger.info("======== 智帆金科多头（初审） 第二次请求 === 出错或超时==", e );
				timeOutRetry.setTimeOutRetry(vt,true);
				return null;	
			}
			response = response.replace("\"{", "{").replace("}\"", "}").replace("\\\"", "\"");
			@SuppressWarnings("unchecked")
			Map<String,Object> secondRspMap = (Map<String,Object>)JSONObject.parse(response);
			// rspCode 存放 IFRE0005
			@SuppressWarnings("unchecked")
			String rspCode = ((Map<String,Object>)secondRspMap.get("respContent")).get("resultCode").toString();
			if("000000".equals(secondRspMap.get("respCode")) && "IFRE0000".equals(rspCode)){
				logger.info("第 " + (i+2) + " Success respCode=["+ secondRspMap.get("respCode") +"] IFRE resultCode=["+ rspCode +"]");
				break;
			}
			if("999999".equals(secondRspMap.get("respCode").toString())){
				logger.info("========  智帆金科多头（初审） 第二次请求 999999 超时 ===========");
				timeOutRetry.setTimeOutRetry(vt,true);
				return null;	
			}
			//TODO  IFRE0004 姓名错误      qin
			if("IFRE0004".equals(rspCode)){
				logger.info("======== 第 " + (i+2) + "  智帆金科多头（初审） 第二次请求  IFRE0004  错误 =========");
				vt.printMap("----结束审批  vt ---");
				// 修改授信结果表
				vt.run("${prod_no}=" + vt.getStr("${r.proj_no}").toString());
				logger.info("r.proj_no [" + vt.getStr("${r.proj_no}").toString() + "] ");
				vt.run("TAB_INS(abs_loan_quoto[id]{ prod_no:r.prdt_no, apply_no:apply_no, is_admit:'N', refuse_code:'reason_code_07', refuse_msg:'信息存在异常', credit_amt:r.creditAmt, credit_rate:r.creditRate,sys_company_code:r.sys_company_code, create_date:myTime, update_date:myTime})");
				// 模型执行结果表 total_score//
				vt.run("TAB_INS(abs_model_result[id]{ pre_pact_no: t.abs_cust_info_mayi.apply_no, total_score:r.totalScore , pact_no:'0', reject_reason:'zm002', model_invoke_reason:'拒绝',create_date:myTime)");
				// 根据ID，修改状态为02， 表示刚才读到的内容，状态为 正在处理 第二步：加Lock，读T1 00（待处理）, 修改T1 01（正在处理）
				vt.run("SQL(update abs_biz_info set risk_status = '2',status = '1' where pre_pact_no='${t.abs_cust_info_mayi.apply_no}'");
				return null;
			}
			if("IFRE0005".equals(rspCode)){
				logger.info("======== 第 " + (i+2) + "  智帆金科多头（初审） 第二次请求  IFRE0005  超时 =========");
				continue;
			}
			
		}
		if(i==3){
			logger.info("ds 智帆金科 查询  重试  次数达到 记录 超时重发 ");
			return null;
		}
		return response;
	}


	/**
	 * 取出第二次发送到  智帆金科多头（初审）的 报文
	 * @param vt
	 * @param fMap
	 * @param firstFlag
	 * @param response  第一次返回的报文
	 * @param xuHao
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String getSecondReqStr(Map<String,String> rspMap) {
		String respContent=rspMap.get("respContent");
		rspMap = (Map<String,String>)JSONObject.parse(respContent);	
		String	strxNo=rspMap.get("trxNo"); 
		logger.info("getSecondReqStr strxNo=["+strxNo +"]");
		Map<String,String> mreques = new HashMap<String,String>();
		if(rspMap.get("HUAXIA")!=null && rspMap.get("HUAXIA")!=""){
			mreques.put("bpIdent", "HUAXIA");
		}
		if(rspMap.get("trxNo")!=null && rspMap.get("trxNo")!=""){
			mreques.put("trxNo", strxNo);
		}
		return JSON.toJSONString(mreques);
	}


	/**
	 * 解包数据源返回结果，可以在测试程序中，单独测试
	 * @param vt
	 * @param recvDict   解包字典
	 * @param response   返回报文
	 * 测试方法：
	 * 		String response = vt.pop("sjy01_pack_" + 4);
		    vt.popMap("sjy01_" + 4);   复原Map变量
	 */
	public void unpackDataSource(VTools vt, String recvDict, String response) throws Exception{
		vt.run("${RenWuMingCheng}=${通讯名称}");
		if (vt.getStr("${报文格式}").toUpperCase().indexOf("XML") >= 0) { 
			vt.xmlToVar(response, recvDict);
			logger.info("解析XML后的响应内容能为：" + vt.getStr("${r.resultCode}"));
		} else if (vt.getStr("${报文格式}").toUpperCase().indexOf("JSON") >= 0) {
			vt.jsonToVar(response, recvDict);
			logger.info("解析JSON后的响应内容能为：" + vt.getStr("${r.resultCode}"));
		} else {
			logger.info("不认识的报文格式！！！！：" + vt.getStr("${报文格式}"));
		}
	}
	
}
