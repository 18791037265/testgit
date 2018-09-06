package com.ots.entity;

public class BeaiCommonResponseBean {
	private String respCode;
	private String respDesc;
	private BeaiCHeaderRequestBean requestHeader;
	//业务报文json
	private String responseBody;
	private byte[] beaiResponse;
	
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
	public BeaiCHeaderRequestBean getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(BeaiCHeaderRequestBean requestHeader) {
		this.requestHeader = requestHeader;
	}
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	public byte[] getBeaiResponse() {
		return beaiResponse;
	}
	public void setBeaiResponse(byte[] beaiResponse) {
		this.beaiResponse = beaiResponse;
	}
	
}
