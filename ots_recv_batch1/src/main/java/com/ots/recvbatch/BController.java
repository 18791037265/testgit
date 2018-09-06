package com.ots.recvbatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.cmx.runflow.HzRunFlow;
import com.cmx.vtools.VTools;
import com.cmx.xatools.XaTools;
import com.ots.entity.ReApplyRequest;
import com.ots.entity.VToolsGetter;
import com.ots.service.BigDataService;
import com.ots.service.remote.FPDFeignMMService;
import com.ots.service.remote.FPDFeignMayiNotify;
import com.ots.service.remote.FXQService;
import com.ots.service.remote.MoNiFXQ;
import com.ots.timeout.TimeOutRetry;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Controller
@Scope("prototype")
@RequestMapping(value = "/batch")
public class BController {
	
	private Logger logger=Logger.getLogger(BController.class);
	
	@Autowired
	private FXQService fXQService;
	@Autowired
	private FPDFeignMMService fPDFeignmmService;
	@Autowired
	private FPDFeignMayiNotify fPDFeignMayiNotify;
	@Autowired
	private TimeOutRetry timeOutRetry;
	@Autowired
	private MoNiFXQ mn;
	
	private HzRunFlow rf;
	
	@ResponseBody
	@RequestMapping(value="/reApply")
    public boolean baseRouteGet(HttpServletRequest request) {
    	VTools vt = VToolsGetter.getInstance();
    	Map<String, Object> autoMap = new HashMap<String, Object>();
	    autoMap.put("fXQService", fXQService);
		autoMap.put("fPDFeignmmService", fPDFeignmmService);
		autoMap.put("fPDFeignMayiNotify", fPDFeignMayiNotify);
		autoMap.put("timeOutRetry", timeOutRetry);
		autoMap.put("mn", mn);
		BigDataService bigDataService = new BigDataService();
		autoMap.put("bigDataService", bigDataService);
		vt.putObjMap("autoMap", autoMap);
        logger.info("====reApply====start===="  );
//    	String requestMsg="";
//    	try {
//			requestMsg=getXmlMsg(request);
//		} catch (IOException e) {
//			logger.error("==getXmlMsg 接收报文 error ==", e);
//		}
//    	logger.info("==reApply receive=["+requestMsg +"] "  );
//    	
//    	ReApplyRequest reApplyRequest = JSONObject.parseObject(requestMsg,  ReApplyRequest.class);
        ReApplyRequest reApplyRequest=new ReApplyRequest();
    	reApplyRequest.setApply_no("201807070184636713A");
    	reApplyRequest.setProj_no("ALIPAY");
    	reApplyRequest.setPrdt_no("J1010100100000000004_2");
    	reApplyRequest.setShenHeJiBie("1");
    	try {
    		vt.run("${apply_no}="+reApplyRequest.getApply_no());
			vt.run("${proj_no}="+reApplyRequest.getProj_no());
			vt.run("${prdt_no}="+reApplyRequest.getPrdt_no());
			vt.run("${ShenHeJiBie}="+reApplyRequest.getShenHeJiBie());
		} catch (Exception e) {
			logger.error("给vt赋报文值失败",e);
		} 
    	
    	vt.printMap("==runCfgStepReApply.runAllStep==");
    	
		rf=new HzRunFlow("ALIPAY","1");
		
		rf.preRunFlow(vt);
		
		rf.runFlow(vt);	
    	
		String ZS_return = null;
		try {
			ZS_return = vt.getStr("${ZS_return!'1'}");
		} catch (Exception e) {
			logger.error("获取终审结果失败",e);
		} 
    	logger.info("==reApply  终审结果 返回 =[" + ZS_return + "]  "  );
    	logger.info("==reApply  Apply_no=["+ reApplyRequest.getApply_no()+"]-->ots-jb"  );
    	logger.info("====reApply====end===="  );
    	if(ZS_return.equals("0"))
    		return  false;
    	else
    		return true;
    }

	/**
	 * 获取请求的信息转换成字符串
	 * @param req
	 * @return
	 * @throws IOException
	 */
	public static String getXmlMsg(HttpServletRequest req) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader reader = req.getReader();
		String line;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}
}
