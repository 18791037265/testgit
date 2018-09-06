package com.ots.modelEntity;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class IdLst implements java.io.Serializable {
	@XmlElement(name = "身份证命中法院执行名单") 	
	private double ext_id_court_performing = -999999;
	@XmlElement(name = "身份证命中法院失信名单") 	
	private double ext_id_court = -999999;
	@XmlElement(name = "身份证命中刑事犯罪名单") 	
	private double ext_id_crime = -999999;
	@XmlElement(name = "身份证命中欠款公司法人代表名单") 	
	private double ext_id_company_capitalowing = -999999;
	@XmlElement(name = "身份证命中欠税公司法人代表名单") 	
	private double ext_id_company_taxowing = -999999;
	@XmlElement(name = "身份证命中法院结案名单") 	
	private double ext_id_courtclose = -999999;
	@XmlElement(name = "身份证命中车辆租赁违约名单") 	
	private double ext_id_carrental = -999999;
	@XmlElement(name = "身份证命中车贷风险名单") 	
	private double ext_id_carloan = -999999;
	@XmlElement(name = "身份证命中欠税名单") 	
	private double ext_id_taxowing = -999999;
	@XmlElement(name = "身份证命中信贷逾期名单") 	
	private double ext_id_overdue = -999999;
	@XmlElement(name = "身份证命中信贷逾期后还款名单") 	
	private double ext_id_overdue_payback = -999999;
	@XmlElement(name = "身份证命中助学贷款欠费名单") 	
	private double ext_id_study_loanowing = -999999;
	@XmlElement(name = "身份证_姓名命中信贷逾期模糊名单") 	
	private double ext_id_name_creditoverdue = -999999;
	@XmlElement(name = "身份证_姓名命中法院失信模糊名单") 	
	private double ext_id_name_creditcrackgray = -999999;
	@XmlElement(name = "身份证_姓名命中法院执行模糊名单") 	
	private double ext_id_name_courtperforming = -999999;
	@XmlElement(name = "身份证_姓名命中法院结案模糊名单") 	
	private double ext_id_name_courtclosegray = -999999;
	@XmlElement(name = "身份证归属地位于高风险较为集中地区") 	
	private double ext_id_location_highrisk = -999999;
	@XmlElement(name = "身份证命中高风险关注名单") 	
	private double ext_id_highrisk = -999999;

	    /********** constructors ***********/
    public IdLst() {
     
    }
   
    public IdLst( double ext_id_court_performing, double ext_id_court, double ext_id_crime, double ext_id_company_capitalowing, double ext_id_company_taxowing, double ext_id_courtclose, double ext_id_carrental, double ext_id_carloan, double ext_id_taxowing, double ext_id_overdue, double ext_id_overdue_payback, double ext_id_study_loanowing, double ext_id_name_creditoverdue, double ext_id_name_creditcrackgray, double ext_id_name_courtperforming, double ext_id_name_courtclosegray, double ext_id_location_highrisk, double ext_id_highrisk) {
        this.ext_id_court_performing = ext_id_court_performing;
        this.ext_id_court = ext_id_court;
        this.ext_id_crime = ext_id_crime;
        this.ext_id_company_capitalowing = ext_id_company_capitalowing;
        this.ext_id_company_taxowing = ext_id_company_taxowing;
        this.ext_id_courtclose = ext_id_courtclose;
        this.ext_id_carrental = ext_id_carrental;
        this.ext_id_carloan = ext_id_carloan;
        this.ext_id_taxowing = ext_id_taxowing;
        this.ext_id_overdue = ext_id_overdue;
        this.ext_id_overdue_payback = ext_id_overdue_payback;
        this.ext_id_study_loanowing = ext_id_study_loanowing;
        this.ext_id_name_creditoverdue = ext_id_name_creditoverdue;
        this.ext_id_name_creditcrackgray = ext_id_name_creditcrackgray;
        this.ext_id_name_courtperforming = ext_id_name_courtperforming;
        this.ext_id_name_courtclosegray = ext_id_name_courtclosegray;
        this.ext_id_location_highrisk = ext_id_location_highrisk;
        this.ext_id_highrisk = ext_id_highrisk;
    }
	
	/**
	 *方法: 取得身份证命中法院执行名单
	 *@return: double 身份证命中法院执行名单
	 */
	
	public double getExt_id_court_performing(){
		return this.ext_id_court_performing;
	}

	/**
	 *方法: 设置身份证命中法院执行名单
	 *@param: double 身份证命中法院执行名单
	 */
	public void setExt_id_court_performing(double ext_id_court_performing){
		this.ext_id_court_performing = ext_id_court_performing;
	}
	/**
	 *方法: 取得身份证命中法院失信名单
	 *@return: double 身份证命中法院失信名单
	 */
	
	public double getExt_id_court(){
		return this.ext_id_court;
	}

	/**
	 *方法: 设置身份证命中法院失信名单
	 *@param: double 身份证命中法院失信名单
	 */
	public void setExt_id_court(double ext_id_court){
		this.ext_id_court = ext_id_court;
	}
	/**
	 *方法: 取得身份证命中刑事犯罪名单
	 *@return: double 身份证命中刑事犯罪名单
	 */
	
	public double getExt_id_crime(){
		return this.ext_id_crime;
	}

	/**
	 *方法: 设置身份证命中刑事犯罪名单
	 *@param: double 身份证命中刑事犯罪名单
	 */
	public void setExt_id_crime(double ext_id_crime){
		this.ext_id_crime = ext_id_crime;
	}
	/**
	 *方法: 取得身份证命中欠款公司法人代表名单
	 *@return: double 身份证命中欠款公司法人代表名单
	 */
	
	public double getExt_id_company_capitalowing(){
		return this.ext_id_company_capitalowing;
	}

	/**
	 *方法: 设置身份证命中欠款公司法人代表名单
	 *@param: double 身份证命中欠款公司法人代表名单
	 */
	public void setExt_id_company_capitalowing(double ext_id_company_capitalowing){
		this.ext_id_company_capitalowing = ext_id_company_capitalowing;
	}
	/**
	 *方法: 取得身份证命中欠税公司法人代表名单
	 *@return: double 身份证命中欠税公司法人代表名单
	 */
	
	public double getExt_id_company_taxowing(){
		return this.ext_id_company_taxowing;
	}

	/**
	 *方法: 设置身份证命中欠税公司法人代表名单
	 *@param: double 身份证命中欠税公司法人代表名单
	 */
	public void setExt_id_company_taxowing(double ext_id_company_taxowing){
		this.ext_id_company_taxowing = ext_id_company_taxowing;
	}
	/**
	 *方法: 取得身份证命中法院结案名单
	 *@return: double 身份证命中法院结案名单
	 */
	
	public double getExt_id_courtclose(){
		return this.ext_id_courtclose;
	}

	/**
	 *方法: 设置身份证命中法院结案名单
	 *@param: double 身份证命中法院结案名单
	 */
	public void setExt_id_courtclose(double ext_id_courtclose){
		this.ext_id_courtclose = ext_id_courtclose;
	}
	/**
	 *方法: 取得身份证命中车辆租赁违约名单
	 *@return: double 身份证命中车辆租赁违约名单
	 */
	
	public double getExt_id_carrental(){
		return this.ext_id_carrental;
	}

	/**
	 *方法: 设置身份证命中车辆租赁违约名单
	 *@param: double 身份证命中车辆租赁违约名单
	 */
	public void setExt_id_carrental(double ext_id_carrental){
		this.ext_id_carrental = ext_id_carrental;
	}
	/**
	 *方法: 取得身份证命中车贷风险名单
	 *@return: double 身份证命中车贷风险名单
	 */
	
	public double getExt_id_carloan(){
		return this.ext_id_carloan;
	}

	/**
	 *方法: 设置身份证命中车贷风险名单
	 *@param: double 身份证命中车贷风险名单
	 */
	public void setExt_id_carloan(double ext_id_carloan){
		this.ext_id_carloan = ext_id_carloan;
	}
	/**
	 *方法: 取得身份证命中欠税名单
	 *@return: double 身份证命中欠税名单
	 */
	
	public double getExt_id_taxowing(){
		return this.ext_id_taxowing;
	}

	/**
	 *方法: 设置身份证命中欠税名单
	 *@param: double 身份证命中欠税名单
	 */
	public void setExt_id_taxowing(double ext_id_taxowing){
		this.ext_id_taxowing = ext_id_taxowing;
	}
	/**
	 *方法: 取得身份证命中信贷逾期名单
	 *@return: double 身份证命中信贷逾期名单
	 */
	
	public double getExt_id_overdue(){
		return this.ext_id_overdue;
	}

	/**
	 *方法: 设置身份证命中信贷逾期名单
	 *@param: double 身份证命中信贷逾期名单
	 */
	public void setExt_id_overdue(double ext_id_overdue){
		this.ext_id_overdue = ext_id_overdue;
	}
	/**
	 *方法: 取得身份证命中信贷逾期后还款名单
	 *@return: double 身份证命中信贷逾期后还款名单
	 */
	
	public double getExt_id_overdue_payback(){
		return this.ext_id_overdue_payback;
	}

	/**
	 *方法: 设置身份证命中信贷逾期后还款名单
	 *@param: double 身份证命中信贷逾期后还款名单
	 */
	public void setExt_id_overdue_payback(double ext_id_overdue_payback){
		this.ext_id_overdue_payback = ext_id_overdue_payback;
	}
	/**
	 *方法: 取得身份证命中助学贷款欠费名单
	 *@return: double 身份证命中助学贷款欠费名单
	 */
	
	public double getExt_id_study_loanowing(){
		return this.ext_id_study_loanowing;
	}

	/**
	 *方法: 设置身份证命中助学贷款欠费名单
	 *@param: double 身份证命中助学贷款欠费名单
	 */
	public void setExt_id_study_loanowing(double ext_id_study_loanowing){
		this.ext_id_study_loanowing = ext_id_study_loanowing;
	}
	/**
	 *方法: 取得身份证_姓名命中信贷逾期模糊名单
	 *@return: double 身份证_姓名命中信贷逾期模糊名单
	 */
	
	public double getExt_id_name_creditoverdue(){
		return this.ext_id_name_creditoverdue;
	}

	/**
	 *方法: 设置身份证_姓名命中信贷逾期模糊名单
	 *@param: double 身份证_姓名命中信贷逾期模糊名单
	 */
	public void setExt_id_name_creditoverdue(double ext_id_name_creditoverdue){
		this.ext_id_name_creditoverdue = ext_id_name_creditoverdue;
	}
	/**
	 *方法: 取得身份证_姓名命中法院失信模糊名单
	 *@return: double 身份证_姓名命中法院失信模糊名单
	 */
	
	public double getExt_id_name_creditcrackgray(){
		return this.ext_id_name_creditcrackgray;
	}

	/**
	 *方法: 设置身份证_姓名命中法院失信模糊名单
	 *@param: double 身份证_姓名命中法院失信模糊名单
	 */
	public void setExt_id_name_creditcrackgray(double ext_id_name_creditcrackgray){
		this.ext_id_name_creditcrackgray = ext_id_name_creditcrackgray;
	}
	/**
	 *方法: 取得身份证_姓名命中法院执行模糊名单
	 *@return: double 身份证_姓名命中法院执行模糊名单
	 */
	
	public double getExt_id_name_courtperforming(){
		return this.ext_id_name_courtperforming;
	}

	/**
	 *方法: 设置身份证_姓名命中法院执行模糊名单
	 *@param: double 身份证_姓名命中法院执行模糊名单
	 */
	public void setExt_id_name_courtperforming(double ext_id_name_courtperforming){
		this.ext_id_name_courtperforming = ext_id_name_courtperforming;
	}
	/**
	 *方法: 取得身份证_姓名命中法院结案模糊名单
	 *@return: double 身份证_姓名命中法院结案模糊名单
	 */
	
	public double getExt_id_name_courtclosegray(){
		return this.ext_id_name_courtclosegray;
	}

	/**
	 *方法: 设置身份证_姓名命中法院结案模糊名单
	 *@param: double 身份证_姓名命中法院结案模糊名单
	 */
	public void setExt_id_name_courtclosegray(double ext_id_name_courtclosegray){
		this.ext_id_name_courtclosegray = ext_id_name_courtclosegray;
	}
	/**
	 *方法: 取得身份证归属地位于高风险较为集中地区
	 *@return: double 身份证归属地位于高风险较为集中地区
	 */
	
	public double getExt_id_location_highrisk(){
		return this.ext_id_location_highrisk;
	}

	/**
	 *方法: 设置身份证归属地位于高风险较为集中地区
	 *@param: double 身份证归属地位于高风险较为集中地区
	 */
	public void setExt_id_location_highrisk(double ext_id_location_highrisk){
		this.ext_id_location_highrisk = ext_id_location_highrisk;
	}
	/**
	 *方法: 取得身份证命中高风险关注名单
	 *@return: double 身份证命中高风险关注名单
	 */
	
	public double getExt_id_highrisk(){
		return this.ext_id_highrisk;
	}

	/**
	 *方法: 设置身份证命中高风险关注名单
	 *@param: double 身份证命中高风险关注名单
	 */
	public void setExt_id_highrisk(double ext_id_highrisk){
		this.ext_id_highrisk = ext_id_highrisk;
	}
}
