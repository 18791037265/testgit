package com.ots.modelEntity;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.ifre.util.DecisionInvokeUtil;
import com.ifre.util.IntfUtils;


public class ZhiFanJinKeZRGZTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sysSource = "antjb";			//系统来源,由iFRE提供
		String businessNum = "20171130";	//业务编码，businessNum，Sting，必填，长度1-30，和业务系统一致
		String url = "http://103.160.109.253:8080/saas_deis/shared/brmsShared/api/callRuleFire";				
									//接口Url,以此为准
		String prodId = "e720ed7d63e83d2d0163f1abb1ae045a";	
									//产品编码,以此为准
										
		Map<String, Object> map = new HashMap<String, Object>();
		//业务参数
		map.put("prodId", prodId);
		map.put("businessNum", businessNum);
		map.put("sysSource", sysSource);
		
		Map<String, Object> modelObjMap = new HashMap<String, Object>();
		//从规则管理 - 规则对象 - 编辑  - 代码生成区域，动态复制获取，以规则对象为准
		
		ZfjkRule objZfjkRule = new ZfjkRule(); 
		objZfjkRule.setZf_countOverdue(1);
		objZfjkRule.setZf_maxOverdue(1);
		objZfjkRule.setZf_overdueAmount(0);
		objZfjkRule.setZf_refuseOrgan(2);
		objZfjkRule.setZf_riskList("3");
		//objZfjkRule名称任意
		modelObjMap.put("objZfjkRule", objZfjkRule);
		
		
		//jsonDataObject固定写法，jsonDataObject生成也可以自定义方法保持格式一致即可
		map.put("jsonDataObject", IntfUtils.transform(modelObjMap)); 
		
		//调用接口方法	
		try {
			System.out.println("请求报文:"+JSON.toJSONString(modelObjMap));
			String result = DecisionInvokeUtil.decisionServiceInvoke(map, null, null, url);
			System.out.println("返回报文:"+result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

