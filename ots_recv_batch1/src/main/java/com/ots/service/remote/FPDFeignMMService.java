package com.ots.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * 调用后台接口
 * 
 ***/
@FeignClient(value = "host-server-ext-ds")
public interface FPDFeignMMService {
 
	/**
	 * 
	 * 个人多头单笔负债查询  -------密文
	 * 
	 * 输入  证件号码  姓名  接口类型  用户标示
	 * 
	 ***/
	@PostMapping(value = "/ext-ds/ifreRSAService/querySingleLiab")
	String querySingleLiab(String request);

	@PostMapping(value = "/ext-ds/ifreRSAService/queryMulLiab")
	String queryMulLiab(String request);
	
	
	/**
	 * 
	 * 查询通信运营商数据 ---------密文
	 * 
	 ***/
	@PostMapping(value = "/ext-ds/ifreRSAService/queryCommOper")
	String queryCommOper(String request);
	
}