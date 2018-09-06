package com.ots.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cmx.vtools.VTools;

/**
 * 发送到各种数据源，包括决策引擎和渠道OTS
 * @author hzhx
 *
 */
@Scope("prototype")
@Service("sendToOuter")
public class UnPackMap {
	
	public static void unPackMap(VTools var, Map<String, Object> m) {
		Map<String,Object> map = new HashMap<>();
		setMap(m, map);
		var.putMapToR(map);
	}

	@SuppressWarnings("unchecked")
	private static void setMap(Map<String,Object> m, Map<String,Object> map) {
		for (String key : m.keySet()) {
			String type = m.get(key).getClass().getTypeName();
			if(!type.endsWith("JSONObject")){
				map.put(key, m.get(key)+"");
			}else{
				setMap((Map<String, Object>) m.get(key), map);
			}
		}
	}
}
