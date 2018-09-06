package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class JbApplyRule implements java.io.Serializable {
	@XmlElement(name = "证件类型") 	
	private String zm_certType = "-999999";
	@XmlElement(name = "年龄") 	
	private int zm_age = -999999;
	@XmlElement(name = "芝麻分") 	
	private int zm_zmScore = -999999;
	@XmlElement(name = "行业关注名单") 	
	private String zm_is_matched = "-999999";
	@XmlElement(name = "最近六个月主动查询金融机构数") 	
	private int zm_auth_fin_last_6m_cnt = -999999;
	@XmlElement(name = "最近六个月逾期总笔数") 	
	private int zm_ovd_order_cnt_6m = -999999;
	@XmlElement(name = "最近六个月逾期总金额") 	
	private int zm_ovd_order_amt_6m = -999999;
	@XmlElement(name = "审批结果") 	
	private String result = "-999999";
	@XmlElement(name = "拒绝原因") 	
	private List<String> reason = new ArrayList<String>();
	@XmlElement(name = "是否准入") 	
	private String admit = "-999999";
	@XmlElement(name = "拒绝码") 	
	private String refuseCode = "-999999";
	@XmlElement(name = "拒绝描述") 	
	private String refuseMsg = "-999999";

	    /********** constructors ***********/
    public JbApplyRule() {
     
    }
   
    public JbApplyRule( String zm_certType, int zm_age, int zm_zmScore, String zm_is_matched, int zm_auth_fin_last_6m_cnt, int zm_ovd_order_cnt_6m, int zm_ovd_order_amt_6m, String result, List<String> reason, String admit, String refuseCode, String refuseMsg) {
        this.zm_certType = zm_certType;
        this.zm_age = zm_age;
        this.zm_zmScore = zm_zmScore;
        this.zm_is_matched = zm_is_matched;
        this.zm_auth_fin_last_6m_cnt = zm_auth_fin_last_6m_cnt;
        this.zm_ovd_order_cnt_6m = zm_ovd_order_cnt_6m;
        this.zm_ovd_order_amt_6m = zm_ovd_order_amt_6m;
        this.result = result;
        this.reason = reason;
        this.admit = admit;
        this.refuseCode = refuseCode;
        this.refuseMsg = refuseMsg;
    }
	
	/**
	 *方法: 取得证件类型
	 *@return: String 证件类型
	 */
	
	public String getZm_certType(){
		return this.zm_certType;
	}

	/**
	 *方法: 设置证件类型
	 *@param: String 证件类型
	 */
	public void setZm_certType(String zm_certType){
		this.zm_certType = zm_certType;
	}
	/**
	 *方法: 取得年龄
	 *@return: int 年龄
	 */
	
	public int getZm_age(){
		return this.zm_age;
	}

	/**
	 *方法: 设置年龄
	 *@param: int 年龄
	 */
	public void setZm_age(int zm_age){
		this.zm_age = zm_age;
	}
	/**
	 *方法: 取得芝麻分
	 *@return: int 芝麻分
	 */
	
	public int getZm_zmScore(){
		return this.zm_zmScore;
	}

	/**
	 *方法: 设置芝麻分
	 *@param: int 芝麻分
	 */
	public void setZm_zmScore(int zm_zmScore){
		this.zm_zmScore = zm_zmScore;
	}
	/**
	 *方法: 取得行业关注名单
	 *@return: String 行业关注名单
	 */
	
	public String getZm_is_matched(){
		return this.zm_is_matched;
	}

	/**
	 *方法: 设置行业关注名单
	 *@param: String 行业关注名单
	 */
	public void setZm_is_matched(String zm_is_matched){
		this.zm_is_matched = zm_is_matched;
	}
	/**
	 *方法: 取得最近六个月主动查询金融机构数
	 *@return: int 最近六个月主动查询金融机构数
	 */
	
	public int getZm_auth_fin_last_6m_cnt(){
		return this.zm_auth_fin_last_6m_cnt;
	}

	/**
	 *方法: 设置最近六个月主动查询金融机构数
	 *@param: int 最近六个月主动查询金融机构数
	 */
	public void setZm_auth_fin_last_6m_cnt(int zm_auth_fin_last_6m_cnt){
		this.zm_auth_fin_last_6m_cnt = zm_auth_fin_last_6m_cnt;
	}
	/**
	 *方法: 取得最近六个月逾期总笔数
	 *@return: int 最近六个月逾期总笔数
	 */
	
	public int getZm_ovd_order_cnt_6m(){
		return this.zm_ovd_order_cnt_6m;
	}

	/**
	 *方法: 设置最近六个月逾期总笔数
	 *@param: int 最近六个月逾期总笔数
	 */
	public void setZm_ovd_order_cnt_6m(int zm_ovd_order_cnt_6m){
		this.zm_ovd_order_cnt_6m = zm_ovd_order_cnt_6m;
	}
	/**
	 *方法: 取得最近六个月逾期总金额
	 *@return: int 最近六个月逾期总金额
	 */
	
	public int getZm_ovd_order_amt_6m(){
		return this.zm_ovd_order_amt_6m;
	}

	/**
	 *方法: 设置最近六个月逾期总金额
	 *@param: int 最近六个月逾期总金额
	 */
	public void setZm_ovd_order_amt_6m(int zm_ovd_order_amt_6m){
		this.zm_ovd_order_amt_6m = zm_ovd_order_amt_6m;
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
