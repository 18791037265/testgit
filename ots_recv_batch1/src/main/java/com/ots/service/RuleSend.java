package com.ots.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.cmx.hzvar.Var;
import com.cmx.vtools.VTools;
import com.ots.timeout.TimeOutRetry;
import com.ots.util.AesUtil;
import com.ots.util.SignUtil;

public class RuleSend {

	private static final Logger logger = Logger.getLogger(RuleSend.class);
	@Autowired
	private static TimeOutRetry timeOutRetry;

	public static String sendJueCe(VTools vt, Map<String, Object> map, boolean jmFlag) throws Exception {
		/*
		 * //当前时间 SimpleDateFormat sdf= new SimpleDateFormat(
		 * "yyyy-MM-dd HH:mm:ss"); Date date =new Date () ; String
		 * str=sdf.format(date); var.setValue("newDate", str ); //5分钟后的时间 Date
		 * afterDate =new Date(date.getTime()+300000); String
		 * afterStr=sdf.format(afterDate); var.setValue("afterDate", afterStr);
		 */
		// 从数据取更新时间
		vt.setValue("myTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
		// 调用接口方法
		try {

			String encryptKey = jmFlag ? vt.getStr("${encryptKey}") : null;
			String signKey = jmFlag ? vt.getStr("${signKey}") : null;
			String URL = vt.getStr("${url}");

			logger.info(" 调用决策引擎     ");
			logger.info("encryptKey =[" + encryptKey + "]");
			logger.info("signKey =[" + signKey + "]");
			logger.info("URL =[" + URL + "]");
			logger.info("map =[" + map + "]");

			String result = decisionServiceInvoke(map, encryptKey, signKey, URL);

			logger.info(" 调用决策引擎  返回报文:=[" + result + "]");

			return result;

		} catch (Exception e) {

			logger.info("decisionServiceInvoke 决策引擎调用 异常    ", e);
			// 无返回如何处理？？？？？？
			// 初审 终审 分别判断 是否需要 超时处理
			// XiangMuBianHao,ChanPinMingCheng,ZhuLiuChengBuZhou,ZongCiShu,DangQianCiShu,ZhiXingShiJian,DangQianShuJu,XiaCiZhiXingShiJian,ZhuangTai,BeiZhu
			// 记录 ChaoShiZhongFa
			if (vt.getStr("${ShenHeJiBie}").equals("0")) {
				// var.run("TAB_INS(ChaoShiZhongFa[id]{XiangMuBianHao:proj_no,ZhuLiuChengBuZhou:XuHao,ZongCiShu:'10',DangQianCiShu:'1',ZhiXingShiJian:newDate,DangQianShuJu:'6',XiaCiZhiXingShiJian:afterDate,ZhuangTai:'1',BeiZhu:'决策引擎请求超时'})");
				// TODO 7.6添加 qin
				String sql = "select * from chaoshizhongfa where pre_pact_no='${m.abs_biz_info.pre_pact_no}'";
				if (StringUtils.isNotBlank(sql)) {
					timeOutRetry.setTimeOutRetry(vt, jmFlag);
				} else {
					timeOutRetry.setTimeOutRetry(vt, false);
				}
				return null;

			}

		}

		return null;

	}

	/**
	 * 决策服务调用通用方法
	 * 
	 * @param decisionVarMap
	 *            决策变量Map
	 * @param encryptKey
	 *            加密秘钥
	 * @param signKey
	 *            签名秘钥
	 * @param url
	 *            接口Url
	 * @return
	 * @throws Exception
	 */
	public synchronized static String decisionServiceInvoke(Map<String, Object> decisionVarMap, String encryptKey,
			String signKey, String url) throws Exception {
		logger.info("决策服务调用通用方法==start==");
		if (decisionVarMap == null || decisionVarMap.isEmpty()) {
			throw new NullPointerException("变量Map不能为Null值或为空");
		}

		if (decisionVarMap.get("sysSource") == null || decisionVarMap.get("sysSource").toString().trim().equals("")) {
			throw new NullPointerException("请设置渠道来源变量sysSource值");
		}

		if (decisionVarMap.get("prodId") == null || decisionVarMap.get("prodId").toString().trim().equals("")) {
			throw new NullPointerException("请设置产品编码prodId值");
		}

		if (decisionVarMap.get("businessNum") == null
				|| decisionVarMap.get("businessNum").toString().trim().equals("")) {
			throw new NullPointerException("请设置业务编号businessNum值");
		}

		if (url == null || url.trim().equals("")) {
			throw new NullPointerException("请设置接口调用Url值");
		}

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sysSource", decisionVarMap.get("sysSource"));

		if (encryptKey != null && !encryptKey.trim().equals("")) {
			String mapDataJson = JSONObject.toJSONString(decisionVarMap);
			String encryptData = AesUtil.base64EncryptCBC(mapDataJson, encryptKey);
			map.put("encryptData", encryptData);
		} else {
			map.putAll(decisionVarMap);
		}

		if (signKey != null && !signKey.isEmpty()) {
			map.put("sysSign", SignUtil.md5Sign(map, signKey));
		}
		logger.info("决策服务调用通用方法==end==");
		return com.ots.util.HttpKit.post(url, JSONObject.toJSONString(map), false);
	}

}