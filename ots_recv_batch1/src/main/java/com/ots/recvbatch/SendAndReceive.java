package com.ots.recvbatch;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cmx.vtools.VTools;
import com.ots.entity.BeaiCHeaderRequestBean;
import com.ots.entity.BeaiFAntiMoneyRequestBean;
import com.ots.service.BigDataService;
import com.ots.service.RuleSend;
import com.ots.service.SendJueCeXunHuan;
import com.ots.service.UnPackMap;
import com.ots.service.remote.FPDFeignMayiNotify;
import com.ots.service.remote.FXQService;
import com.ots.service.remote.MoNiFXQ;
import com.ots.timeout.TimeOutRetry;

@Scope("prototype")
@Component
@Service("SendAndReceive")
public class SendAndReceive {
	
	@Autowired
	private MoNiFXQ mn;
	private static Logger logger=Logger.getLogger(SendAndReceive.class);
	
	public String sendMoNiFXQ(VTools vt) {
		Map<String,Object> map = (Map<String, Object>) vt.getObjMap("autoMap");
		MoNiFXQ mn = (MoNiFXQ) map.get("mn");
		String request = null;
		String response = null;
		try {
			String str = vt.getStr("${决策引擎名称}");
			request = JSON.toJSONString(str);
			logger.info("获取发送信息成功:[" + request + "]");
		} catch (Exception e) {
			logger.error("获取发送信息失败",e);
		}
		logger.info("============="+mn+"===============");
		response = mn.send(request);
		logger.info("调用数据源返回:[" + response + "]");
		return response;
	}
	
	public String sendMoNiFXQ2(VTools vt) {
		Map<String,Object> map = (Map<String, Object>) vt.getObjMap("autoMap");
		MoNiFXQ mn = (MoNiFXQ) map.get("mn");
		String request = null;
		String response = null;
		try {
			String str = vt.getStr("${决策引擎名称}");
			request = JSON.toJSONString(str);
			logger.info("获取发送信息成功:[" + request + "]");
		} catch (Exception e) {
			logger.error("获取发送信息失败",e);
		}
		logger.info("============="+mn+"===============");
		response = mn.send(request);
		logger.info("调用数据源返回:[" + response + "]");
		return response;
	}
	
	public int sendFXQ(VTools vt) {
		Map<String, Object> map = (Map<String, Object>) vt.getObjMap("autoMap");
		FXQService fXQService=(FXQService) map.get("fXQService");
		TimeOutRetry timeOutRetry = (TimeOutRetry) map.get("timeOutRetry");
		BeaiFAntiMoneyRequestBean beaiFAntiMoneyRequestBean = new BeaiFAntiMoneyRequestBean();

		String name = null;
		String certno = null;
		try {
			name = vt.getStr("${t.abs_cust_info_base.cust_name}");
			certno = vt.getStr("${t.abs_cust_info_base.id_no}");
		} catch (Exception e) {
			logger.error("获取用户信息失败",e);
		}
		BeaiCHeaderRequestBean header = new BeaiCHeaderRequestBean();
		header.setTranCode("540048");

		beaiFAntiMoneyRequestBean.setRequestHeader(header);
		beaiFAntiMoneyRequestBean.setCertType("51");
		beaiFAntiMoneyRequestBean.setName(name);
		beaiFAntiMoneyRequestBean.setCertNo(certno);
		String request = JSON.toJSONString(beaiFAntiMoneyRequestBean);
		logger.info("---反洗钱发送-request=[" + request + "]");
		String r=null;
		try {
			vt.run("${FaSongBaoWen}="+request);
		} catch (Exception e) {
			logger.error("设置变量出错",e);
		}
		String response=null;
		try {
			response = fXQService.selectSequenceForBeai(request);
			vt.run("${JieShouBaoWen}="+response);
			logger.info("---反洗钱返回-response=[" + response + "]");
			vt.jsonToVar(response, "{responseBody:responseBody}");
		} catch (Exception e) {
			logger.debug("进入超时重发",e);
			try {
				timeOutRetry.setTimeOut(vt);
			} catch (Exception e1) {
				logger.error("超时重发出错",e);
			} 
			vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
			return 0;
		} 
		try {
			r = vt.getStr("${r.responseBody}").trim();
		} catch (Exception e) {
			logger.error("获取反洗钱结果失败",e);
		}
		try {
			Integer.parseInt(r);
		} catch (Exception e) {
			logger.debug("responseBody为空",e);
			r="0";
		}
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
		return Integer.parseInt(r);
	}
	
	public int sendHMD(VTools vt) {
		
		BlackList blackList = new BlackList();
		
		Boolean flag = null;
		try {
			flag = blackList.getBlackList(vt.getStr("${t.abs_cust_info_base.id_no}"), vt);
		} catch (Exception e) {
			logger.error("黑名单查询失败",e);;
		} 
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
		if(flag)
			return 1;
		else
			return 0;
	}
	@SuppressWarnings("unchecked")
	public int send1(VTools vt) {
 		Map<String, Object> sendMap = null;
 		boolean jiaMiFlag = false;
		try {
			jiaMiFlag = vt.getStr("${是否加密!'是'}").trim().equals("是"); 
			jiaMiFlag = vt.getStr("${signKey!'否'}").trim().equals("否");
			String jcCfg = vt.getStr("${发送配置}");
			logger.info("决策发送模板:" + jcCfg );
			sendMap = vt.getJueCeData(jcCfg);
			logger.info("替换后决策发送模板:" + sendMap );
		} catch (Exception e) {
			logger.error("生成发送报文失败",e);
		} 
//		记录日志使用 为了记录数据库
		try {
			vt.run("${FaSongBaoWen}="+ sendMap);
		} catch (Exception e) {
			logger.error("赋值失败",e);
		} 
		String respStr=null;
		try {
			respStr = RuleSend.sendJueCe(vt, sendMap, jiaMiFlag).replace("\"{", "{").replace("}\"", "}").replace("\\\"", "\"");
			if(respStr==null)
				return 1;
		} catch (Exception e) {
			logger.error("发送决策引擎失败",e);
		}	
		try {
			vt.run("${JieShouBaoWen}=" + respStr);
		} catch (Exception e) {
			logger.error("赋值失败",e);
		} 
		Map<String,Object> m = (Map<String,Object>)JSON.parse(respStr);
		UnPackMap.unPackMap(vt, m);
//		第二次解包，将Msg中的信息，遍历为Map，存入变量
		Map<String, Object> m1 = null;
		try {
			m1 = (Map<String,Object>)JSON.parse(vt.getStr("${r.msg!' '}"));
		} catch (Exception e) {
			logger.error("返回报文有误",e);
		} 
//		如果接收报文为Map及嵌套形式，则调用以下，将对象中的Key和Value, 记录到变量中
		if(m1!=null && m1.size()>0){
			UnPackMap.unPackMap(vt, m1);
		}				
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
		String status = null;
		try {
			status = vt.getStr("${r.status}").toString();
		} catch (Exception e) {
			logger.error("获取决策引擎返回状态信息失败",e);
		} 
		if (StringUtils.isBlank(status) || !status.equals("SUCCESS")) {
			logger.info("调用决策引擎返回 失败 状态 ：" + "status=["+status+"]");
			return 1;
		}
		return 0;
	}
	
	public boolean sendDataSource(VTools vt) {
		
		Map<String, Object> map = (Map<String, Object>) vt.getObjMap("autoMap");
		BigDataService bigDataService=(BigDataService) map.get("bigDataService");
		try {
			boolean sendToData = bigDataService.sendToData(vt);
			if(!sendToData)
				vt.run("${toEnd}=1");
		} catch (Exception e) {
			logger.debug("发送数据源错误",e);
		}
		return true;
	}
	public int sendWithDataSource(VTools vt){
			String result=null;
			try {
				result = SendJueCeXunHuan.runJueCeXunHuan(vt, vt.getStr("${JieShouBaoWen}"));
			} catch (Exception e) {
				logger.debug("发送决策引擎失败",e);
			} 
			try {
				vt.run("${JieShouBaoWen}=" + result);
			} catch (Exception e) {
				logger.error("返回报文有误",e);
			} 
			@SuppressWarnings("unchecked")
			Map<String,Object> m = (Map<String,Object>)JSON.parse(result);
			UnPackMap.unPackMap(vt, m);
//			第二次解包，将Msg中的信息，遍历为Map，存入变量
			@SuppressWarnings("unchecked")
			Map<String, Object> m1 = null;
			try {
				m1 = (Map<String,Object>)JSON.parse(vt.getStr("${r.msg!' '}"));
			} catch (Exception e) {
				logger.error("报文解析失败",e);
			}
			if(m1!=null && m1.size()>0){
				UnPackMap.unPackMap(vt, m1);
			}	
			vt.printMap();
			vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
			String status = null;
			try {
				status = vt.getStr("${r.status}").toString();
			} catch (Exception e) {
				logger.error("获取决策引擎返回状态信息失败",e);
			} 
			if (StringUtils.isBlank(status) || !status.equals("SUCCESS")) {
				logger.info("调用决策引擎返回 失败 状态 ：" + "status=["+status+"]");
				return 1;
			}
			return 0;
	}
	
	public int sendOTS(VTools vt) {
		
		Map<String, Object> map = (Map<String, Object>) vt.getObjMap("autoMap");
		FPDFeignMayiNotify fPDFeignMayiNotify = (FPDFeignMayiNotify) map.get("fPDFeignMayiNotify");

		// var.printMap();
		String request;
		try {
			request = vt.getStr("${t.abs_cust_info_mayi.apply_no}");
			logger.info("发送到OTS的报文：" + request);
			vt.run("${FaSongBaoWen}="+request);
			String response = fPDFeignMayiNotify.trialResultNotify(request);
			vt.run("${JieShouBaoWen}="+response);
			logger.info("OTS apply_no=["+request+"]  返回报文为=[" + response + "]");
		} catch (Exception e) {
			logger.error("发送OTS失败",e);
		}
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
		
		try {
			//临时加上的，最后要删掉
			vt.run("SQL(UPDATE  abs_loan_quoto  set  platform_access='Y', platform_admit ='3400000',credit_amt='5000000',platform_rate='0.00040',risk_rating='A',solvency_ratings='A'   WHERE proj_no ='ALIPAY')");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return 0;
	}

	public int setTime(VTools vt){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR,1);
		try {
			vt.run("${end_date}="+new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
		} catch (Exception e) {
			logger.error("设置end_date值出错",e);
		} 
		return 0;
	}
}
