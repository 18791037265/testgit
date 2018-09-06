package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class FinalRule implements java.io.Serializable {
	@XmlElement(name = "芝麻评分卡分数") 	
	private int zm_ifre_totalScore = -999999;
	@XmlElement(name = "芝麻评分卡等级") 	
	private int zm_ifre_ranking = -999999;
	@XmlElement(name = "最终加权评分卡分数") 	
	private int final_ifre_totalScore = -999999;
	@XmlElement(name = "推荐金额") 	
	private int creditAmt = -999999;
	@XmlElement(name = "审批额度") 	
	private long zm_platformAdmit = -999999;
	@XmlElement(name = "审批结果") 	
	private String result = "-999999";
	@XmlElement(name = "审批原因") 	
	private List<String> reason = new ArrayList<String>();
	@XmlElement(name = "本次审批结果") 	
	private String zm_platformAccess = "-999999";
	@XmlElement(name = "是否同意") 	
	private String isAgree = "-999999";
	@XmlElement(name = "批复意见") 	
	private String ackMsg = "-999999";
	@XmlElement(name = "是否准入") 	
	private String admit = "-999999";

	    /********** constructors ***********/
    public FinalRule() {
     
    }
   
    public FinalRule( int zm_ifre_totalScore, int zm_ifre_ranking, int final_ifre_totalScore, int creditAmt, long zm_platformAdmit, String result, List<String> reason, String zm_platformAccess, String isAgree, String ackMsg, String admit) {
        this.zm_ifre_totalScore = zm_ifre_totalScore;
        this.zm_ifre_ranking = zm_ifre_ranking;
        this.final_ifre_totalScore = final_ifre_totalScore;
        this.creditAmt = creditAmt;
        this.zm_platformAdmit = zm_platformAdmit;
        this.result = result;
        this.reason = reason;
        this.zm_platformAccess = zm_platformAccess;
        this.isAgree = isAgree;
        this.ackMsg = ackMsg;
        this.admit = admit;
    }
	
	/**
	 *方法: 取得芝麻评分卡分数
	 *@return: int 芝麻评分卡分数
	 */
	
	public int getZm_ifre_totalScore(){
		return this.zm_ifre_totalScore;
	}

	/**
	 *方法: 设置芝麻评分卡分数
	 *@param: int 芝麻评分卡分数
	 */
	public void setZm_ifre_totalScore(int zm_ifre_totalScore){
		this.zm_ifre_totalScore = zm_ifre_totalScore;
	}
	/**
	 *方法: 取得芝麻评分卡等级
	 *@return: int 芝麻评分卡等级
	 */
	
	public int getZm_ifre_ranking(){
		return this.zm_ifre_ranking;
	}

	/**
	 *方法: 设置芝麻评分卡等级
	 *@param: int 芝麻评分卡等级
	 */
	public void setZm_ifre_ranking(int zm_ifre_ranking){
		this.zm_ifre_ranking = zm_ifre_ranking;
	}
	/**
	 *方法: 取得最终加权评分卡分数
	 *@return: int 最终加权评分卡分数
	 */
	
	public int getFinal_ifre_totalScore(){
		return this.final_ifre_totalScore;
	}

	/**
	 *方法: 设置最终加权评分卡分数
	 *@param: int 最终加权评分卡分数
	 */
	public void setFinal_ifre_totalScore(int final_ifre_totalScore){
		this.final_ifre_totalScore = final_ifre_totalScore;
	}
	/**
	 *方法: 取得推荐金额
	 *@return: int 推荐金额
	 */
	
	public int getCreditAmt(){
		return this.creditAmt;
	}

	/**
	 *方法: 设置推荐金额
	 *@param: int 推荐金额
	 */
	public void setCreditAmt(int creditAmt){
		this.creditAmt = creditAmt;
	}
	/**
	 *方法: 取得审批额度
	 *@return: long 审批额度
	 */
	
	public long getZm_platformAdmit(){
		return this.zm_platformAdmit;
	}

	/**
	 *方法: 设置审批额度
	 *@param: long 审批额度
	 */
	public void setZm_platformAdmit(long zm_platformAdmit){
		this.zm_platformAdmit = zm_platformAdmit;
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
	 *方法: 取得审批原因
	 *@return: List<String> 审批原因
	 */
	
	public List<String> getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置审批原因
	 *@param: List<String> 审批原因
	 */
	public void setReason(List<String> reason){
		this.reason = reason;
	}
	/**
	 *方法: 取得本次审批结果
	 *@return: String 本次审批结果
	 */
	
	public String getZm_platformAccess(){
		return this.zm_platformAccess;
	}

	/**
	 *方法: 设置本次审批结果
	 *@param: String 本次审批结果
	 */
	public void setZm_platformAccess(String zm_platformAccess){
		this.zm_platformAccess = zm_platformAccess;
	}
	/**
	 *方法: 取得是否同意
	 *@return: String 是否同意
	 */
	
	public String getIsAgree(){
		return this.isAgree;
	}

	/**
	 *方法: 设置是否同意
	 *@param: String 是否同意
	 */
	public void setIsAgree(String isAgree){
		this.isAgree = isAgree;
	}
	/**
	 *方法: 取得批复意见
	 *@return: String 批复意见
	 */
	
	public String getAckMsg(){
		return this.ackMsg;
	}

	/**
	 *方法: 设置批复意见
	 *@param: String 批复意见
	 */
	public void setAckMsg(String ackMsg){
		this.ackMsg = ackMsg;
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
}
