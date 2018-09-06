package com.ots.entity;

import java.io.Serializable;

public class CommonResponse implements Serializable{
	private static final long serialVersionUID = 1L;

	//业务返回码 000000：成功/000001：失败
    private String resultCode;
    
    //业务返回描述
    private String resultMsg;
    
    //业务响应返回json数据
    private String resultContent;
    
	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getResultContent() {
		return resultContent;
	}

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}


	@Override
    public String toString() {
        return "ResponseBody{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMsg='" + resultMsg + '\'' +
                ", resultContent='" + resultContent + '\'' +
                '}';
    }
}
