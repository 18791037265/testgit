package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class AntiFraudDecision implements java.io.Serializable {
	@XmlElement(name = "总分值") 	
	private double totalScore = -999999;
	@XmlElement(name = "评级") 	
	private String ranking = "-999999";
	@XmlElement(name = "截断评分") 	
	private double trimScore = -999999;
	@XmlElement(name = "违约概率") 	
	private double defaultRatio = -999999;
	@XmlElement(name = "决策建议") 	
	private List<String> finalProposal = new ArrayList<String>();
	@XmlElement(name = "拒绝原因") 	
	private List<String> rejectReason = new ArrayList<String>();
	@XmlElement(name = "身份证名单") 	
	private IdLst idLst = new IdLst();
	@XmlElement(name = "手机名单") 	
	private PhoneLst phoneLst = new PhoneLst();
	@XmlElement(name = "身份证手机关联名单") 	
	private IdPhoneLst idPhoneLst = new IdPhoneLst();
	@XmlElement(name = "多头借贷名单") 	
	private MultiLoanLst multiLoanLst = new MultiLoanLst();
	@XmlElement(name = "多平台申请名单") 	
	private MultiPlatformLst multiPlatformLst = new MultiPlatformLst();

	    /********** constructors ***********/
    public AntiFraudDecision() {
     
    }
   
    public AntiFraudDecision( double totalScore, String ranking, double trimScore, double defaultRatio, List<String> finalProposal, List<String> rejectReason, IdLst idLst, PhoneLst phoneLst, IdPhoneLst idPhoneLst, MultiLoanLst multiLoanLst, MultiPlatformLst multiPlatformLst) {
        this.totalScore = totalScore;
        this.ranking = ranking;
        this.trimScore = trimScore;
        this.defaultRatio = defaultRatio;
        this.finalProposal = finalProposal;
        this.rejectReason = rejectReason;
        this.idLst = idLst;
        this.phoneLst = phoneLst;
        this.idPhoneLst = idPhoneLst;
        this.multiLoanLst = multiLoanLst;
        this.multiPlatformLst = multiPlatformLst;
    }
	
	/**
	 *方法: 取得总分值
	 *@return: double 总分值
	 */
	
	public double getTotalScore(){
		return this.totalScore;
	}

	/**
	 *方法: 设置总分值
	 *@param: double 总分值
	 */
	public void setTotalScore(double totalScore){
		this.totalScore = totalScore;
	}
	/**
	 *方法: 取得评级
	 *@return: String 评级
	 */
	
	public String getRanking(){
		return this.ranking;
	}

	/**
	 *方法: 设置评级
	 *@param: String 评级
	 */
	public void setRanking(String ranking){
		this.ranking = ranking;
	}
	/**
	 *方法: 取得截断评分
	 *@return: double 截断评分
	 */
	
	public double getTrimScore(){
		return this.trimScore;
	}

	/**
	 *方法: 设置截断评分
	 *@param: double 截断评分
	 */
	public void setTrimScore(double trimScore){
		this.trimScore = trimScore;
	}
	/**
	 *方法: 取得违约概率
	 *@return: double 违约概率
	 */
	
	public double getDefaultRatio(){
		return this.defaultRatio;
	}

	/**
	 *方法: 设置违约概率
	 *@param: double 违约概率
	 */
	public void setDefaultRatio(double defaultRatio){
		this.defaultRatio = defaultRatio;
	}
	/**
	 *方法: 取得决策建议
	 *@return: List<String> 决策建议
	 */
	
	public List<String> getFinalProposal(){
		return this.finalProposal;
	}

	/**
	 *方法: 设置决策建议
	 *@param: List<String> 决策建议
	 */
	public void setFinalProposal(List<String> finalProposal){
		this.finalProposal = finalProposal;
	}
	/**
	 *方法: 取得拒绝原因
	 *@return: List<String> 拒绝原因
	 */
	
	public List<String> getRejectReason(){
		return this.rejectReason;
	}

	/**
	 *方法: 设置拒绝原因
	 *@param: List<String> 拒绝原因
	 */
	public void setRejectReason(List<String> rejectReason){
		this.rejectReason = rejectReason;
	}
	/**
	 *方法: 取得身份证名单
	 *@return: IdLst 身份证名单
	 */
	
	public IdLst getIdLst(){
		return this.idLst;
	}

	/**
	 *方法: 设置身份证名单
	 *@param: IdLst 身份证名单
	 */
	public void setIdLst(IdLst idLst){
		this.idLst = idLst;
	}
	/**
	 *方法: 取得手机名单
	 *@return: PhoneLst 手机名单
	 */
	
	public PhoneLst getPhoneLst(){
		return this.phoneLst;
	}

	/**
	 *方法: 设置手机名单
	 *@param: PhoneLst 手机名单
	 */
	public void setPhoneLst(PhoneLst phoneLst){
		this.phoneLst = phoneLst;
	}
	/**
	 *方法: 取得身份证手机关联名单
	 *@return: IdPhoneLst 身份证手机关联名单
	 */
	
	public IdPhoneLst getIdPhoneLst(){
		return this.idPhoneLst;
	}

	/**
	 *方法: 设置身份证手机关联名单
	 *@param: IdPhoneLst 身份证手机关联名单
	 */
	public void setIdPhoneLst(IdPhoneLst idPhoneLst){
		this.idPhoneLst = idPhoneLst;
	}
	/**
	 *方法: 取得多头借贷名单
	 *@return: MultiLoanLst 多头借贷名单
	 */
	
	public MultiLoanLst getMultiLoanLst(){
		return this.multiLoanLst;
	}

	/**
	 *方法: 设置多头借贷名单
	 *@param: MultiLoanLst 多头借贷名单
	 */
	public void setMultiLoanLst(MultiLoanLst multiLoanLst){
		this.multiLoanLst = multiLoanLst;
	}
	/**
	 *方法: 取得多平台申请名单
	 *@return: MultiPlatformLst 多平台申请名单
	 */
	
	public MultiPlatformLst getMultiPlatformLst(){
		return this.multiPlatformLst;
	}

	/**
	 *方法: 设置多平台申请名单
	 *@param: MultiPlatformLst 多平台申请名单
	 */
	public void setMultiPlatformLst(MultiPlatformLst multiPlatformLst){
		this.multiPlatformLst = multiPlatformLst;
	}
}
