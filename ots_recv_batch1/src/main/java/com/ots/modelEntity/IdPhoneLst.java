package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class IdPhoneLst implements java.io.Serializable {
	@XmlElement(name = "3个月内申请人身份证关联配偶手机数大于等于2") 	
	private double ext_threemonths_id_spousephone = -999999;
	@XmlElement(name = "3个月内申请人身份证关联父亲手机数大于等于2") 	
	private double ext_threemonths_id_fatherphone = -999999;
	@XmlElement(name = "3个月内申请人身份证关联母亲手机数大于等于2") 	
	private double ext_threemonths_id_motherphone = -999999;
	@XmlElement(name = "3个月内申请人身份证作为联系人身份证出现的次数大于等于3") 	
	private double ext_threemonths_id_contact_id = -999999;
	@XmlElement(name = "3个月内申请人手机号作为联系人手机号出现的次数大于等于3") 	
	private double ext_threemonths_phone_contact_number = -999999;
	@XmlElement(name = "3个月内身份证关联多个申请信息") 	
	private double ext_threemonths_id_information = -999999;
	@XmlElement(name = "3个月内手机号关联多个身份证") 	
	private double ext_threemonths_mobile_information = -999999;
	@XmlElement(name = "7天内身份证或手机号本应用申请次数过多") 	
	private double ext_sevendays_id_number = -999999;
	@XmlElement(name = "1个月内设备或身份证或手机号本应用申请次数过多") 	
	private double ext_month_id_number = -999999;
	@XmlElement(name = "近1个月本应用身份证夜间申请占申请总数的比例") 	
	private double ext_month_id_night_ratio = -999999;

	    /********** constructors ***********/
    public IdPhoneLst() {
     
    }
   
    public IdPhoneLst( double ext_threemonths_id_spousephone, double ext_threemonths_id_fatherphone, double ext_threemonths_id_motherphone, double ext_threemonths_id_contact_id, double ext_threemonths_phone_contact_number, double ext_threemonths_id_information, double ext_threemonths_mobile_information, double ext_sevendays_id_number, double ext_month_id_number, double ext_month_id_night_ratio) {
        this.ext_threemonths_id_spousephone = ext_threemonths_id_spousephone;
        this.ext_threemonths_id_fatherphone = ext_threemonths_id_fatherphone;
        this.ext_threemonths_id_motherphone = ext_threemonths_id_motherphone;
        this.ext_threemonths_id_contact_id = ext_threemonths_id_contact_id;
        this.ext_threemonths_phone_contact_number = ext_threemonths_phone_contact_number;
        this.ext_threemonths_id_information = ext_threemonths_id_information;
        this.ext_threemonths_mobile_information = ext_threemonths_mobile_information;
        this.ext_sevendays_id_number = ext_sevendays_id_number;
        this.ext_month_id_number = ext_month_id_number;
        this.ext_month_id_night_ratio = ext_month_id_night_ratio;
    }
	
	/**
	 *方法: 取得3个月内申请人身份证关联配偶手机数大于等于2
	 *@return: double 3个月内申请人身份证关联配偶手机数大于等于2
	 */
	
	public double getExt_threemonths_id_spousephone(){
		return this.ext_threemonths_id_spousephone;
	}

	/**
	 *方法: 设置3个月内申请人身份证关联配偶手机数大于等于2
	 *@param: double 3个月内申请人身份证关联配偶手机数大于等于2
	 */
	public void setExt_threemonths_id_spousephone(double ext_threemonths_id_spousephone){
		this.ext_threemonths_id_spousephone = ext_threemonths_id_spousephone;
	}
	/**
	 *方法: 取得3个月内申请人身份证关联父亲手机数大于等于2
	 *@return: double 3个月内申请人身份证关联父亲手机数大于等于2
	 */
	
	public double getExt_threemonths_id_fatherphone(){
		return this.ext_threemonths_id_fatherphone;
	}

	/**
	 *方法: 设置3个月内申请人身份证关联父亲手机数大于等于2
	 *@param: double 3个月内申请人身份证关联父亲手机数大于等于2
	 */
	public void setExt_threemonths_id_fatherphone(double ext_threemonths_id_fatherphone){
		this.ext_threemonths_id_fatherphone = ext_threemonths_id_fatherphone;
	}
	/**
	 *方法: 取得3个月内申请人身份证关联母亲手机数大于等于2
	 *@return: double 3个月内申请人身份证关联母亲手机数大于等于2
	 */
	
	public double getExt_threemonths_id_motherphone(){
		return this.ext_threemonths_id_motherphone;
	}

	/**
	 *方法: 设置3个月内申请人身份证关联母亲手机数大于等于2
	 *@param: double 3个月内申请人身份证关联母亲手机数大于等于2
	 */
	public void setExt_threemonths_id_motherphone(double ext_threemonths_id_motherphone){
		this.ext_threemonths_id_motherphone = ext_threemonths_id_motherphone;
	}
	/**
	 *方法: 取得3个月内申请人身份证作为联系人身份证出现的次数大于等于3
	 *@return: double 3个月内申请人身份证作为联系人身份证出现的次数大于等于3
	 */
	
	public double getExt_threemonths_id_contact_id(){
		return this.ext_threemonths_id_contact_id;
	}

	/**
	 *方法: 设置3个月内申请人身份证作为联系人身份证出现的次数大于等于3
	 *@param: double 3个月内申请人身份证作为联系人身份证出现的次数大于等于3
	 */
	public void setExt_threemonths_id_contact_id(double ext_threemonths_id_contact_id){
		this.ext_threemonths_id_contact_id = ext_threemonths_id_contact_id;
	}
	/**
	 *方法: 取得3个月内申请人手机号作为联系人手机号出现的次数大于等于3
	 *@return: double 3个月内申请人手机号作为联系人手机号出现的次数大于等于3
	 */
	
	public double getExt_threemonths_phone_contact_number(){
		return this.ext_threemonths_phone_contact_number;
	}

	/**
	 *方法: 设置3个月内申请人手机号作为联系人手机号出现的次数大于等于3
	 *@param: double 3个月内申请人手机号作为联系人手机号出现的次数大于等于3
	 */
	public void setExt_threemonths_phone_contact_number(double ext_threemonths_phone_contact_number){
		this.ext_threemonths_phone_contact_number = ext_threemonths_phone_contact_number;
	}
	/**
	 *方法: 取得3个月内身份证关联多个申请信息
	 *@return: double 3个月内身份证关联多个申请信息
	 */
	
	public double getExt_threemonths_id_information(){
		return this.ext_threemonths_id_information;
	}

	/**
	 *方法: 设置3个月内身份证关联多个申请信息
	 *@param: double 3个月内身份证关联多个申请信息
	 */
	public void setExt_threemonths_id_information(double ext_threemonths_id_information){
		this.ext_threemonths_id_information = ext_threemonths_id_information;
	}
	/**
	 *方法: 取得3个月内手机号关联多个身份证
	 *@return: double 3个月内手机号关联多个身份证
	 */
	
	public double getExt_threemonths_mobile_information(){
		return this.ext_threemonths_mobile_information;
	}

	/**
	 *方法: 设置3个月内手机号关联多个身份证
	 *@param: double 3个月内手机号关联多个身份证
	 */
	public void setExt_threemonths_mobile_information(double ext_threemonths_mobile_information){
		this.ext_threemonths_mobile_information = ext_threemonths_mobile_information;
	}
	/**
	 *方法: 取得7天内身份证或手机号本应用申请次数过多
	 *@return: double 7天内身份证或手机号本应用申请次数过多
	 */
	
	public double getExt_sevendays_id_number(){
		return this.ext_sevendays_id_number;
	}

	/**
	 *方法: 设置7天内身份证或手机号本应用申请次数过多
	 *@param: double 7天内身份证或手机号本应用申请次数过多
	 */
	public void setExt_sevendays_id_number(double ext_sevendays_id_number){
		this.ext_sevendays_id_number = ext_sevendays_id_number;
	}
	/**
	 *方法: 取得1个月内设备或身份证或手机号本应用申请次数过多
	 *@return: double 1个月内设备或身份证或手机号本应用申请次数过多
	 */
	
	public double getExt_month_id_number(){
		return this.ext_month_id_number;
	}

	/**
	 *方法: 设置1个月内设备或身份证或手机号本应用申请次数过多
	 *@param: double 1个月内设备或身份证或手机号本应用申请次数过多
	 */
	public void setExt_month_id_number(double ext_month_id_number){
		this.ext_month_id_number = ext_month_id_number;
	}
	/**
	 *方法: 取得近1个月本应用身份证夜间申请占申请总数的比例
	 *@return: double 近1个月本应用身份证夜间申请占申请总数的比例
	 */
	
	public double getExt_month_id_night_ratio(){
		return this.ext_month_id_night_ratio;
	}

	/**
	 *方法: 设置近1个月本应用身份证夜间申请占申请总数的比例
	 *@param: double 近1个月本应用身份证夜间申请占申请总数的比例
	 */
	public void setExt_month_id_night_ratio(double ext_month_id_night_ratio){
		this.ext_month_id_night_ratio = ext_month_id_night_ratio;
	}
}
