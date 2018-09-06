package com.ots.entity;

public class BeaICommBean {
	private int[] msgLen = {};
	private String[] msgType = {};
	private BeaiCHeaderRequestBean requestHeader;
	
	public BeaICommBean() {
		requestHeader = new BeaiCHeaderRequestBean();
	}
	public int[] getMsgLen() {
		return msgLen;
	}
	public void setMsgLen(int[] msgLen) {
		this.msgLen = msgLen;
	}
	public String[] getMsgType() {
		return msgType;
	}
	public void setMsgType(String[] msgType) {
		this.msgType = msgType;
	}
	public BeaiCHeaderRequestBean getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(BeaiCHeaderRequestBean requestHeader) {
		this.requestHeader = requestHeader;
	}
	
	
	
}
