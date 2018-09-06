package com.ots.entity;
/***
 * 
 * 反欺诈返回信息类
 * 
 * */
public class DsCommRespBean {
	//返回码   响应码
	private String respCode;
	//返回结果描述
	private String respDesc;
	//返回结果内容
	private String respContent;
	
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	public String getRespContent() {
		return respContent;
	}
	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}
	
	
}
