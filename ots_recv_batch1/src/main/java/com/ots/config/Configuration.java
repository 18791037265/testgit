package com.ots.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.cmx.hzmq.HzMq;
import com.cmx.runflow.HzRunFlow;
import com.cmx.vtools.VTools;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	private Logger logger=Logger.getLogger(Configuration.class);
	
	@org.springframework.context.annotation.Bean
	public VTools vt(){
		return new VTools();
	}
	
	@org.springframework.context.annotation.Bean
	public HzRunFlow runflow(){
		return new HzRunFlow("ALIPAY", "0");
	}
	

	
}
