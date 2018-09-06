package com.ots.recvbatch;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cmx.hzmq.HzMq;
import com.cmx.runflow.HzRunFlow;
import com.cmx.vtools.VTools;
import com.netflix.discovery.converters.Auto;
import com.ots.config.Configuration;
import com.ots.service.BigDataService;
import com.ots.service.remote.FPDFeignMMService;
import com.ots.service.remote.FPDFeignMayiNotify;
import com.ots.service.remote.FXQService;
import com.ots.service.remote.MoNiFXQ;
import com.ots.timeout.TimeOutRetry;

@Scope("prototype")
@Service("consumer")
public class Consumer implements Runnable {

	private static final Logger logger = Logger.getLogger(Consumer.class);

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
	
	private VTools vt;
	private HzRunFlow rf;
	private HzMq mq;
	private String name;
	private Map<String, Object> autoMap = new HashMap<String, Object>();

	public void initConsumer(String threadName,VTools vt) {
		this.vt = vt;
	    autoMap.put("fXQService", fXQService);
		autoMap.put("fPDFeignmmService", fPDFeignmmService);
		autoMap.put("fPDFeignMayiNotify", fPDFeignMayiNotify);
		autoMap.put("timeOutRetry", timeOutRetry);
		autoMap.put("mn", mn);
		BigDataService bigDataService = new BigDataService();
		autoMap.put("bigDataService", bigDataService);
		
		this.name=threadName;
//		读取MQ配置文件
		InputStream rs = Configuration.class.getClassLoader().getResourceAsStream("mq.properties");
		Properties properties = new Properties();
		try {
			properties.load(rs);
		} catch (IOException e) {
			logger.error("读取MQ配置文件失败",e);
		}
		String ip = properties.getProperty("ip");
		String queueName = properties.getProperty("queueName");
		int queueSize = Integer.parseInt(properties.getProperty("queueSize"));
		
		mq=new HzMq(ip, queueName, queueSize);
//		读取runflow配置文件
		InputStream rs2 = Configuration.class.getClassLoader().getResourceAsStream("runflow.properties");
		Properties properties2 = new Properties();
		try {
			properties2.load(rs2);
		} catch (IOException e) {
			logger.error("读取runflow配置文件失败",e);
		}
		String XiangMuBianHao = properties2.getProperty("XiangMuBianHao");
		String ShenHeJiBie = properties2.getProperty("ShenHeJiBie");
		rf=new HzRunFlow(XiangMuBianHao,ShenHeJiBie);
		
		mq.getConsumer();
		rf.preRunFlow(vt);
	}

	@Override
	public void run() {
		while (true) {
			
			vt.putObjMap("autoMap", autoMap);
			Map<String, Object> map = null;
			map = mq.receive();
			logger.info("Consumer ==start== " + map.get("pre_pact_no"));
			try {
				vt.run("${XianChengMing}=" + name);
				MainFlow.mapRunFlow(vt, rf, map);
			} catch (Exception e) {
				logger.error("流程运行异常", e);
			}
			logger.info("Consumer ==end== " + map.get("pre_pact_no"));
			vt.free();
		}
	}
}