package com.ots.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class IntfUtils {

	
	public static String transform(Map<String,Object> targetMap){
		List<Map<String,Object>> arrayList = new ArrayList<Map<String,Object>>();
		for (Map.Entry<String,Object> entry : targetMap.entrySet()) {
			Object obj = entry.getValue();
			Map<String,Object> hashmap = trimObj(obj);
			arrayList.add(hashmap);
		}
		return JSONObject.toJSONString(arrayList);
	}
	
	public static Map<String,Object> trimObj(Object model){
		   Field[] field = model.getClass().getDeclaredFields(); // 获取实体类的所有属性，返回Field数组
		   Map<String,Object> fieldJB = new HashMap<String,Object>();
		   String classname = model.getClass().getName();
		  
		   if(classname.indexOf(".")>0){
			   classname = classname.substring(classname.lastIndexOf(".")+1, classname.length());
           }
		   fieldJB.put("modelname", classname);
		   List<Map<String,Object>> jsonArray = new ArrayList<Map<String,Object>>();
		   
		   try {
	            for (int j = 0; j < field.length; j++) { // 遍历所有属性
	            	
	            	Map<String,Object> jb = new HashMap<String,Object>();
	                String name = field[j].getName(); // 获取属性的名字
	                jb.put("field", name);
	                name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法
	                String type = field[j].getGenericType().toString(); // 获取属性的类型
                    Method m = model.getClass().getMethod("get" + name);
                    if(type.indexOf(".")>0){
                    	type = type.substring(type.lastIndexOf(".")+1, type.length());
                    }
                    jb.put("fieldtype", type);
                    jb.put("value",  m.invoke(model));
	                jsonArray.add(jb);
	                // 如果有需要,可以仿照上面继续进行扩充,再增加对其它类型的判断
	            }
	            fieldJB.put("fields", jsonArray);
	            
	        } catch (NoSuchMethodException e) {
	            e.printStackTrace();
	        } catch (SecurityException e) {
	            e.printStackTrace();
	        } catch (IllegalAccessException e) {
	            e.printStackTrace();
	        } catch (IllegalArgumentException e) {
	            e.printStackTrace();
	        } catch (InvocationTargetException e) {
	            e.printStackTrace();
	        }
		return fieldJB;
	}
	
	
	public static Map<String,Object> transformObj(String result,Map<String,Object> hashMap){
		Map<String,Object> hm = new HashMap<String,Object>();
		JSONObject jb = JSONObject.parseObject(result);
		for (Map.Entry<String, Object> ele : hashMap.entrySet()) {
			for (Map.Entry<String,Object> c : jb.entrySet()) {
				if(c.getKey().equals(ele.getKey())){
					JSONObject hh = jb.getJSONObject(c.getKey());
					Object obj = JSONObject.toJavaObject(hh, ele.getValue().getClass());
					hm.put(ele.getKey(), obj);
				}
			}
		}
		return hm;
	}
	
}