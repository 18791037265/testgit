package com.ots.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * 调用后台接口
 * 
 ***/
@FeignClient(value = "host-server-ext-ds")
public interface FPDFeignService {
	
	/**
	 * 
	 * 个人多头单笔负债查询 --明文
	 * 
	 * 输入  证件号码  姓名  接口类型  用户标示
	 * 
	 ***/
	@PostMapping(value = "/ext-ds/ifreService/querySingleLiab")
	String querySingleLiab(String request);
	
	/**
	 * 
	 * 查询通信运营商数据 --明文
	 * 
	 ***/
	@PostMapping(value = "/ext-ds/ifreService/queryCommOper")
	String queryCommOper(String request);
	

}