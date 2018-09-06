package com.ots.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value="monishujuyuan-server")
public interface MoNiFXQ {
	
	@PostMapping(value = "/CoreController/request")
	String send(String request);
}
