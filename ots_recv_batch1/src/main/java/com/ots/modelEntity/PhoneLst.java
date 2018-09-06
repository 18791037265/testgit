package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class PhoneLst implements java.io.Serializable {
	@XmlElement(name = "手机号命中虚假号码库") 	
	private double ext_mobile_falsenumber = -999999;
	@XmlElement(name = "手机号命中通信小号库") 	
	private double ext_mobile_smallnumber = -999999;
	@XmlElement(name = "手机号命中欠款公司法人代表名单") 	
	private double ext_mobile_companyowing = -999999;
	@XmlElement(name = "手机号命中信贷逾期名单") 	
	private double ext_mobile_overdue = -999999;
	@XmlElement(name = "手机号命中信贷逾期后还款名单") 	
	private double ext_mobile_overdue_back = -999999;
	@XmlElement(name = "手机号命中车辆租赁违约名单") 	
	private double ext_mobile_carrental = -999999;
	@XmlElement(name = "手机号命中高风险关注名单") 	
	private double ext_mobile_highrisk = -999999;

	    /********** constructors ***********/
    public PhoneLst() {
     
    }
   
    public PhoneLst( double ext_mobile_falsenumber, double ext_mobile_smallnumber, double ext_mobile_companyowing, double ext_mobile_overdue, double ext_mobile_overdue_back, double ext_mobile_carrental, double ext_mobile_highrisk) {
        this.ext_mobile_falsenumber = ext_mobile_falsenumber;
        this.ext_mobile_smallnumber = ext_mobile_smallnumber;
        this.ext_mobile_companyowing = ext_mobile_companyowing;
        this.ext_mobile_overdue = ext_mobile_overdue;
        this.ext_mobile_overdue_back = ext_mobile_overdue_back;
        this.ext_mobile_carrental = ext_mobile_carrental;
        this.ext_mobile_highrisk = ext_mobile_highrisk;
    }
	
	/**
	 *方法: 取得手机号命中虚假号码库
	 *@return: double 手机号命中虚假号码库
	 */
	
	public double getExt_mobile_falsenumber(){
		return this.ext_mobile_falsenumber;
	}

	/**
	 *方法: 设置手机号命中虚假号码库
	 *@param: double 手机号命中虚假号码库
	 */
	public void setExt_mobile_falsenumber(double ext_mobile_falsenumber){
		this.ext_mobile_falsenumber = ext_mobile_falsenumber;
	}
	/**
	 *方法: 取得手机号命中通信小号库
	 *@return: double 手机号命中通信小号库
	 */
	
	public double getExt_mobile_smallnumber(){
		return this.ext_mobile_smallnumber;
	}

	/**
	 *方法: 设置手机号命中通信小号库
	 *@param: double 手机号命中通信小号库
	 */
	public void setExt_mobile_smallnumber(double ext_mobile_smallnumber){
		this.ext_mobile_smallnumber = ext_mobile_smallnumber;
	}
	/**
	 *方法: 取得手机号命中欠款公司法人代表名单
	 *@return: double 手机号命中欠款公司法人代表名单
	 */
	
	public double getExt_mobile_companyowing(){
		return this.ext_mobile_companyowing;
	}

	/**
	 *方法: 设置手机号命中欠款公司法人代表名单
	 *@param: double 手机号命中欠款公司法人代表名单
	 */
	public void setExt_mobile_companyowing(double ext_mobile_companyowing){
		this.ext_mobile_companyowing = ext_mobile_companyowing;
	}
	/**
	 *方法: 取得手机号命中信贷逾期名单
	 *@return: double 手机号命中信贷逾期名单
	 */
	
	public double getExt_mobile_overdue(){
		return this.ext_mobile_overdue;
	}

	/**
	 *方法: 设置手机号命中信贷逾期名单
	 *@param: double 手机号命中信贷逾期名单
	 */
	public void setExt_mobile_overdue(double ext_mobile_overdue){
		this.ext_mobile_overdue = ext_mobile_overdue;
	}
	/**
	 *方法: 取得手机号命中信贷逾期后还款名单
	 *@return: double 手机号命中信贷逾期后还款名单
	 */
	
	public double getExt_mobile_overdue_back(){
		return this.ext_mobile_overdue_back;
	}

	/**
	 *方法: 设置手机号命中信贷逾期后还款名单
	 *@param: double 手机号命中信贷逾期后还款名单
	 */
	public void setExt_mobile_overdue_back(double ext_mobile_overdue_back){
		this.ext_mobile_overdue_back = ext_mobile_overdue_back;
	}
	/**
	 *方法: 取得手机号命中车辆租赁违约名单
	 *@return: double 手机号命中车辆租赁违约名单
	 */
	
	public double getExt_mobile_carrental(){
		return this.ext_mobile_carrental;
	}

	/**
	 *方法: 设置手机号命中车辆租赁违约名单
	 *@param: double 手机号命中车辆租赁违约名单
	 */
	public void setExt_mobile_carrental(double ext_mobile_carrental){
		this.ext_mobile_carrental = ext_mobile_carrental;
	}
	/**
	 *方法: 取得手机号命中高风险关注名单
	 *@return: double 手机号命中高风险关注名单
	 */
	
	public double getExt_mobile_highrisk(){
		return this.ext_mobile_highrisk;
	}

	/**
	 *方法: 设置手机号命中高风险关注名单
	 *@param: double 手机号命中高风险关注名单
	 */
	public void setExt_mobile_highrisk(double ext_mobile_highrisk){
		this.ext_mobile_highrisk = ext_mobile_highrisk;
	}
}
