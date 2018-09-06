package com.ots.sendbatch;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.ots")
public class App 
{
	private static final Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.info("ots-send-batch SendToMq Start!" );
        try{        	
        	SpringApplication.run(App.class, args);
        }catch(Exception e){
        	logger.error("ots-send-batch SendToMq Start error !" , e );
        }
        logger.info("ots-send-batch SendToMq end!" );
    }
}


