package com.ots.recvbatch;

import org.apache.log4j.Logger;

import com.cmx.vtools.VTools;


public class BlackList {
	private static final Logger logger = Logger.getLogger(BlackList.class);

	public Boolean getBlackList(String idNo, VTools var ) throws Exception{
		var.run("${FaSongBaoWen}="+idNo);

		Boolean flag =true;
		
		logger.info("[BlackList]=idNo=["+idNo+"]=====");
		
		var.run("SQL(select * from blacklist where  id_no ='"+idNo+"'");
		
		String rspCode = var.getStr("${rspcode}");
		if(!"00".equals(rspCode)){
			logger.info(" blacklist 黑名单===["+var.getStr("${rspcode}")+"]  不存在 黑户数据 ！");
			flag = false;
		}
		var.run("${JieShouBaoWen}="+flag);
		return flag;
	}
}
