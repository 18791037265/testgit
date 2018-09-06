package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class ZmDerive implements java.io.Serializable {
	@XmlElement(name = "申请单号") 	
	private String zm_applyNo = "-999999";
	@XmlElement(name = "身份证号") 	
	private String zm_certNo = "-999999";
	@XmlElement(name = "年龄") 	
	private int zm_age = -999999;
	@XmlElement(name = "性别") 	
	private String zm_sex = "-999999";
	@XmlElement(name = "审批结果") 	
	private String result = "-999999";
	@XmlElement(name = "内部拒绝码") 	
	private List<String> reason = new ArrayList<String>();
	@XmlElement(name = "是否准入") 	
	private String admit = "-999999";
	@XmlElement(name = "拒绝码") 	
	private String refuseCode = "-999999";
	@XmlElement(name = "拒绝描述") 	
	private String refuseMsg = "-999999";

	    /********** constructors ***********/
    public ZmDerive() {
     
    }
   
    public ZmDerive( String zm_applyNo, String zm_certNo, int zm_age, String zm_sex, String result, List<String> reason, String admit, String refuseCode, String refuseMsg) {
        this.zm_applyNo = zm_applyNo;
        this.zm_certNo = zm_certNo;
        this.zm_age = zm_age;
        this.zm_sex = zm_sex;
        this.result = result;
        this.reason = reason;
        this.admit = admit;
        this.refuseCode = refuseCode;
        this.refuseMsg = refuseMsg;
    }
	
	/**
	 *方法: 取得申请单号
	 *@return: String 申请单号
	 */
	
	public String getZm_applyNo(){
		return this.zm_applyNo;
	}

	/**
	 *方法: 设置申请单号
	 *@param: String 申请单号
	 */
	public void setZm_applyNo(String zm_applyNo){
		this.zm_applyNo = zm_applyNo;
	}
	/**
	 *方法: 取得身份证号
	 *@return: String 身份证号
	 */
	
	public String getZm_certNo(){
		return this.zm_certNo;
	}

	/**
	 *方法: 设置身份证号
	 *@param: String 身份证号
	 */
	public void setZm_certNo(String zm_certNo){
		this.zm_certNo = zm_certNo;
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
	 *方法: 取得性别
	 *@return: String 性别
	 */
	
	public String getZm_sex(){
		return this.zm_sex;
	}

	/**
	 *方法: 设置性别
	 *@param: String 性别
	 */
	public void setZm_sex(String zm_sex){
		this.zm_sex = zm_sex;
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
	 *方法: 取得内部拒绝码
	 *@return: List<String> 内部拒绝码
	 */
	
	public List<String> getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置内部拒绝码
	 *@param: List<String> 内部拒绝码
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
