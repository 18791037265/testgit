//package com.test;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.alibaba.fastjson.JSONObject;
//import com.cmx.vtools.VTools;
//import com.cmx.xatools.XaTools;
//
//import freemarker.core.ParseException;
//import freemarker.template.MalformedTemplateNameException;
//import freemarker.template.TemplateException;
//import freemarker.template.TemplateNotFoundException;
//
//public class JueCeFanc {
//
//	/**
//	 * 形成决策引擎需要的Map
//	 * @param cfgStr
//	 * @param prodId
//	 * @param businessNum
//	 * @param sysSource
//	 * @param flag  flag=true, 表示有类名，非决策卡
//	 * @return
//	 * @throws TemplateException 
//	 * @throws IOException 
//	 * @throws ParseException 
//	 * @throws MalformedTemplateNameException 
//	 * @throws TemplateNotFoundException 
//	 */
//	
//	protected static Map<String, Object> getJueCeData(VTools var, String cfgStr, String prodId, String businessNum, String sysSource, boolean classFlag) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
//		Map<String,Object> hashmap = new HashMap<String,Object>();
//		List<String> ls = new ArrayList<String>();
//		for(String s : XaTools.getBetween(cfgStr, "{", "}").split(",")){
//			ls.add(s.trim());
//		}
//		if(classFlag) {   //类方式
//			hashmap.put("jsonDataObject", trans(var, XaTools.getAfter(cfgStr, "}?"), ls)); 
//		}else{ // 评分卡方式
//			for(String s : ls){   // 一个配置的字段处理
//				putOneFieldCfg(var, s, hashmap);
//			}
//		}
//		hashmap.put("prodId", prodId);
//		hashmap.put("businessNum", businessNum);
//		hashmap.put("sysSource", sysSource);
//		return hashmap;
//	}
//
//	/**
//	 * @param var
//	 * @param s
//	 * @param hashmap
//	 * @throws TemplateException 
//	 * @throws IOException 
//	 * @throws ParseException 
//	 * @throws MalformedTemplateNameException 
//	 * @throws TemplateNotFoundException 
//	 */
//	private static void putOneFieldCfg(VTools var, String s, Map<String, Object> hashmap) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
//		Object value = null;
//		String[] arr = s.split(":");
//		Object v = var.getObj(arr[1]);
//		String key = XaTools.getBefore(arr[0], "!");
//		String type = XaTools.getAfter(arr[0], "!");
//		value = convertValue(v, type);
//		if(value!=null){
//			hashmap.put(key, value);
//		}
//	}
//
//	/**
//	 * 转换值
//	 * @param v  值， 
//	 * @param type  类型  支持   int long double string
//	 * @return
//	 */
//	public static Object convertValue(Object v, String type) {
//		if("可选".equals(v.toString().trim())){
//			return null;
//		}
//		Object value;
//		if(type.equals("int")){
//			// value = (int)(Double.parseDouble((v + "").replace(",", "")));
//			value = (int)(Double.parseDouble(v + ""));
//		}else if(type.equals("long")){
//			// value = (long)(Double.parseDouble((v + "").replace(",", "")));
//			value = (long)(Double.parseDouble(v + ""));
//		}else if(type.equals("double")){
//			value = Double.parseDouble(v + "");
//			// value = Double.parseDouble((v + "").replace(",", ""));
//		}else{
//			value = v + "";
//		}
//		return value;
//	}
//	
//			//  jsonDataObject=[{"modelname":"Test","fields":[{"field":"age","fieldtype":"int","value":211},{"field":"result","fieldtype":"String","value":"-999999"}]}]
//	private static String trans(VTools var, String modelname, List<String> ls) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException{
//		List<Map<String,Object>> arrayList = new ArrayList<Map<String,Object>>();
//		Map<String,Object> hashmap = new HashMap<String,Object>();
//		if(modelname.trim().length()>0){
//			hashmap.put("modelname", modelname);
//		}
//		hashmap.put("fields", getFields(var, ls));
//		arrayList.add(hashmap);
//		return JSONObject.toJSONString(arrayList);
//	}
//	
//	private static List<Map<String,Object>> getFields(VTools var, List<String> ls) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
//		List<Map<String,Object>> lm = new ArrayList<Map<String,Object>>();
//		for(String s : ls){
//			Map<String,Object> m = new HashMap<String, Object>();
//			String[] arr = s.split(":");
//			m.put("field", XaTools.getBefore(arr[0], "!"));
//			String type = XaTools.getAfter(arr[0], "!");
//			m.put("fieldtype", type==null || type.length()==0? "String" : type);
//			Object value = null;
//			Object v = var.getObj(arr[1]);
//			value = convertValue(v, type);			
//			if(value!=null){
//				m.put("value", value);
//				lm.add(m);
//			}
//		}
//	return lm;
//}
//
//	public Map<String, Object> getJueCeData(String cfgStr) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException{
//		VTools var = new VTools();
//		String prodId = var.getStr("${prodId}");
//		String businessNum = var.getStr("${businessNum}");
//		String sysSource = var.getStr("${sysSource}");
//		if(cfgStr.indexOf("?")>0){
//			super.setValue("modelname", XaTools.getAfter(cfgStr, "?"));
//		}
//		return JueCeFanc.getJueCeData(this, cfgStr, prodId, businessNum, sysSource, cfgStr.indexOf("?")>0);
//	}
//	public static void main(String[] args) {
////		Var var = new Var();
////		String prodId = "prodId";
////		String businessNum = "businessNum";
////		String sysSource = "sysSource";
////		var.run("${aa}=999999999999");
////		Map<String, Object> map = JueCeFanc.getJueCeData(var, "{age!int:22, age11!long:22, result:-9999, aaaa:aa}", prodId, businessNum, sysSource, false);
////		System.out.println(map);
//		Object x = "5,6666";
//		Object y = JueCeFanc.convertValue(x, "int");
//		System.out.println(y);
//	}
//}
