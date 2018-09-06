package com.ots.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import com.alibaba.fastjson.JSON;
import com.cmx.vtools.VTools;
import com.ifre.util.DecisionInvokeUtil;
import com.ots.modelEntity.ZfDerive;
import com.ots.modelEntity.Zfjk;
import com.ots.timeout.TimeOutRetry;

public class SendJueCeXunHuan {

	private static final Logger logger = Logger.getLogger(SendJueCeXunHuan.class);
	
	@SuppressWarnings("unchecked")
	public static String runJueCeXunHuan(VTools var, String request) throws Exception {
		
		logger.info("JueCeXunHuan参数Var=");
		String url = var.getStr("${url}");								
		Map<String, Object> map = new HashMap<String, Object>();
		
		String prodId = var.getStr("${prodId}");
		String businessNum = var.getStr("${businessNum}");
		String sysSource = var.getStr("${sysSource}");
		
		
		map.put("prodId", prodId);
		map.put("businessNum", businessNum);
		map.put("sysSource", sysSource);

		logger.info("智帆金科  数据源 返回 报文 =["+request+"]");

		Map<String,Object> m = (Map<String,Object>)JSON.parse(request);
		// TODO   添加 null 异常处理     Qin
		try{
			
			Object responseMsg = m.get("respContent");
			logger.info("智帆金科  数据源 返回 respContent  =["+responseMsg+"]");
			m = (Map<String, Object>) JSON.parse( responseMsg.toString());
		}catch(Exception e){
			logger.info("智帆金科  数据源 返回 respContent异常 --",e);
			//20170724   添加超时重发表
			Map<String, Object> autoMap = (Map<String, Object>) var.getObjMap("autoMap");
			TimeOutRetry timeOutRetry = (TimeOutRetry) autoMap.get("timeOutRetry");
			timeOutRetry.setTimeOutRetry(var, true);
		}
		List<Map<String,Object>> loanInfos = (List<Map<String, Object>>) m.get("loanInfos");
		
		List<Zfjk> ZfjkList = new ArrayList<Zfjk>(); 
		Zfjk objZfjk = null;
		if(loanInfos ==null || loanInfos.size()==0 ){
			logger.info("loanInfos 域  返回 报文  为空   -----");
		}else{			
			for (Map<String, Object> map2 : loanInfos) {
				objZfjk = new Zfjk();
				if(map2.containsKey("borrowState") && map2.get("borrowState")!=null ){
					objZfjk.setZf_borrowState(map2.get("borrowState").toString());//borrowState
				}
				if(map2.containsKey("arrearsAmount") && map2.get("arrearsAmount")!=null ){
					objZfjk.setZf_arrearsAmount(Double.parseDouble(map2.get("arrearsAmount").toString()));//arrearsAmount
				}
				if(map2.containsKey("companyCode") && map2.get("companyCode")!=null ){
					objZfjk.setZf_companyCode(map2.get("companyCode").toString());//companyCode
				}			
				if(map2.containsKey("repayState") && map2.get("repayState")!=null ){
					objZfjk.setZf_repayState(map2.get("repayState").toString());//repayState
				}
				ZfjkList.add(objZfjk);
			}		
		}
		
		//从规则管理 - 规则对象 - 编辑  - 代码生成区域，动态复制获取，以规则对象为准
		ZfDerive objZfDerive = new ZfDerive(); 
		objZfDerive.setZfjkList(ZfjkList);
		
		
		Map<String, Object> modelObjMap = new HashMap<String, Object>();
		modelObjMap.put("objZfDerive", objZfDerive);
		
		//jsonDataObject固定写法，jsonDataObject生成也可以自定义方法保持格式一致即可
		map.put("jsonDataObject", com.ifre.util.IntfUtils.transform(modelObjMap)); 
		
		var.run("${FaSongBaoWen}="+ map);
		
		//调用接口方法
		try {
			logger.info("请求报文:"+JSON.toJSONString(modelObjMap));
			logger.info("map=" + map);
			String result = DecisionInvokeUtil.decisionServiceInvoke(map, null, null, url);
			logger.info("返回报文:"+result);
			return result;
		} catch (Exception e) {
			logger.error(" 调用决策引擎异常  ...... " ,e );
			return null;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

}