package com.ots.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * 调用后台接口
 * 
 ***/
@FeignClient(value = "ots-server-jb")
public interface FPDFeignMayiNotify {
	
	
	
	/**
	 * 
	 * 蚂蚁借呗通知   /base/credit/notify       /ots-jb/base/resultNotify
	 * 
	 ***/
	@PostMapping(value = "/ots-jb/base/credit/notify")
	String trialResultNotify(String request);


}