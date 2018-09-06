package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class MultiPlatformLst implements java.io.Serializable {
	@XmlElement(name = "7天内申请人在同盾信贷合作机构申请次数") 	
	private double ext_sevendays_times = -999999;
	@XmlElement(name = "1个月内申请人在同盾信贷合作机构申请次数") 	
	private double ext_month_times = -999999;
	@XmlElement(name = "3个月内申请人在同盾信贷合作机构申请次数") 	
	private double ext_three_times = -999999;
	@XmlElement(name = "7天内申请人信息在同盾信贷合作机构申请次数_非银金融") 	
	private double ext_sevendays_times_imbank = -999999;
	@XmlElement(name = "1个月内申请人信息在同盾信贷合作机构申请次数_非银金融") 	
	private double ext_month_times_imbank = -999999;
	@XmlElement(name = "3个月内申请人信息在同盾信贷合作机构申请次数_非银金融") 	
	private double ext_three_times_imbank = -999999;
	@XmlElement(name = "7天内申请人信息在同盾信贷合作机构申请次数_p2p") 	
	private double ext_sevendays_times_p2p = -999999;
	@XmlElement(name = "1个月内申请人信息在同盾信贷合作机构申请次数_p2p") 	
	private double ext_month_times_p2p = -999999;
	@XmlElement(name = "3个月内申请人信息在同盾信贷合作机构申请次数_p2p") 	
	private double ext_three_times_p2p = -999999;
	@XmlElement(name = "7天内申请人在同盾信贷合作机构申请次数_消费分期") 	
	private double ext_sevendays_times_installment = -999999;
	@XmlElement(name = "1个月内申请人在同盾信贷合作机构申请次数_消费分期") 	
	private double ext_month_times_installment = -999999;
	@XmlElement(name = "3个月内申请人信息在同盾信贷合作机构申请次数_消费分期") 	
	private double ext_three_times_installment = -999999;
	@XmlElement(name = "7天内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p") 	
	private double ext_sevendays_times_unimbank = -999999;
	@XmlElement(name = "1个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p") 	
	private double ext_month_times_unimbank = -999999;
	@XmlElement(name = "3个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p") 	
	private double ext_three_times_unimbank = -999999;

	    /********** constructors ***********/
    public MultiPlatformLst() {
     
    }
   
    public MultiPlatformLst( double ext_sevendays_times, double ext_month_times, double ext_three_times, double ext_sevendays_times_imbank, double ext_month_times_imbank, double ext_three_times_imbank, double ext_sevendays_times_p2p, double ext_month_times_p2p, double ext_three_times_p2p, double ext_sevendays_times_installment, double ext_month_times_installment, double ext_three_times_installment, double ext_sevendays_times_unimbank, double ext_month_times_unimbank, double ext_three_times_unimbank) {
        this.ext_sevendays_times = ext_sevendays_times;
        this.ext_month_times = ext_month_times;
        this.ext_three_times = ext_three_times;
        this.ext_sevendays_times_imbank = ext_sevendays_times_imbank;
        this.ext_month_times_imbank = ext_month_times_imbank;
        this.ext_three_times_imbank = ext_three_times_imbank;
        this.ext_sevendays_times_p2p = ext_sevendays_times_p2p;
        this.ext_month_times_p2p = ext_month_times_p2p;
        this.ext_three_times_p2p = ext_three_times_p2p;
        this.ext_sevendays_times_installment = ext_sevendays_times_installment;
        this.ext_month_times_installment = ext_month_times_installment;
        this.ext_three_times_installment = ext_three_times_installment;
        this.ext_sevendays_times_unimbank = ext_sevendays_times_unimbank;
        this.ext_month_times_unimbank = ext_month_times_unimbank;
        this.ext_three_times_unimbank = ext_three_times_unimbank;
    }
	
	/**
	 *方法: 取得7天内申请人在同盾信贷合作机构申请次数
	 *@return: double 7天内申请人在同盾信贷合作机构申请次数
	 */
	
	public double getExt_sevendays_times(){
		return this.ext_sevendays_times;
	}

	/**
	 *方法: 设置7天内申请人在同盾信贷合作机构申请次数
	 *@param: double 7天内申请人在同盾信贷合作机构申请次数
	 */
	public void setExt_sevendays_times(double ext_sevendays_times){
		this.ext_sevendays_times = ext_sevendays_times;
	}
	/**
	 *方法: 取得1个月内申请人在同盾信贷合作机构申请次数
	 *@return: double 1个月内申请人在同盾信贷合作机构申请次数
	 */
	
	public double getExt_month_times(){
		return this.ext_month_times;
	}

	/**
	 *方法: 设置1个月内申请人在同盾信贷合作机构申请次数
	 *@param: double 1个月内申请人在同盾信贷合作机构申请次数
	 */
	public void setExt_month_times(double ext_month_times){
		this.ext_month_times = ext_month_times;
	}
	/**
	 *方法: 取得3个月内申请人在同盾信贷合作机构申请次数
	 *@return: double 3个月内申请人在同盾信贷合作机构申请次数
	 */
	
	public double getExt_three_times(){
		return this.ext_three_times;
	}

	/**
	 *方法: 设置3个月内申请人在同盾信贷合作机构申请次数
	 *@param: double 3个月内申请人在同盾信贷合作机构申请次数
	 */
	public void setExt_three_times(double ext_three_times){
		this.ext_three_times = ext_three_times;
	}
	/**
	 *方法: 取得7天内申请人信息在同盾信贷合作机构申请次数_非银金融
	 *@return: double 7天内申请人信息在同盾信贷合作机构申请次数_非银金融
	 */
	
	public double getExt_sevendays_times_imbank(){
		return this.ext_sevendays_times_imbank;
	}

	/**
	 *方法: 设置7天内申请人信息在同盾信贷合作机构申请次数_非银金融
	 *@param: double 7天内申请人信息在同盾信贷合作机构申请次数_非银金融
	 */
	public void setExt_sevendays_times_imbank(double ext_sevendays_times_imbank){
		this.ext_sevendays_times_imbank = ext_sevendays_times_imbank;
	}
	/**
	 *方法: 取得1个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 *@return: double 1个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 */
	
	public double getExt_month_times_imbank(){
		return this.ext_month_times_imbank;
	}

	/**
	 *方法: 设置1个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 *@param: double 1个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 */
	public void setExt_month_times_imbank(double ext_month_times_imbank){
		this.ext_month_times_imbank = ext_month_times_imbank;
	}
	/**
	 *方法: 取得3个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 *@return: double 3个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 */
	
	public double getExt_three_times_imbank(){
		return this.ext_three_times_imbank;
	}

	/**
	 *方法: 设置3个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 *@param: double 3个月内申请人信息在同盾信贷合作机构申请次数_非银金融
	 */
	public void setExt_three_times_imbank(double ext_three_times_imbank){
		this.ext_three_times_imbank = ext_three_times_imbank;
	}
	/**
	 *方法: 取得7天内申请人信息在同盾信贷合作机构申请次数_p2p
	 *@return: double 7天内申请人信息在同盾信贷合作机构申请次数_p2p
	 */
	
	public double getExt_sevendays_times_p2p(){
		return this.ext_sevendays_times_p2p;
	}

	/**
	 *方法: 设置7天内申请人信息在同盾信贷合作机构申请次数_p2p
	 *@param: double 7天内申请人信息在同盾信贷合作机构申请次数_p2p
	 */
	public void setExt_sevendays_times_p2p(double ext_sevendays_times_p2p){
		this.ext_sevendays_times_p2p = ext_sevendays_times_p2p;
	}
	/**
	 *方法: 取得1个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 *@return: double 1个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 */
	
	public double getExt_month_times_p2p(){
		return this.ext_month_times_p2p;
	}

	/**
	 *方法: 设置1个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 *@param: double 1个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 */
	public void setExt_month_times_p2p(double ext_month_times_p2p){
		this.ext_month_times_p2p = ext_month_times_p2p;
	}
	/**
	 *方法: 取得3个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 *@return: double 3个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 */
	
	public double getExt_three_times_p2p(){
		return this.ext_three_times_p2p;
	}

	/**
	 *方法: 设置3个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 *@param: double 3个月内申请人信息在同盾信贷合作机构申请次数_p2p
	 */
	public void setExt_three_times_p2p(double ext_three_times_p2p){
		this.ext_three_times_p2p = ext_three_times_p2p;
	}
	/**
	 *方法: 取得7天内申请人在同盾信贷合作机构申请次数_消费分期
	 *@return: double 7天内申请人在同盾信贷合作机构申请次数_消费分期
	 */
	
	public double getExt_sevendays_times_installment(){
		return this.ext_sevendays_times_installment;
	}

	/**
	 *方法: 设置7天内申请人在同盾信贷合作机构申请次数_消费分期
	 *@param: double 7天内申请人在同盾信贷合作机构申请次数_消费分期
	 */
	public void setExt_sevendays_times_installment(double ext_sevendays_times_installment){
		this.ext_sevendays_times_installment = ext_sevendays_times_installment;
	}
	/**
	 *方法: 取得1个月内申请人在同盾信贷合作机构申请次数_消费分期
	 *@return: double 1个月内申请人在同盾信贷合作机构申请次数_消费分期
	 */
	
	public double getExt_month_times_installment(){
		return this.ext_month_times_installment;
	}

	/**
	 *方法: 设置1个月内申请人在同盾信贷合作机构申请次数_消费分期
	 *@param: double 1个月内申请人在同盾信贷合作机构申请次数_消费分期
	 */
	public void setExt_month_times_installment(double ext_month_times_installment){
		this.ext_month_times_installment = ext_month_times_installment;
	}
	/**
	 *方法: 取得3个月内申请人信息在同盾信贷合作机构申请次数_消费分期
	 *@return: double 3个月内申请人信息在同盾信贷合作机构申请次数_消费分期
	 */
	
	public double getExt_three_times_installment(){
		return this.ext_three_times_installment;
	}

	/**
	 *方法: 设置3个月内申请人信息在同盾信贷合作机构申请次数_消费分期
	 *@param: double 3个月内申请人信息在同盾信贷合作机构申请次数_消费分期
	 */
	public void setExt_three_times_installment(double ext_three_times_installment){
		this.ext_three_times_installment = ext_three_times_installment;
	}
	/**
	 *方法: 取得7天内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 *@return: double 7天内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 */
	
	public double getExt_sevendays_times_unimbank(){
		return this.ext_sevendays_times_unimbank;
	}

	/**
	 *方法: 设置7天内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 *@param: double 7天内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 */
	public void setExt_sevendays_times_unimbank(double ext_sevendays_times_unimbank){
		this.ext_sevendays_times_unimbank = ext_sevendays_times_unimbank;
	}
	/**
	 *方法: 取得1个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 *@return: double 1个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 */
	
	public double getExt_month_times_unimbank(){
		return this.ext_month_times_unimbank;
	}

	/**
	 *方法: 设置1个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 *@param: double 1个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 */
	public void setExt_month_times_unimbank(double ext_month_times_unimbank){
		this.ext_month_times_unimbank = ext_month_times_unimbank;
	}
	/**
	 *方法: 取得3个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 *@return: double 3个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 */
	
	public double getExt_three_times_unimbank(){
		return this.ext_three_times_unimbank;
	}

	/**
	 *方法: 设置3个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 *@param: double 3个月内申请人信息在同盾信贷合作机构申请次数_非银金融_不含消费分期及p2p
	 */
	public void setExt_three_times_unimbank(double ext_three_times_unimbank){
		this.ext_three_times_unimbank = ext_three_times_unimbank;
	}
}
