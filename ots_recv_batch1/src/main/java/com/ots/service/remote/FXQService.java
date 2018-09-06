package com.ots.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * 调用后台接口
 * 
 ***/

@FeignClient(value = "host-server-beai")
public interface FXQService {
	/*****
	 * 创建反洗钱接口
	 * @Description: 创建反洗钱接口
	 * @param requestjson
	 * @return
	 * 
	 * 
	 * **/
	@PostMapping(value = "/beaiCore/tranAntiMoney")
	String selectSequenceForBeai(String request);
	
	
	
	/**
	 * 创建核心客户号接口
	 * @Description: 创建核心客户号接口
	 * @param requestjson
	 * @return
	 */
	@PostMapping(value = "/beaiCore/establishCustomer")
	String establishCustomer(String requestjson);
	
	
	/**
	 * 查询核心客户号接口
	 * @Description: 查询核心客户号接口
	 * @param requestjson
	 * @return
	 */
	@PostMapping(value = "/beaiCore/queryCustomer")
	String queryCustomer(String requestjson);
	
	
}