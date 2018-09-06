package com.ots.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.cmx.hzmq.HzMq;
import com.cmx.vtools.VTools;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	private Logger logger=Logger.getLogger(Configuration.class);
	
	@org.springframework.context.annotation.Bean
	public VTools vt(){
		return new VTools();
	}
	
	@org.springframework.context.annotation.Bean
	public HzMq mq(){
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
		
		return new HzMq(ip, queueName, queueSize);
	}
	
	@org.springframework.context.annotation.Bean
	public int pp(){
		return 900;
	}
}
