package com.test;

import com.cmx.vtools.VTools;

public class Test {
	
	public static void main(String[] args) throws Exception{
		VTools vt = new VTools();
		vt.run("TAB(abs_biz_info{pre_pact_no:201806290182492919A})");
		vt.printMap();
		String str = vt.getStr("<#if !(t?exists) || !(t.abs_biz_info?exists) || !(t.abs_biz_info.status?exists)>表不存在<#else>${t.abs_biz_info.status}</#if>");
		System.out.println(str);
	}
}
