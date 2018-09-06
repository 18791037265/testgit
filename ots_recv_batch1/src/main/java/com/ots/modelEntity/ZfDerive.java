package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class ZfDerive implements java.io.Serializable {
	@XmlElement(name = "智帆金科反馈方列表") 	
	private List<Zfjk> zfjkList = new ArrayList<Zfjk>();
	@XmlElement(name = "最大逾期数") 	
	private int zf_maxOverdue = -999999;
	@XmlElement(name = "累计逾期次数") 	
	private int zf_countOverdue = -999999;
	@XmlElement(name = "拒贷机构数") 	
	private int zf_refuseOrgan = -999999;
	@XmlElement(name = "智帆金科反馈方列表去重") 	
	private List<Zfjk> zfjkTempList = new ArrayList<Zfjk>();
	@XmlElement(name = "欠款总金额") 	
	private double zf_overdueAmount = -999999;
	@XmlElement(name = "风险名单状态") 	
	private String zf_riskList = "-999999";

	    /********** constructors ***********/
    public ZfDerive() {
     
    }
   
    public ZfDerive( List<Zfjk> zfjkList, int zf_maxOverdue, int zf_countOverdue, int zf_refuseOrgan, List<Zfjk> zfjkTempList, double zf_overdueAmount, String zf_riskList) {
        this.zfjkList = zfjkList;
        this.zf_maxOverdue = zf_maxOverdue;
        this.zf_countOverdue = zf_countOverdue;
        this.zf_refuseOrgan = zf_refuseOrgan;
        this.zfjkTempList = zfjkTempList;
        this.zf_overdueAmount = zf_overdueAmount;
        this.zf_riskList = zf_riskList;
    }
	
	/**
	 *方法: 取得智帆金科反馈方列表
	 *@return: List<Zfjk> 智帆金科反馈方列表
	 */
	
	public List<Zfjk> getZfjkList(){
		return this.zfjkList;
	}

	/**
	 *方法: 设置智帆金科反馈方列表
	 *@param: List<Zfjk> 智帆金科反馈方列表
	 */
	public void setZfjkList(List<Zfjk> zfjkList){
		this.zfjkList = zfjkList;
	}
	/**
	 *方法: 取得最大逾期数
	 *@return: int 最大逾期数
	 */
	
	public int getZf_maxOverdue(){
		return this.zf_maxOverdue;
	}

	/**
	 *方法: 设置最大逾期数
	 *@param: int 最大逾期数
	 */
	public void setZf_maxOverdue(int zf_maxOverdue){
		this.zf_maxOverdue = zf_maxOverdue;
	}
	/**
	 *方法: 取得累计逾期次数
	 *@return: int 累计逾期次数
	 */
	
	public int getZf_countOverdue(){
		return this.zf_countOverdue;
	}

	/**
	 *方法: 设置累计逾期次数
	 *@param: int 累计逾期次数
	 */
	public void setZf_countOverdue(int zf_countOverdue){
		this.zf_countOverdue = zf_countOverdue;
	}
	/**
	 *方法: 取得拒贷机构数
	 *@return: int 拒贷机构数
	 */
	
	public int getZf_refuseOrgan(){
		return this.zf_refuseOrgan;
	}

	/**
	 *方法: 设置拒贷机构数
	 *@param: int 拒贷机构数
	 */
	public void setZf_refuseOrgan(int zf_refuseOrgan){
		this.zf_refuseOrgan = zf_refuseOrgan;
	}
	/**
	 *方法: 取得智帆金科反馈方列表去重
	 *@return: List<Zfjk> 智帆金科反馈方列表去重
	 */
	
	public List<Zfjk> getZfjkTempList(){
		return this.zfjkTempList;
	}

	/**
	 *方法: 设置智帆金科反馈方列表去重
	 *@param: List<Zfjk> 智帆金科反馈方列表去重
	 */
	public void setZfjkTempList(List<Zfjk> zfjkTempList){
		this.zfjkTempList = zfjkTempList;
	}
	/**
	 *方法: 取得欠款总金额
	 *@return: double 欠款总金额
	 */
	
	public double getZf_overdueAmount(){
		return this.zf_overdueAmount;
	}

	/**
	 *方法: 设置欠款总金额
	 *@param: double 欠款总金额
	 */
	public void setZf_overdueAmount(double zf_overdueAmount){
		this.zf_overdueAmount = zf_overdueAmount;
	}
	/**
	 *方法: 取得风险名单状态
	 *@return: String 风险名单状态
	 */
	
	public String getZf_riskList(){
		return this.zf_riskList;
	}

	/**
	 *方法: 设置风险名单状态
	 *@param: String 风险名单状态
	 */
	public void setZf_riskList(String zf_riskList){
		this.zf_riskList = zf_riskList;
	}
}
