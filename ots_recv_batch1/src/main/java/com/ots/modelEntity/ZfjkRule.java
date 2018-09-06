package com.ots.modelEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class ZfjkRule implements java.io.Serializable {
	@XmlElement(name = "审批结果") 	
	private String result = "-999999";
	@XmlElement(name = "拒绝原因") 	
	private List<String> reason = new ArrayList<String>();
	@XmlElement(name = "风险名单客户") 	
	private String zf_riskList = "-999999";
	@XmlElement(name = "最大逾期状态不符合准入规则") 	
	private int zf_maxOverdue = -999999;
	@XmlElement(name = "累计逾期次数不符合准入规则") 	
	private int zf_countOverdue = -999999;
	@XmlElement(name = "拒贷机构数不符合准入规则") 	
	private int zf_refuseOrgan = -999999;
	@XmlElement(name = "欠款金额不符合准入规则") 	
	private double zf_overdueAmount = -999999;
	@XmlElement(name = "是否准入") 	
	private String admit = "-999999";
	@XmlElement(name = "拒绝码") 	
	private String refuseCode = "-999999";
	@XmlElement(name = "拒绝描述") 	
	private String refuseMsg = "-999999";

	    /********** constructors ***********/
    public ZfjkRule() {
     
    }
   
    public ZfjkRule( String result, List<String> reason, String zf_riskList, int zf_maxOverdue, int zf_countOverdue, int zf_refuseOrgan, double zf_overdueAmount, String admit, String refuseCode, String refuseMsg) {
        this.result = result;
        this.reason = reason;
        this.zf_riskList = zf_riskList;
        this.zf_maxOverdue = zf_maxOverdue;
        this.zf_countOverdue = zf_countOverdue;
        this.zf_refuseOrgan = zf_refuseOrgan;
        this.zf_overdueAmount = zf_overdueAmount;
        this.admit = admit;
        this.refuseCode = refuseCode;
        this.refuseMsg = refuseMsg;
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
	 *方法: 取得风险名单客户
	 *@return: String 风险名单客户
	 */
	
	public String getZf_riskList(){
		return this.zf_riskList;
	}

	/**
	 *方法: 设置风险名单客户
	 *@param: String 风险名单客户
	 */
	public void setZf_riskList(String zf_riskList){
		this.zf_riskList = zf_riskList;
	}
	/**
	 *方法: 取得最大逾期状态不符合准入规则
	 *@return: int 最大逾期状态不符合准入规则
	 */
	
	public int getZf_maxOverdue(){
		return this.zf_maxOverdue;
	}

	/**
	 *方法: 设置最大逾期状态不符合准入规则
	 *@param: int 最大逾期状态不符合准入规则
	 */
	public void setZf_maxOverdue(int zf_maxOverdue){
		this.zf_maxOverdue = zf_maxOverdue;
	}
	/**
	 *方法: 取得累计逾期次数不符合准入规则
	 *@return: int 累计逾期次数不符合准入规则
	 */
	
	public int getZf_countOverdue(){
		return this.zf_countOverdue;
	}

	/**
	 *方法: 设置累计逾期次数不符合准入规则
	 *@param: int 累计逾期次数不符合准入规则
	 */
	public void setZf_countOverdue(int zf_countOverdue){
		this.zf_countOverdue = zf_countOverdue;
	}
	/**
	 *方法: 取得拒贷机构数不符合准入规则
	 *@return: int 拒贷机构数不符合准入规则
	 */
	
	public int getZf_refuseOrgan(){
		return this.zf_refuseOrgan;
	}

	/**
	 *方法: 设置拒贷机构数不符合准入规则
	 *@param: int 拒贷机构数不符合准入规则
	 */
	public void setZf_refuseOrgan(int zf_refuseOrgan){
		this.zf_refuseOrgan = zf_refuseOrgan;
	}
	/**
	 *方法: 取得欠款金额不符合准入规则
	 *@return: double 欠款金额不符合准入规则
	 */
	
	public double getZf_overdueAmount(){
		return this.zf_overdueAmount;
	}

	/**
	 *方法: 设置欠款金额不符合准入规则
	 *@param: double 欠款金额不符合准入规则
	 */
	public void setZf_overdueAmount(double zf_overdueAmount){
		this.zf_overdueAmount = zf_overdueAmount;
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
