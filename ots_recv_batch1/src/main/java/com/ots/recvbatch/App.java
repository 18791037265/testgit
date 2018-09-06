package com.ots.recvbatch;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients({"com.ots.service.remote"})
@ComponentScan("com.ots")
public class App {
	
	private static Logger logger=Logger.getLogger(App.class);
	
    public static void main( String[] args ) {
    	logger.info("ots_recv_batch    Start");
    	try {
    		if(args.length>0){
    			MainGetMq.threadCount=Integer.parseInt(args[0]);
    			logger.info(args[0]+"\t"+MainGetMq.threadCount);
    		}
    		SpringApplication.run(App.class, args);
		} catch (Exception e) {
			logger.error("ots_recv_batch start error !",e);
		}
        logger.info("ots_recv_batch    End");
    }
}
