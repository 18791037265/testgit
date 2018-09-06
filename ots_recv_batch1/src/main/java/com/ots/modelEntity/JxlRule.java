package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class JxlRule implements java.io.Serializable {
	@XmlElement(name = "审批结果") 	
	private String result = "-999999";
	@XmlElement(name = "拒绝原因") 	
	private List<String> reason = new ArrayList<String>();
	@XmlElement(name = "身份证有效") 	
	private String jx_user_basic_user_idcard_valid = "-999999";
	@XmlElement(name = "姓名和手机号黑名单") 	
	private String jx_user_blacklist_blacklist_name_with_phone = "-999999";
	@XmlElement(name = "姓名和身份证号黑名单") 	
	private String jx_user_blacklist_blacklist_name_with_idcard = "-999999";
	@XmlElement(name = "灰度分") 	
	private double jx_user_gray_phone_gray_score = -999999;
	@XmlElement(name = "主动联系黑号数") 	
	private int jx_user_gray_contacts_number_statistic_cnt_to_black = -999999;
	@XmlElement(name = "被动联系黑号数") 	
	private int jx_user_gray_contacts_number_statistic_cnt_be_black = -999999;
	@XmlElement(name = "270天内查询机构数") 	
	private int jx_user_searched_history_by_day_m_9_cnt_org = -999999;
	@XmlElement(name = "是否准入") 	
	private String admit = "-999999";
	@XmlElement(name = "拒绝码") 	
	private String refuseCode = "-999999";
	@XmlElement(name = "拒绝描述") 	
	private String refuseMsg = "-999999";

	    /********** constructors ***********/
    public JxlRule() {
     
    }
   
    public JxlRule( String result, List<String> reason, String jx_user_basic_user_idcard_valid, String jx_user_blacklist_blacklist_name_with_phone, String jx_user_blacklist_blacklist_name_with_idcard, double jx_user_gray_phone_gray_score, int jx_user_gray_contacts_number_statistic_cnt_to_black, int jx_user_gray_contacts_number_statistic_cnt_be_black, int jx_user_searched_history_by_day_m_9_cnt_org, String admit, String refuseCode, String refuseMsg) {
        this.result = result;
        this.reason = reason;
        this.jx_user_basic_user_idcard_valid = jx_user_basic_user_idcard_valid;
        this.jx_user_blacklist_blacklist_name_with_phone = jx_user_blacklist_blacklist_name_with_phone;
        this.jx_user_blacklist_blacklist_name_with_idcard = jx_user_blacklist_blacklist_name_with_idcard;
        this.jx_user_gray_phone_gray_score = jx_user_gray_phone_gray_score;
        this.jx_user_gray_contacts_number_statistic_cnt_to_black = jx_user_gray_contacts_number_statistic_cnt_to_black;
        this.jx_user_gray_contacts_number_statistic_cnt_be_black = jx_user_gray_contacts_number_statistic_cnt_be_black;
        this.jx_user_searched_history_by_day_m_9_cnt_org = jx_user_searched_history_by_day_m_9_cnt_org;
        this.admit = admit;
        this.refuseCode = refuseCode;
        this.refuseMsg = refuseMsg;
    }
	
	/**
	 *方法: 取得审批结果
	 *@return: String 审批结果
	 */
	
	public String getResult(){
		return this.result;
	}

	/**
	 *方法: 设置审批结果
	 *@param: String 审批结果
	 */
	public void setResult(String result){
		this.result = result;
	}
	/**
	 *方法: 取得拒绝原因
	 *@return: List<String> 拒绝原因
	 */
	
	public List<String> getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置拒绝原因
	 *@param: List<String> 拒绝原因
	 */
	public void setReason(List<String> reason){
		this.reason = reason;
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
	 *方法: 取得灰度分
	 *@return: double 灰度分
	 */
	
	public double getJx_user_gray_phone_gray_score(){
		return this.jx_user_gray_phone_gray_score;
	}

	/**
	 *方法: 设置灰度分
	 *@param: double 灰度分
	 */
	public void setJx_user_gray_phone_gray_score(double jx_user_gray_phone_gray_score){
		this.jx_user_gray_phone_gray_score = jx_user_gray_phone_gray_score;
	}
	/**
	 *方法: 取得主动联系黑号数
	 *@return: int 主动联系黑号数
	 */
	
	public int getJx_user_gray_contacts_number_statistic_cnt_to_black(){
		return this.jx_user_gray_contacts_number_statistic_cnt_to_black;
	}

	/**
	 *方法: 设置主动联系黑号数
	 *@param: int 主动联系黑号数
	 */
	public void setJx_user_gray_contacts_number_statistic_cnt_to_black(int jx_user_gray_contacts_number_statistic_cnt_to_black){
		this.jx_user_gray_contacts_number_statistic_cnt_to_black = jx_user_gray_contacts_number_statistic_cnt_to_black;
	}
	/**
	 *方法: 取得被动联系黑号数
	 *@return: int 被动联系黑号数
	 */
	
	public int getJx_user_gray_contacts_number_statistic_cnt_be_black(){
		return this.jx_user_gray_contacts_number_statistic_cnt_be_black;
	}

	/**
	 *方法: 设置被动联系黑号数
	 *@param: int 被动联系黑号数
	 */
	public void setJx_user_gray_contacts_number_statistic_cnt_be_black(int jx_user_gray_contacts_number_statistic_cnt_be_black){
		this.jx_user_gray_contacts_number_statistic_cnt_be_black = jx_user_gray_contacts_number_statistic_cnt_be_black;
	}
	/**
	 *方法: 取得270天内查询机构数
	 *@return: int 270天内查询机构数
	 */
	
	public int getJx_user_searched_history_by_day_m_9_cnt_org(){
		return this.jx_user_searched_history_by_day_m_9_cnt_org;
	}

	/**
	 *方法: 设置270天内查询机构数
	 *@param: int 270天内查询机构数
	 */
	public void setJx_user_searched_history_by_day_m_9_cnt_org(int jx_user_searched_history_by_day_m_9_cnt_org){
		this.jx_user_searched_history_by_day_m_9_cnt_org = jx_user_searched_history_by_day_m_9_cnt_org;
	}
	/**
	 *方法: 取得是否准入
	 *@return: String 是否准入
	 */
	
	public String getAdmit(){
		return this.admit;
	}

	/**
	 *方法: 设置是否准入
	 *@param: String 是否准入
	 */
	public void setAdmit(String admit){
		this.admit = admit;
	}
	/**
	 *方法: 取得拒绝码
	 *@return: String 拒绝码
	 */
	
	public String getRefuseCode(){
		return this.refuseCode;
	}

	/**
	 *方法: 设置拒绝码
	 *@param: String 拒绝码
	 */
	public void setRefuseCode(String refuseCode){
		this.refuseCode = refuseCode;
	}
	/**
	 *方法: 取得拒绝描述
	 *@return: String 拒绝描述
	 */
	
	public String getRefuseMsg(){
		return this.refuseMsg;
	}

	/**
	 *方法: 设置拒绝描述
	 *@param: String 拒绝描述
	 */
	public void setRefuseMsg(String refuseMsg){
		this.refuseMsg = refuseMsg;
	}
}
