package com.ots.timeout;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cmx.hzvar.Var;
import com.cmx.xatools.XaTools;

/****
 * 
 * 超时重发
 * 
 * 
 * 
 */
@Scope("prototype")
@Service("timeOut")
public class TimeOut {
	private static final Logger logger = Logger.getLogger(TimeOut.class);

	private Var var = null;

	public TimeOut() {
		this.var = new Var();
	}

	/**
	 * 
	 * @return
	 */
	public Map<String, Object> getChaoshiMap() {
		// 清空var里面的内容
		var.free();
		var.run("SQL(select * from chaoshizhongfa where  ZhuangTai ='1' and UpdateTime = (select min(UpdateTime) from chaoshizhongfa where  XiangMuBianHao ='ALIPAY'))?{00:成功,01:失败,KaiShiShiJian:yyyy-MM-dd HH:mm:ss SSS}");
		// var.printMap();
		logger.info("[chaoshizhongfa]查询授信取表数据成功！");
		String rspCode = var.getStr("${rscode}");
		if (!"00".equals(rspCode)) {
			logger.warn("[TimeOut]  chaoshizhongfa表不存在  需要超时重发的数据 存在 ！");
			XaTools.msleep(1000);
			return null;
		}
		Map<String, Object> mapret = var.getMap("t", "chaoshizhongfa");
		String DangQianShuJu = var.getStr("${t.chaoshizhongfa.DangQianShuJu}");
		logger.warn("查询表中的DangQianShuJu数据=============" + DangQianShuJu + "================");
		@SuppressWarnings("unchecked")
		Map<String, Object> m = (Map<String, Object>) JSON.parse(DangQianShuJu);
		// 拿到人员信息Id
		String prodId = m.get("prodId").toString();
		var.run("TAB(abs_cust_info_base{id:" + prodId + "})");
		logger.warn("拿到人员信息Id关联到abs_cust_info=============" + prodId + "================");
		rspCode = var.getStr("${rspcode}");
		if (!"00".equals(rspCode)) {
			logger.warn(var.getStr("[TimeOut] 查询[abs_cust_info_base{id:prodId} ] 表数据失败！"));
			XaTools.msleep(1000);
			return null;
		}
		return mapret;
	}
}