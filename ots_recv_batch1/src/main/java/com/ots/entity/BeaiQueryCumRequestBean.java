package com.ots.entity;

//540008 客户基本信息查询
public class BeaiQueryCumRequestBean {
	// 客户号/帐号
	private String account;
	// 选项
	private String option;
	// 起始序号
	private String startNumber;
	// 提示码
	private String promotionNo;
	// 客户/帐号标志
	private String customerFlag;
	// 产品组
	private String productGroup;
	// 证件号码
	private String iDNo;
	// 证件类型
	private String iDType;
	// 公共报文
	private BeaiCHeaderRequestBean requestHeader;
	// 报文长度
	private int[] msgLen = { 22, 1, 3, 3, 1, 1, 24, 2 };
	// 报文类型
	private String[] msgType = { "C", "C", "N", "N", "C", "C", "C", "C" };
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getStartNumber() {
		return startNumber;
	}
	public void setStartNumber(String startNumber) {
		this.startNumber = startNumber;
	}
	public String getPromotionNo() {
		return promotionNo;
	}
	public void setPromotionNo(String promotionNo) {
		this.promotionNo = promotionNo;
	}
	public String getCustomerFlag() {
		return customerFlag;
	}
	public void setCustomerFlag(String customerFlag) {
		this.customerFlag = customerFlag;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getIDNo() {
		return iDNo;
	}
	public void setIDNo(String iDNo) {
		this.iDNo = iDNo;
	}
	public String getIDType() {
		return iDType;
	}
	public void setIDType(String iDType) {
		this.iDType = iDType;
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
	public void setMsgLen(int[] msgLen) {
		this.msgLen = msgLen;
	}
	public String[] getMsgType() {
		return msgType;
	}
	public void setMsgType(String[] msgType) {
		this.msgType = msgType;
	}
	
}
