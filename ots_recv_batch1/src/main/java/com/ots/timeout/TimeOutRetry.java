package com.ots.timeout;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cmx.vtools.VTools;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
/***
 * 
 * 超时重发保存
 * 
 * **/
@Scope("prototype")
@Service("timeOutRetry")
public class TimeOutRetry {
	
	private static final Logger logger = Logger.getLogger(TimeOutRetry.class);
	
	/**
	 * 设置超时重发表
	 * @param vt  变量
	 * @param fMap 主流程表查询出来的
	 * @param firstFlag  是否第一次登记
	 * @param xuHao 执行主流程的序号
	 * @throws TemplateException 
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 */
	public void setTimeOutRetry(VTools vt, boolean firstFlag) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		vt.setValue("DangQianShuJu", vt.getAllMap());
		
		String reTryStr = vt.getStr("${重发参数}"); // 决策失败重试
		vt.run("${ZongCiShu}=" + reTryStr.split(",").length);   // 总次数
		logger.info(" 单号 =["+ vt.getStr("${t.abs_cust_info_mayi.apply_no}")+"]");
		if(firstFlag){
			vt.setValue("XiaCiZhiXingShiJian", addDateMinute(vt.getDate("yyyy-MM-dd HH:mm:ss"), Integer.parseInt(reTryStr.split(",")[0])) );
			vt.run("${InsertTime}=123123");
			vt.run("${pre_pact_no}=" + vt.getStr("${m.pre_pact_no}"));
			vt.run("${XiangMuBianHao}="+vt.getStr("${m.prdt_no}"));
			vt.run("TAB_INS(ChaoShiZhongFa[id]{ZhuLiuChengBuZhou:决策引擎名称,DangQianCiShu:'1',ZhuangTai:'1',BeiZhu:'zfjk1超时',UpdateTime:myTime})");
		}else{
			vt.run("TAB(ChaoShiZhongFa{pre_pact_no:${t.abs_cust_info_mayi.apply_no}})");
			logger.info("  智帆金科    记录超时重发   firstFlag=["+firstFlag+"] DangQianCiShu次数=["+vt.getV("DangQianCiShu")+"] ");
			// 重试次数 +1 ， 计算下次发送时间
			vt.setValue("DangQianCiShu", vt.getStr("DangQianCiShu")+1);
			vt.setValue("UpdateTime", vt.getDate("yyyy-MM-dd HH:mm:ss"));
			logger.info("ds 智帆金科 查询  重试  次数达到 记录 超时重发=====超时重试次数="+vt.getV("DangQianCiShu")+"==");
			// 修改下次执行时间
			vt.run("SQL(update ChaoShiZhongFa set ZhuangTai = '1',XiaCiZhiXingShiJian='"+addDateMinute(vt.getDate("yyyy-MM-dd HH:mm:ss"), Integer.parseInt(reTryStr.split(",")[Integer.parseInt( vt.getStr("${t.ChaoShiZhongFa.DangQianCiShu}"))-1]))+"' where pre_pact_no='${t.ChaoShiZhongFa.pre_pact_no}'");
		}
	}

	
	//返回的是字符串型的时间，输入的
	private String addDateMinute(String day, int x){
           SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 24小时制  
           Date date = null;   
           try {   
               date = format.parse(day);   
           } catch (Exception ex) {   
               ex.printStackTrace();   
           }   
           if (date == null)   
               return "";   
           logger.info("front:" + format.format(date)); //显示输入的日期  
           Calendar cal = Calendar.getInstance();   
           cal.setTime(date);   
           cal.add(Calendar.MINUTE, x);// 24小时制   
           date = cal.getTime();   
           logger.info("after:" + format.format(date));  //显示更新后的日期 
           cal = null;   
           return format.format(date);   
       } 
	
	/**
	 *  设置反洗钱和反欺诈超时重发表     XiaCiZhiXingShiJian='"+addDateMinute(vt.getDate("yyyy-MM-dd HH:mm:ss"),)
	 * @param vt  变量
	 * @param fMap 主流程表查询出来的
	 * @param firstFlag  是否第一次登记
	 * @param xuHao 执行主流程的序号
	 * @throws TemplateException 
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 */
	public void setTimeOut(VTools vt) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		logger.info(" "+vt.getStr("决策引擎名称")+"超时单号 =["+ vt.getStr("${m.pre_pact_no}")+"]");
		vt.setValue("XiaCiZhiXingShiJian",addDateMinute(vt.getDate("yyyy-MM-dd HH:mm:ss"),360));
		vt.setValue("ZongCiShu", "3");
		
		vt.run("SQL(select * from ChaoShiZhongFa where pre_pact_no='${m.pre_pact_no}'");
		String rspCode = vt.getStr("${rspcode}");
		if(!"00".equals(rspCode)){
			logger.info("-"+vt.getStr("决策引擎名称")+"-第一次进入超时-----------");
			vt.run("${DangQianShuJu}="+vt.getStr("${m.pre_pact_no}"));
			vt.run("TAB_INS(ChaoShiZhongFa[id]{XiangMuBianHao:proj_no,DangQianCiShu:'1',ZhiXingShiJian:newDate,ZhuangTai:'1',BeiZhu:'999999',InsertTime:myTime,UpdateTime:myTime})");
		}else{
			// 修改下次执行时间
			vt.run("SQL(update ChaoShiZhongFa set ZhuangTai = '1' where pre_pact_no='${m.pre_pact_no}'");
		}
	}
}