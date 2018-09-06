package com.ots.util;

import java.lang.reflect.Method;



/**
 * 类反射工具类
 */
public class ClassReflectUtil {

	/**
     * 类反射调用
     * @param  classpath 类路径
     * @param  methodName 方法名
     * @param  args 参数
     * @return Object
     * @throws Exception 
     */
    @SuppressWarnings({ "rawtypes", "unchecked"})
	public static Object invoke(String classpath,String methodName, Object... args) throws Exception{
		
		if(null == args || args.length <= 0){
			throw new Exception("参数为空");
		}
		
		int length = args.length;
		Class[] parameterTypes = new Class[length];
		for(int i=0;i<length;i++){
			parameterTypes[i] = args[i].getClass();
		}
		
		Class cla =  Class.forName(classpath);
		Method method = cla.getMethod(methodName,parameterTypes);
		Object obj = cla.newInstance();
		
		return method.invoke(obj,args);
	}
}