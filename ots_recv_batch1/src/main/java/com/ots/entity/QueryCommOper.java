package com.ots.entity;

/**
 *  
 * @author hzhx
 *
 */
public class QueryCommOper {
	//证件号
	private String certNo;
	//姓名
	private String name;
	//联系方式
	private String mobile;
	//接口类别
	private String api_type;
	//合作伙伴号
	private String bpIdent;
	
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getApi_type() {
		return api_type;
	}
	public void setApi_type(String api_type) {
		this.api_type = api_type;
	}
	public String getBpIdent() {
		return bpIdent;
	}
	public void setBpIdent(String bpIdent) {
		this.bpIdent = bpIdent;
	}
	
	
	
}