package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class JxDerive implements java.io.Serializable {
	@XmlElement(name = "身份证有效") 	
	private String jx_user_basic_user_idcard_valid = "-999999";
	@XmlElement(name = "姓名和手机号黑名单") 	
	private String jx_user_blacklist_blacklist_name_with_phone = "-999999";
	@XmlElement(name = "姓名和身份证号黑名单") 	
	private String jx_user_blacklist_blacklist_name_with_idcard = "-999999";
	@XmlElement(name = "芝麻申请单号") 	
	private String zm_applyNo = "-999999";
	@XmlElement(name = "被通话时间") 	
	private long jx_user_gray_contacts_rfm_recent_time_be_all = -999999;
	@XmlElement(name = "最近被通话时间差") 	
	private int jx_passive_recent_time = -999999;

	    /********** constructors ***********/
    public JxDerive() {
     
    }
   
    public JxDerive( String jx_user_basic_user_idcard_valid, String jx_user_blacklist_blacklist_name_with_phone, String jx_user_blacklist_blacklist_name_with_idcard, String zm_applyNo, long jx_user_gray_contacts_rfm_recent_time_be_all, int jx_passive_recent_time) {
        this.jx_user_basic_user_idcard_valid = jx_user_basic_user_idcard_valid;
        this.jx_user_blacklist_blacklist_name_with_phone = jx_user_blacklist_blacklist_name_with_phone;
        this.jx_user_blacklist_blacklist_name_with_idcard = jx_user_blacklist_blacklist_name_with_idcard;
        this.zm_applyNo = zm_applyNo;
        this.jx_user_gray_contacts_rfm_recent_time_be_all = jx_user_gray_contacts_rfm_recent_time_be_all;
        this.jx_passive_recent_time = jx_passive_recent_time;
    }
	
	/**
	 *方法: 取得身份证有效
	 *@return: String 身份证有效
	 */
	
	public String getJx_user_basic_user_idcard_valid(){
		return this.jx_user_basic_user_idcard_valid;
	}

	/**
	 *方法: 设置身份证有效
	 *@param: String 身份证有效
	 */
	public void setJx_user_basic_user_idcard_valid(String jx_user_basic_user_idcard_valid){
		this.jx_user_basic_user_idcard_valid = jx_user_basic_user_idcard_valid;
	}
	/**
	 *方法: 取得姓名和手机号黑名单
	 *@return: String 姓名和手机号黑名单
	 */
	
	public String getJx_user_blacklist_blacklist_name_with_phone(){
		return this.jx_user_blacklist_blacklist_name_with_phone;
	}

	/**
	 *方法: 设置姓名和手机号黑名单
	 *@param: String 姓名和手机号黑名单
	 */
	public void setJx_user_blacklist_blacklist_name_with_phone(String jx_user_blacklist_blacklist_name_with_phone){
		this.jx_user_blacklist_blacklist_name_with_phone = jx_user_blacklist_blacklist_name_with_phone;
	}
	/**
	 *方法: 取得姓名和身份证号黑名单
	 *@return: String 姓名和身份证号黑名单
	 */
	
	public String getJx_user_blacklist_blacklist_name_with_idcard(){
		return this.jx_user_blacklist_blacklist_name_with_idcard;
	}

	/**
	 *方法: 设置姓名和身份证号黑名单
	 *@param: String 姓名和身份证号黑名单
	 */
	public void setJx_user_blacklist_blacklist_name_with_idcard(String jx_user_blacklist_blacklist_name_with_idcard){
		this.jx_user_blacklist_blacklist_name_with_idcard = jx_user_blacklist_blacklist_name_with_idcard;
	}
	/**
	 *方法: 取得芝麻申请单号
	 *@return: String 芝麻申请单号
	 */
	
	public String getZm_applyNo(){
		return this.zm_applyNo;
	}

	/**
	 *方法: 设置芝麻申请单号
	 *@param: String 芝麻申请单号
	 */
	public void setZm_applyNo(String zm_applyNo){
		this.zm_applyNo = zm_applyNo;
	}
	/**
	 *方法: 取得被通话时间
	 *@return: long 被通话时间
	 */
	
	public long getJx_user_gray_contacts_rfm_recent_time_be_all(){
		return this.jx_user_gray_contacts_rfm_recent_time_be_all;
	}

	/**
	 *方法: 设置被通话时间
	 *@param: long 被通话时间
	 */
	public void setJx_user_gray_contacts_rfm_recent_time_be_all(long jx_user_gray_contacts_rfm_recent_time_be_all){
		this.jx_user_gray_contacts_rfm_recent_time_be_all = jx_user_gray_contacts_rfm_recent_time_be_all;
	}
	/**
	 *方法: 取得最近被通话时间差
	 *@return: int 最近被通话时间差
	 */
	
	public int getJx_passive_recent_time(){
		return this.jx_passive_recent_time;
	}

	/**
	 *方法: 设置最近被通话时间差
	 *@param: int 最近被通话时间差
	 */
	public void setJx_passive_recent_time(int jx_passive_recent_time){
		this.jx_passive_recent_time = jx_passive_recent_time;
	}
}
