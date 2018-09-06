package com.ots.recvbatch;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.cmx.vtools.VTools;
import com.ots.config.Configuration;

@Scope("prototype")
@Component
@Order(value=1)
public class MainGetMq implements ApplicationRunner{
	
	private static final Logger logger = Logger.getLogger(MainGetMq.class);
	
	public static int threadCount=0;
	
	@Autowired
	private Consumer consumer1;
	@Autowired
	private Consumer consumer2;
	@Autowired
	private Consumer consumer3;
	@Autowired
	private Consumer consumer4;
	@Autowired
	private Consumer consumer5;
	@Autowired
	private Consumer consumer6;
	@Autowired
	private Consumer consumer7;
	@Autowired
	private Consumer consumer8;
	@Autowired
	private Consumer consumer9;
	@Autowired
	private Consumer consumer10;
	@Autowired
	private Consumer consumer11;
	@Autowired
	private Consumer consumer12;
	@Autowired
	private Consumer consumer13;
	@Autowired
	private Consumer consumer14;
	@Autowired
	private Consumer consumer15;
	@Autowired
	private Consumer consumer16;
	@Autowired
	private Consumer consumer17;
	@Autowired
	private Consumer consumer18;
	@Autowired
	private Consumer consumer19;
	@Autowired
	private Consumer consumer20;
	@Autowired
	private Consumer consumer21;
	@Autowired
	private Consumer consumer22;
	@Autowired
	private Consumer consumer23;
	@Autowired
	private Consumer consumer24;
	@Autowired
	private Consumer consumer25;
	@Autowired
	private Consumer consumer26;
	@Autowired
	private Consumer consumer27;
	@Autowired
	private Consumer consumer28;
	@Autowired
	private Consumer consumer29;
	@Autowired
	private Consumer consumer30;
	
//	@Autowired
//	private FXQService fXQService;
//	@Autowired
//	private FPDFeignMMService fPDFeignmmService;
//	@Autowired
//	private FPDFeignMayiNotify fPDFeignMayiNotify;
//	@Autowired
//	private TimeOutRetry timeOutRetry;
	
	private List<Consumer> getConsumers(){
		List<Consumer> list=new ArrayList<>();
		list.add(consumer1);
		list.add(consumer2);
		list.add(consumer3);
		list.add(consumer4);
		list.add(consumer5);
		list.add(consumer6);
		list.add(consumer7);
		list.add(consumer8);
		list.add(consumer9);
		list.add(consumer10);
		list.add(consumer11);
		list.add(consumer12);
		list.add(consumer13);
		list.add(consumer14);
		list.add(consumer15);
		list.add(consumer16);
		list.add(consumer17);
		list.add(consumer18);
		list.add(consumer19);
		list.add(consumer20);
		list.add(consumer21);
		list.add(consumer22);
		list.add(consumer23);
		list.add(consumer24);
		list.add(consumer25);
		list.add(consumer26);
		list.add(consumer27);
		list.add(consumer28);
		list.add(consumer29);
		list.add(consumer30);
		return list;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void run(ApplicationArguments arg0) {
		logger.info("主线程 start");
		
//		Map<String, Object> autoMap = new HashMap<String, Object>();
//	    autoMap.put("fXQService", fXQService);
//		autoMap.put("fPDFeignmmService", fPDFeignmmService);
//		autoMap.put("fPDFeignMayiNotify", fPDFeignMayiNotify);
//		autoMap.put("timeOutRetry", timeOutRetry);
//		BigDataService bigDataService = new BigDataService();
//		autoMap.put("bigDataService", bigDataService);
		
//		读取thread配置文件
		InputStream rs = Configuration.class.getClassLoader().getResourceAsStream("thread.properties");
		Properties properties = new Properties();
		try {
			properties.load(rs);
		} catch (IOException e) {
			logger.error("读取thread配置文件失败",e);
		}
		int threadSum = Integer.parseInt(properties.getProperty("threadSum"));
		
		if(this.threadCount>0){
			threadSum=this.threadCount;
		}
		logger.info("当前线程数:\t"+threadSum+"\t"+arg0);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.info("线程睡眠异常");
		}
		ExecutorService threadPool = Executors.newFixedThreadPool(threadSum);
		List<Consumer> consumerList=getConsumers();
		Consumer consumer;
		for (int i = 0; i < threadSum; i++) {
			consumer = consumerList.get(i);
			VTools vt = new VTools();
			consumer.initConsumer("getter"+(i+1),vt);
		}
		for (int i = 0; i < threadSum; i++) {
			consumer = consumerList.get(i);
			threadPool.execute(consumer);
		}
	}
}

