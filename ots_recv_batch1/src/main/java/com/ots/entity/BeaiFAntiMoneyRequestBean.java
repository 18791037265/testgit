package com.ots.entity;

public class BeaiFAntiMoneyRequestBean extends BeaICommBean{
	//
	private String trsNo;
	//客户名称
	private String name;
	//证件号码
	private String certNo;
	//证件类型
	private String certType;
	//公共报文头
	private BeaiCHeaderRequestBean requestHeader;
	int[] msgLen = {4,200,60,48};
	String[] msgType = {"C","C","C","C"};
	
	public String getTrsNo() {
		return trsNo;
	}
	public void setTrsNo(String trsNo) {
		this.trsNo = trsNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public BeaiCHeaderRequestBean getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(BeaiCHeaderRequestBean requestHeader) {
		this.requestHeader = requestHeader;
	}
	public int[] getMsgLen() {
		return msgLen;
	}
	public String[] getMsgType() {
		return msgType;
	}
	
	
}
