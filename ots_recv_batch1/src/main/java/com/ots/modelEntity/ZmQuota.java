package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class ZmQuota implements java.io.Serializable {
	@XmlElement(name = "芝麻分") 	
	private int zm_zmScore = -999999;
	@XmlElement(name = "芝麻基础额度") 	
	private double zm_ifre_baseAmount = -999999;
	@XmlElement(name = "芝麻评分卡等级") 	
	private int zm_ifre_ranking = -999999;
	@XmlElement(name = "芝麻评分卡分数") 	
	private int zm_ifre_totalScore = -999999;
	@XmlElement(name = "芝麻最终额度") 	
	private double zm_ifre_finalAmount = -999999;
	@XmlElement(name = "芝麻日利率") 	
	private double zm_ifre_rate = -999999;
	@XmlElement(name = "推荐金额") 	
	private long creditAmt = -999999;
	@XmlElement(name = "推荐利率") 	
	private double creditRate = -999999;
	@XmlElement(name = "最近六个月流动资产日均值") 	
	private int zm_last_6m_avg_asset_total = -999999;
	@XmlElement(name = "最近六个月支付总金额") 	
	private int zm_tot_pay_amt_6m = -999999;
	@XmlElement(name = "是否有车") 	
	private int zm_have_car_flag = -999999;
	@XmlElement(name = "是否有房") 	
	private int zm_have_fang_flag = -999999;
	@XmlElement(name = "消费档次") 	
	private int zm_xfdc_index = -999999;

	    /********** constructors ***********/
    public ZmQuota() {
     
    }
   
    public ZmQuota( int zm_zmScore, double zm_ifre_baseAmount, int zm_ifre_ranking, int zm_ifre_totalScore, double zm_ifre_finalAmount, double zm_ifre_rate, long creditAmt, double creditRate, int zm_last_6m_avg_asset_total, int zm_tot_pay_amt_6m, int zm_have_car_flag, int zm_have_fang_flag, int zm_xfdc_index) {
        this.zm_zmScore = zm_zmScore;
        this.zm_ifre_baseAmount = zm_ifre_baseAmount;
        this.zm_ifre_ranking = zm_ifre_ranking;
        this.zm_ifre_totalScore = zm_ifre_totalScore;
        this.zm_ifre_finalAmount = zm_ifre_finalAmount;
        this.zm_ifre_rate = zm_ifre_rate;
        this.creditAmt = creditAmt;
        this.creditRate = creditRate;
        this.zm_last_6m_avg_asset_total = zm_last_6m_avg_asset_total;
        this.zm_tot_pay_amt_6m = zm_tot_pay_amt_6m;
        this.zm_have_car_flag = zm_have_car_flag;
        this.zm_have_fang_flag = zm_have_fang_flag;
        this.zm_xfdc_index = zm_xfdc_index;
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
	 *方法: 取得芝麻基础额度
	 *@return: double 芝麻基础额度
	 */
	
	public double getZm_ifre_baseAmount(){
		return this.zm_ifre_baseAmount;
	}

	/**
	 *方法: 设置芝麻基础额度
	 *@param: double 芝麻基础额度
	 */
	public void setZm_ifre_baseAmount(double zm_ifre_baseAmount){
		this.zm_ifre_baseAmount = zm_ifre_baseAmount;
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
	 *方法: 取得芝麻最终额度
	 *@return: double 芝麻最终额度
	 */
	
	public double getZm_ifre_finalAmount(){
		return this.zm_ifre_finalAmount;
	}

	/**
	 *方法: 设置芝麻最终额度
	 *@param: double 芝麻最终额度
	 */
	public void setZm_ifre_finalAmount(double zm_ifre_finalAmount){
		this.zm_ifre_finalAmount = zm_ifre_finalAmount;
	}
	/**
	 *方法: 取得芝麻日利率
	 *@return: double 芝麻日利率
	 */
	
	public double getZm_ifre_rate(){
		return this.zm_ifre_rate;
	}

	/**
	 *方法: 设置芝麻日利率
	 *@param: double 芝麻日利率
	 */
	public void setZm_ifre_rate(double zm_ifre_rate){
		this.zm_ifre_rate = zm_ifre_rate;
	}
	/**
	 *方法: 取得推荐金额
	 *@return: long 推荐金额
	 */
	
	public long getCreditAmt(){
		return this.creditAmt;
	}

	/**
	 *方法: 设置推荐金额
	 *@param: long 推荐金额
	 */
	public void setCreditAmt(long creditAmt){
		this.creditAmt = creditAmt;
	}
	/**
	 *方法: 取得推荐利率
	 *@return: double 推荐利率
	 */
	
	public double getCreditRate(){
		return this.creditRate;
	}

	/**
	 *方法: 设置推荐利率
	 *@param: double 推荐利率
	 */
	public void setCreditRate(double creditRate){
		this.creditRate = creditRate;
	}
	/**
	 *方法: 取得最近六个月流动资产日均值
	 *@return: int 最近六个月流动资产日均值
	 */
	
	public int getZm_last_6m_avg_asset_total(){
		return this.zm_last_6m_avg_asset_total;
	}

	/**
	 *方法: 设置最近六个月流动资产日均值
	 *@param: int 最近六个月流动资产日均值
	 */
	public void setZm_last_6m_avg_asset_total(int zm_last_6m_avg_asset_total){
		this.zm_last_6m_avg_asset_total = zm_last_6m_avg_asset_total;
	}
	/**
	 *方法: 取得最近六个月支付总金额
	 *@return: int 最近六个月支付总金额
	 */
	
	public int getZm_tot_pay_amt_6m(){
		return this.zm_tot_pay_amt_6m;
	}

	/**
	 *方法: 设置最近六个月支付总金额
	 *@param: int 最近六个月支付总金额
	 */
	public void setZm_tot_pay_amt_6m(int zm_tot_pay_amt_6m){
		this.zm_tot_pay_amt_6m = zm_tot_pay_amt_6m;
	}
	/**
	 *方法: 取得是否有车
	 *@return: int 是否有车
	 */
	
	public int getZm_have_car_flag(){
		return this.zm_have_car_flag;
	}

	/**
	 *方法: 设置是否有车
	 *@param: int 是否有车
	 */
	public void setZm_have_car_flag(int zm_have_car_flag){
		this.zm_have_car_flag = zm_have_car_flag;
	}
	/**
	 *方法: 取得是否有房
	 *@return: int 是否有房
	 */
	
	public int getZm_have_fang_flag(){
		return this.zm_have_fang_flag;
	}

	/**
	 *方法: 设置是否有房
	 *@param: int 是否有房
	 */
	public void setZm_have_fang_flag(int zm_have_fang_flag){
		this.zm_have_fang_flag = zm_have_fang_flag;
	}
	/**
	 *方法: 取得消费档次
	 *@return: int 消费档次
	 */
	
	public int getZm_xfdc_index(){
		return this.zm_xfdc_index;
	}

	/**
	 *方法: 设置消费档次
	 *@param: int 消费档次
	 */
	public void setZm_xfdc_index(int zm_xfdc_index){
		this.zm_xfdc_index = zm_xfdc_index;
	}
}
