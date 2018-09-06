package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class Score implements java.io.Serializable {
	@XmlElement(name = "反欺诈信用评分") 	
	private double ext_credit_score = -999999;
	@XmlElement(name = "是否准入") 	
	private String admit = "-999999";
	@XmlElement(name = "审批结果") 	
	private String result = "-999999";
	@XmlElement(name = "内部拒绝码") 	
	private List<String> reason = new ArrayList<String>();

	    /********** constructors ***********/
    public Score() {
     
    }
   
    public Score( double ext_credit_score, String admit, String result, List<String> reason) {
        this.ext_credit_score = ext_credit_score;
        this.admit = admit;
        this.result = result;
        this.reason = reason;
    }
	
	/**
	 *方法: 取得反欺诈信用评分
	 *@return: double 反欺诈信用评分
	 */
	
	public double getExt_credit_score(){
		return this.ext_credit_score;
	}

	/**
	 *方法: 设置反欺诈信用评分
	 *@param: double 反欺诈信用评分
	 */
	public void setExt_credit_score(double ext_credit_score){
		this.ext_credit_score = ext_credit_score;
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
}
