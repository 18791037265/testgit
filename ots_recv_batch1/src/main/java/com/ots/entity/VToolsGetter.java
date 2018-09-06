package com.ots.entity;

import com.cmx.vtools.VTools;

public class VToolsGetter {
	private static VTools instance=null;
	private VToolsGetter() {}
	public static VTools getInstance(){
		if(instance==null)
			instance=new VTools();
		return instance;
	}
	
}

