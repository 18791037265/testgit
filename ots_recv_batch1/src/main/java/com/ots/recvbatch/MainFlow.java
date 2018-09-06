package com.ots.recvbatch;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;

import com.cmx.runflow.HzRunFlow;
import com.cmx.vtools.VTools;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class MainFlow {
	
	private static final Logger logger = Logger.getLogger(MainFlow.class);

	/**
	 * 此函数功能：Map，执行Flow
	 * @throws TemplateException 
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 */
	public static void mapRunFlow(VTools vt, HzRunFlow rf, Map<String, Object> map) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		logger.info("receive:"+map);
//		将Map放入M变量
		vt.putMapToM(map);
		vt.printMap();
//		运行流程
		rf.runFlow(vt);	
	}
}
