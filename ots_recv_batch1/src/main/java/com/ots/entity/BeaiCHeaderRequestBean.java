package com.ots.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Beai 公共请求报文头实体类
 * 报文长度：317
 * @author 10435
 *
 */

public class BeaiCHeaderRequestBean {
	//所属机构（必填）
	private String bankCode;
	//交易码（必填）
	private String tranCode;
	//交易日期（必填）
	private String tranDate;
	//操作柜员（必填）
	private String teller;
	//授权柜员
	private String author;
	//授权密码
	private String authPwd;
	//平台日期
	private String beaiDate;
	//平台系统时间
	private String beaiTime;
	//平台流水号
	private String beaiTranCode;
	//平台响应码
	private String beaiResCode;
	//平台错误信息
	private String beaiErrMsg;
	//外围参考号
	private String reqSysCode;
	//终端号码
	private String tellerSysCode;
	//机构号:华夏银行003
	private String branchCode;
	//分行号
	private String subBankCode;
	//工作站号码
	private String tellerSubBankCode;
	//应答交易流水号
	private String beaiResTranCode;
	//核心应答日期
	private String beaiResCoreDate;
	//备用字段
	private String bak;
	//字段长度
	private int[] msgLen = {8,10,8,6,6,8,8,6,16,6,65,12,6,3,4,3,6,8,128};
	
	private String[] msgType = {"C","C","C","C","C","C","C","C","C","C","C","C","C","C","C","C","C","C","C"};
	
	public BeaiCHeaderRequestBean() {
		this.tranDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		this.beaiResTranCode = "000000";
		this.beaiResCoreDate = "00000000";
		//this.reqSysCode = sysMillis.substring(6)+"39"+"749";
		
		
	}
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getTranCode() {
		return tranCode;
	}
	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getTeller() {
		return teller;
	}
	public void setTeller(String teller) {
		this.teller = teller;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthPwd() {
		return authPwd;
	}
	public void setAuthPwd(String authPwd) {
		this.authPwd = authPwd;
	}
	public String getBeaiDate() {
		return beaiDate;
	}
	public void setBeaiDate(String beaiDate) {
		this.beaiDate = beaiDate;
	}
	public String getBeaiTime() {
		return beaiTime;
	}
	public void setBeaiTime(String beaiTime) {
		this.beaiTime = beaiTime;
	}
	public String getBeaiTranCode() {
		return beaiTranCode;
	}
	public void setBeaiTranCode(String beaiTranCode) {
		this.beaiTranCode = beaiTranCode;
	}
	public String getBeaiResCode() {
		return beaiResCode;
	}
	public void setBeaiResCode(String beaiResCode) {
		this.beaiResCode = beaiResCode;
	}
	public String getBeaiErrMsg() {
		return beaiErrMsg;
	}
	public void setBeaiErrMsg(String beaiErrMsg) {
		this.beaiErrMsg = beaiErrMsg;
	}
	public String getReqSysCode() {
		return reqSysCode;
	}
	public void setReqSysCode(String reqSysCode) {
		this.reqSysCode = reqSysCode;
	}
	public String getTellerSysCode() {
		return tellerSysCode;
	}
	public void setTellerSysCode(String tellerSysCode) {
		this.tellerSysCode = tellerSysCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getSubBankCode() {
		return subBankCode;
	}
	public void setSubBankCode(String subBankCode) {
		this.subBankCode = subBankCode;
	}
	public String getTellerSubBankCode() {
		return tellerSubBankCode;
	}
	public void setTellerSubBankCode(String tellerSubBankCode) {
		this.tellerSubBankCode = tellerSubBankCode;
	}
	public String getBeaiResTranCode() {
		return beaiResTranCode;
	}
	public void setBeaiResTranCode(String beaiResTranCode) {
		this.beaiResTranCode = beaiResTranCode;
	}
	
	public String getBeaiResCoreDate() {
		return beaiResCoreDate;
	}
	public void setBeaiResCoreDate(String beaiResCoreDate) {
		this.beaiResCoreDate = beaiResCoreDate;
	}
	public String getBak() {
		return bak;
	}
	public void setBak(String bak) {
		this.bak = bak;
	}
	public int[] getMsgLen() {
		return msgLen;
	}
	public String[] getMsgType() {
		return msgType;
	}
	
	
}
