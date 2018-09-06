package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class Zfjk implements java.io.Serializable {
	@XmlElement(name = "反馈方") 	
	private String zf_companyCode = "-999999";
	@XmlElement(name = "当前状态") 	
	private String zf_repayState = "-999999";
	@XmlElement(name = "借款状态") 	
	private String zf_borrowState = "-999999";
	@XmlElement(name = "欠款金额") 	
	private double zf_arrearsAmount = -999999;

	    /********** constructors ***********/
    public Zfjk() {
     
    }
   
    public Zfjk( String zf_companyCode, String zf_repayState, String zf_borrowState, double zf_arrearsAmount) {
        this.zf_companyCode = zf_companyCode;
        this.zf_repayState = zf_repayState;
        this.zf_borrowState = zf_borrowState;
        this.zf_arrearsAmount = zf_arrearsAmount;
    }
	
	/**
	 *方法: 取得反馈方
	 *@return: String 反馈方
	 */
	
	public String getZf_companyCode(){
		return this.zf_companyCode;
	}

	/**
	 *方法: 设置反馈方
	 *@param: String 反馈方
	 */
	public void setZf_companyCode(String zf_companyCode){
		this.zf_companyCode = zf_companyCode;
	}
	/**
	 *方法: 取得当前状态
	 *@return: String 当前状态
	 */
	
	public String getZf_repayState(){
		return this.zf_repayState;
	}

	/**
	 *方法: 设置当前状态
	 *@param: String 当前状态
	 */
	public void setZf_repayState(String zf_repayState){
		this.zf_repayState = zf_repayState;
	}
	/**
	 *方法: 取得借款状态
	 *@return: String 借款状态
	 */
	
	public String getZf_borrowState(){
		return this.zf_borrowState;
	}

	/**
	 *方法: 设置借款状态
	 *@param: String 借款状态
	 */
	public void setZf_borrowState(String zf_borrowState){
		this.zf_borrowState = zf_borrowState;
	}
	/**
	 *方法: 取得欠款金额
	 *@return: double 欠款金额
	 */
	
	public double getZf_arrearsAmount(){
		return this.zf_arrearsAmount;
	}

	/**
	 *方法: 设置欠款金额
	 *@param: double 欠款金额
	 */
	public void setZf_arrearsAmount(double zf_arrearsAmount){
		this.zf_arrearsAmount = zf_arrearsAmount;
	}
}
