package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class MultiLoanLst implements java.io.Serializable {
	@XmlElement(name = "7天内申请人在多个平台申请借款_非银") 	
	private double ext_sevendays_credit_platform_imbank = -999999;
	@XmlElement(name = "1个月内申请人在多个平台申请借款_非银") 	
	private double ext_month_credit_platform_imbank = -999999;
	@XmlElement(name = "排除7天后1个月内申请人借贷申请平台数_非银") 	
	private double ext_month_credit_platform_imbank_excluding_7days = -999999;
	@XmlElement(name = "3个月内申请人在多个平台申请借款_非银") 	
	private double ext_three_credit_platform_imbank = -999999;
	@XmlElement(name = "排除1个月后3个月内申请人借贷申请平台数_非银") 	
	private double ext_three_credit_platform_imbank_excluding_1mth = -999999;
	@XmlElement(name = "7天内申请人在多个平台申请借款") 	
	private double ext_sevendays_credit_platform = -999999;
	@XmlElement(name = "1个月内申请人在多个平台申请借款") 	
	private double ext_month_credit_platform = -999999;
	@XmlElement(name = "3个月内申请人在多个平台申请借款") 	
	private double ext_three_credit_platform = -999999;
	@XmlElement(name = "7天内申请人在同盾信贷合作机构申请机构数_p2p") 	
	private double ext_sevendays_credit_platform_p2p = -999999;
	@XmlElement(name = "1个月内申请人在同盾信贷合作机构申请机构数_p2p") 	
	private double ext_month_credit_platform_p2p = -999999;
	@XmlElement(name = "3个月内申请人在同盾信贷合作机构申请机构数_p2p") 	
	private double ext_three_credit_platform_p2p = -999999;
	@XmlElement(name = "7天内申请人在同盾信贷合作机构申请机构数_消费分期") 	
	private double ext_sevendays_credit_platform_installment = -999999;
	@XmlElement(name = "1个月内申请人在同盾信贷合作机构申请机构数_消费分期") 	
	private double ext_month_credit_platform_installment = -999999;
	@XmlElement(name = "3个月内申请人在同盾信贷合作机构申请机构数_消费分期") 	
	private double ext_three_credit_platform_installment = -999999;
	@XmlElement(name = "7天内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p") 	
	private double ext_sevendays_credit_platform_unimbank = -999999;
	@XmlElement(name = "1个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p") 	
	private double ext_month_credit_platform_unimbank = -999999;
	@XmlElement(name = "3个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p") 	
	private double ext_three_credit_platform_unimbank = -999999;

	    /********** constructors ***********/
    public MultiLoanLst() {
     
    }
   
    public MultiLoanLst( double ext_sevendays_credit_platform_imbank, double ext_month_credit_platform_imbank, double ext_month_credit_platform_imbank_excluding_7days, double ext_three_credit_platform_imbank, double ext_three_credit_platform_imbank_excluding_1mth, double ext_sevendays_credit_platform, double ext_month_credit_platform, double ext_three_credit_platform, double ext_sevendays_credit_platform_p2p, double ext_month_credit_platform_p2p, double ext_three_credit_platform_p2p, double ext_sevendays_credit_platform_installment, double ext_month_credit_platform_installment, double ext_three_credit_platform_installment, double ext_sevendays_credit_platform_unimbank, double ext_month_credit_platform_unimbank, double ext_three_credit_platform_unimbank) {
        this.ext_sevendays_credit_platform_imbank = ext_sevendays_credit_platform_imbank;
        this.ext_month_credit_platform_imbank = ext_month_credit_platform_imbank;
        this.ext_month_credit_platform_imbank_excluding_7days = ext_month_credit_platform_imbank_excluding_7days;
        this.ext_three_credit_platform_imbank = ext_three_credit_platform_imbank;
        this.ext_three_credit_platform_imbank_excluding_1mth = ext_three_credit_platform_imbank_excluding_1mth;
        this.ext_sevendays_credit_platform = ext_sevendays_credit_platform;
        this.ext_month_credit_platform = ext_month_credit_platform;
        this.ext_three_credit_platform = ext_three_credit_platform;
        this.ext_sevendays_credit_platform_p2p = ext_sevendays_credit_platform_p2p;
        this.ext_month_credit_platform_p2p = ext_month_credit_platform_p2p;
        this.ext_three_credit_platform_p2p = ext_three_credit_platform_p2p;
        this.ext_sevendays_credit_platform_installment = ext_sevendays_credit_platform_installment;
        this.ext_month_credit_platform_installment = ext_month_credit_platform_installment;
        this.ext_three_credit_platform_installment = ext_three_credit_platform_installment;
        this.ext_sevendays_credit_platform_unimbank = ext_sevendays_credit_platform_unimbank;
        this.ext_month_credit_platform_unimbank = ext_month_credit_platform_unimbank;
        this.ext_three_credit_platform_unimbank = ext_three_credit_platform_unimbank;
    }
	
	/**
	 *方法: 取得7天内申请人在多个平台申请借款_非银
	 *@return: double 7天内申请人在多个平台申请借款_非银
	 */
	
	public double getExt_sevendays_credit_platform_imbank(){
		return this.ext_sevendays_credit_platform_imbank;
	}

	/**
	 *方法: 设置7天内申请人在多个平台申请借款_非银
	 *@param: double 7天内申请人在多个平台申请借款_非银
	 */
	public void setExt_sevendays_credit_platform_imbank(double ext_sevendays_credit_platform_imbank){
		this.ext_sevendays_credit_platform_imbank = ext_sevendays_credit_platform_imbank;
	}
	/**
	 *方法: 取得1个月内申请人在多个平台申请借款_非银
	 *@return: double 1个月内申请人在多个平台申请借款_非银
	 */
	
	public double getExt_month_credit_platform_imbank(){
		return this.ext_month_credit_platform_imbank;
	}

	/**
	 *方法: 设置1个月内申请人在多个平台申请借款_非银
	 *@param: double 1个月内申请人在多个平台申请借款_非银
	 */
	public void setExt_month_credit_platform_imbank(double ext_month_credit_platform_imbank){
		this.ext_month_credit_platform_imbank = ext_month_credit_platform_imbank;
	}
	/**
	 *方法: 取得排除7天后1个月内申请人借贷申请平台数_非银
	 *@return: double 排除7天后1个月内申请人借贷申请平台数_非银
	 */
	
	public double getExt_month_credit_platform_imbank_excluding_7days(){
		return this.ext_month_credit_platform_imbank_excluding_7days;
	}

	/**
	 *方法: 设置排除7天后1个月内申请人借贷申请平台数_非银
	 *@param: double 排除7天后1个月内申请人借贷申请平台数_非银
	 */
	public void setExt_month_credit_platform_imbank_excluding_7days(double ext_month_credit_platform_imbank_excluding_7days){
		this.ext_month_credit_platform_imbank_excluding_7days = ext_month_credit_platform_imbank_excluding_7days;
	}
	/**
	 *方法: 取得3个月内申请人在多个平台申请借款_非银
	 *@return: double 3个月内申请人在多个平台申请借款_非银
	 */
	
	public double getExt_three_credit_platform_imbank(){
		return this.ext_three_credit_platform_imbank;
	}

	/**
	 *方法: 设置3个月内申请人在多个平台申请借款_非银
	 *@param: double 3个月内申请人在多个平台申请借款_非银
	 */
	public void setExt_three_credit_platform_imbank(double ext_three_credit_platform_imbank){
		this.ext_three_credit_platform_imbank = ext_three_credit_platform_imbank;
	}
	/**
	 *方法: 取得排除1个月后3个月内申请人借贷申请平台数_非银
	 *@return: double 排除1个月后3个月内申请人借贷申请平台数_非银
	 */
	
	public double getExt_three_credit_platform_imbank_excluding_1mth(){
		return this.ext_three_credit_platform_imbank_excluding_1mth;
	}

	/**
	 *方法: 设置排除1个月后3个月内申请人借贷申请平台数_非银
	 *@param: double 排除1个月后3个月内申请人借贷申请平台数_非银
	 */
	public void setExt_three_credit_platform_imbank_excluding_1mth(double ext_three_credit_platform_imbank_excluding_1mth){
		this.ext_three_credit_platform_imbank_excluding_1mth = ext_three_credit_platform_imbank_excluding_1mth;
	}
	/**
	 *方法: 取得7天内申请人在多个平台申请借款
	 *@return: double 7天内申请人在多个平台申请借款
	 */
	
	public double getExt_sevendays_credit_platform(){
		return this.ext_sevendays_credit_platform;
	}

	/**
	 *方法: 设置7天内申请人在多个平台申请借款
	 *@param: double 7天内申请人在多个平台申请借款
	 */
	public void setExt_sevendays_credit_platform(double ext_sevendays_credit_platform){
		this.ext_sevendays_credit_platform = ext_sevendays_credit_platform;
	}
	/**
	 *方法: 取得1个月内申请人在多个平台申请借款
	 *@return: double 1个月内申请人在多个平台申请借款
	 */
	
	public double getExt_month_credit_platform(){
		return this.ext_month_credit_platform;
	}

	/**
	 *方法: 设置1个月内申请人在多个平台申请借款
	 *@param: double 1个月内申请人在多个平台申请借款
	 */
	public void setExt_month_credit_platform(double ext_month_credit_platform){
		this.ext_month_credit_platform = ext_month_credit_platform;
	}
	/**
	 *方法: 取得3个月内申请人在多个平台申请借款
	 *@return: double 3个月内申请人在多个平台申请借款
	 */
	
	public double getExt_three_credit_platform(){
		return this.ext_three_credit_platform;
	}

	/**
	 *方法: 设置3个月内申请人在多个平台申请借款
	 *@param: double 3个月内申请人在多个平台申请借款
	 */
	public void setExt_three_credit_platform(double ext_three_credit_platform){
		this.ext_three_credit_platform = ext_three_credit_platform;
	}
	/**
	 *方法: 取得7天内申请人在同盾信贷合作机构申请机构数_p2p
	 *@return: double 7天内申请人在同盾信贷合作机构申请机构数_p2p
	 */
	
	public double getExt_sevendays_credit_platform_p2p(){
		return this.ext_sevendays_credit_platform_p2p;
	}

	/**
	 *方法: 设置7天内申请人在同盾信贷合作机构申请机构数_p2p
	 *@param: double 7天内申请人在同盾信贷合作机构申请机构数_p2p
	 */
	public void setExt_sevendays_credit_platform_p2p(double ext_sevendays_credit_platform_p2p){
		this.ext_sevendays_credit_platform_p2p = ext_sevendays_credit_platform_p2p;
	}
	/**
	 *方法: 取得1个月内申请人在同盾信贷合作机构申请机构数_p2p
	 *@return: double 1个月内申请人在同盾信贷合作机构申请机构数_p2p
	 */
	
	public double getExt_month_credit_platform_p2p(){
		return this.ext_month_credit_platform_p2p;
	}

	/**
	 *方法: 设置1个月内申请人在同盾信贷合作机构申请机构数_p2p
	 *@param: double 1个月内申请人在同盾信贷合作机构申请机构数_p2p
	 */
	public void setExt_month_credit_platform_p2p(double ext_month_credit_platform_p2p){
		this.ext_month_credit_platform_p2p = ext_month_credit_platform_p2p;
	}
	/**
	 *方法: 取得3个月内申请人在同盾信贷合作机构申请机构数_p2p
	 *@return: double 3个月内申请人在同盾信贷合作机构申请机构数_p2p
	 */
	
	public double getExt_three_credit_platform_p2p(){
		return this.ext_three_credit_platform_p2p;
	}

	/**
	 *方法: 设置3个月内申请人在同盾信贷合作机构申请机构数_p2p
	 *@param: double 3个月内申请人在同盾信贷合作机构申请机构数_p2p
	 */
	public void setExt_three_credit_platform_p2p(double ext_three_credit_platform_p2p){
		this.ext_three_credit_platform_p2p = ext_three_credit_platform_p2p;
	}
	/**
	 *方法: 取得7天内申请人在同盾信贷合作机构申请机构数_消费分期
	 *@return: double 7天内申请人在同盾信贷合作机构申请机构数_消费分期
	 */
	
	public double getExt_sevendays_credit_platform_installment(){
		return this.ext_sevendays_credit_platform_installment;
	}

	/**
	 *方法: 设置7天内申请人在同盾信贷合作机构申请机构数_消费分期
	 *@param: double 7天内申请人在同盾信贷合作机构申请机构数_消费分期
	 */
	public void setExt_sevendays_credit_platform_installment(double ext_sevendays_credit_platform_installment){
		this.ext_sevendays_credit_platform_installment = ext_sevendays_credit_platform_installment;
	}
	/**
	 *方法: 取得1个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 *@return: double 1个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 */
	
	public double getExt_month_credit_platform_installment(){
		return this.ext_month_credit_platform_installment;
	}

	/**
	 *方法: 设置1个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 *@param: double 1个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 */
	public void setExt_month_credit_platform_installment(double ext_month_credit_platform_installment){
		this.ext_month_credit_platform_installment = ext_month_credit_platform_installment;
	}
	/**
	 *方法: 取得3个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 *@return: double 3个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 */
	
	public double getExt_three_credit_platform_installment(){
		return this.ext_three_credit_platform_installment;
	}

	/**
	 *方法: 设置3个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 *@param: double 3个月内申请人在同盾信贷合作机构申请机构数_消费分期
	 */
	public void setExt_three_credit_platform_installment(double ext_three_credit_platform_installment){
		this.ext_three_credit_platform_installment = ext_three_credit_platform_installment;
	}
	/**
	 *方法: 取得7天内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 *@return: double 7天内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 */
	
	public double getExt_sevendays_credit_platform_unimbank(){
		return this.ext_sevendays_credit_platform_unimbank;
	}

	/**
	 *方法: 设置7天内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 *@param: double 7天内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 */
	public void setExt_sevendays_credit_platform_unimbank(double ext_sevendays_credit_platform_unimbank){
		this.ext_sevendays_credit_platform_unimbank = ext_sevendays_credit_platform_unimbank;
	}
	/**
	 *方法: 取得1个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 *@return: double 1个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 */
	
	public double getExt_month_credit_platform_unimbank(){
		return this.ext_month_credit_platform_unimbank;
	}

	/**
	 *方法: 设置1个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 *@param: double 1个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 */
	public void setExt_month_credit_platform_unimbank(double ext_month_credit_platform_unimbank){
		this.ext_month_credit_platform_unimbank = ext_month_credit_platform_unimbank;
	}
	/**
	 *方法: 取得3个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 *@return: double 3个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 */
	
	public double getExt_three_credit_platform_unimbank(){
		return this.ext_three_credit_platform_unimbank;
	}

	/**
	 *方法: 设置3个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 *@param: double 3个月内申请人在同盾信贷合作机构申请机构数_非银金融_不含消费分期及p2p
	 */
	public void setExt_three_credit_platform_unimbank(double ext_three_credit_platform_unimbank){
		this.ext_three_credit_platform_unimbank = ext_three_credit_platform_unimbank;
	}
}
