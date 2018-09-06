package com.ots.entity;

/**
 * 同盾请求实体
 * @author pf
 *
 */
public class TongAntiFraud {
	private String partner_code;// 由同盾分配，权限校验用
	private String partner_key;// 由同盾分配，权限校验用
	private String app_name;//由同盾分配，权限校验用
	private String biz_code;// 由同盾分配，选择业务流用
	private String account_name;//借款人姓名   必填，限定2-15个中文字符，如：张四海、努尔·麦麦提
	private String id_number;//借款人身份证   必填，请填写18或15位省份证
	private String account_mobile;//借款人手机  必填，请填写11位中国内地手机号
	private String loan_date	;//	贷款日期
	private String loan_amount	;//	贷款金额
	private String loan_term	;//	贷款期限
	private String loan_purpose	;//	借款用途
	private String apply_channel	;//	进件渠道
	private String customer_channel	;//	获客渠道
	private String apply_city	;//	进件城市
	private String apply_province	;//	进件省份
	private String account_email	;//	借款人邮箱
	private String account_phone	;//	借款人座机
	private String qq_number	;//	借款人QQ
	private String card_number	;//	借款人卡号
	private String home_address	;//	家庭地址
	private String applyer_type	;//	人员类别
	private String organization	;//	借款人工作单位
	private String organization_address	;//	工作单位地址
	private String company_type	;//	公司性质
	private String industry	;//	所属行业
	private String work_time	;//	工作时间
	private String occupation	;//	职位
	private String career	;	/*职业   （政府官员、公务员；专业人员；企业高中级主管；军官；企业负责人、股东；企业基层主管、半专业人员；警察，消防员；
	                             	操作人员；现役军人；技能工作、文艺工作者；个体商店老板；一般工人；业务人员；收货人员；无技术工人；
	                             	保安、司机、服务、外送人员；农林牧渔；清洁人员；摊贩；实习生；退休；家庭主妇；学生；失业）其中之一*/
	private String monthly_income	;//	月均收入
	private String annual_income	;//	年收入  (10000以下；10000-50000；50000-100000；100000-200000；200000以上)其中之一
	private String work_phone	;//	单位座机   格式(区号+号码) 0571-1111111
	private String diploma	;//	学历
	private String graduate_school	;//	借款人毕业院校
	private String marriage	;//	婚姻情况
	private String house_property	;//	房产情况   （无房；有房有贷款；有房无贷款；其他）其中之一
	private String house_type	;//	房产类型
	private String contact_address	;//	通讯地址
	private String is_cross_loan	;//	是否曾跨平台借款
	private String contact1_name	;//	第一联系人姓名
	private String contact1_mobile	;//	第一联系人手机号
	private String contact2_name	;//	第二联系人姓名
	private String contact2_mobile	;//	第二联系人手机号
	private String contact3_name	;//	第三联系人姓名
	private String contact3_mobile	;//	第三联系人手机号
	private String contact1_relation	;//	第一联系人社会关系
	private String contact1_id_number	;//	第一联系人身份证
	private String contact2_relation	;//	第二联系人社会关系
	private String contact2_id_number	;//	第二联系人身份证
	private String contact3_relation	;//	第三联系人社会关系
	private String contact3_id_number	;//	第三联系人身份证
	private String contact4_relation	;//	第四联系人社会关系
	private String contact4_name	;//	第四联系人姓名
	private String contact4_id_number	;//	第四联系人身份证
	private String contact4_mobile	;//	第四联系人手机号
	private String contact5_relation	;//	第五联系人社会关系
	private String contact5_name	;//	第五联系人姓名
	private String contact5_id_number	;//	第五联系人身份证
	private String contact5_mobile	;//	第五联系人手机号
	private String coborrower_name	;//	共同借款人姓名
	private String coborrower_id_number	;//	共同借款人身份证
	private String coborrower_mobile	;//	共同借款人手机
	private String coborrower_phone	;//	共同借款人座机
	private String coborrower_home_address	;//	共同借款人家庭地址
	private String coborrower_company_address	;//	共同借款人公司地址
	private String surety_name	;//	担保人姓名
	private String surety_id_number	;//	担保人身份证
	private String surety_mobile	;//	担保人手机
	private String surety_phone	;//	担保人座机
	private String surety_home_address	;//	担保人家庭地址
	private String surety_company_address	;//	担保人公司地址
	private String ip_address	;//	IP

	
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getAccount_mobile() {
		return account_mobile;
	}
	public void setAccount_mobile(String account_mobile) {
		this.account_mobile = account_mobile;
	}
	public String getPartner_code() {
		return partner_code;
	}
	public void setPartner_code(String partner_code) {
		this.partner_code = partner_code;
	}
	public String getPartner_key() {
		return partner_key;
	}
	public void setPartner_key(String partner_key) {
		this.partner_key = partner_key;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getBiz_code() {
		return biz_code;
	}
	public void setBiz_code(String biz_code) {
		this.biz_code = biz_code;
	}
	public String getLoan_date() {
		return loan_date;
	}
	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}
	public String getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(String loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getLoan_term() {
		return loan_term;
	}
	public void setLoan_term(String loan_term) {
		this.loan_term = loan_term;
	}
	public String getLoan_purpose() {
		return loan_purpose;
	}
	public void setLoan_purpose(String loan_purpose) {
		this.loan_purpose = loan_purpose;
	}
	public String getApply_channel() {
		return apply_channel;
	}
	public void setApply_channel(String apply_channel) {
		this.apply_channel = apply_channel;
	}
	public String getCustomer_channel() {
		return customer_channel;
	}
	public void setCustomer_channel(String customer_channel) {
		this.customer_channel = customer_channel;
	}
	public String getApply_city() {
		return apply_city;
	}
	public void setApply_city(String apply_city) {
		this.apply_city = apply_city;
	}
	public String getApply_province() {
		return apply_province;
	}
	public void setApply_province(String apply_province) {
		this.apply_province = apply_province;
	}
	public String getAccount_email() {
		return account_email;
	}
	public void setAccount_email(String account_email) {
		this.account_email = account_email;
	}
	public String getAccount_phone() {
		return account_phone;
	}
	public void setAccount_phone(String account_phone) {
		this.account_phone = account_phone;
	}
	public String getQq_number() {
		return qq_number;
	}
	public void setQq_number(String qq_number) {
		this.qq_number = qq_number;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getHome_address() {
		return home_address;
	}
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	public String getApplyer_type() {
		return applyer_type;
	}
	public void setApplyer_type(String applyer_type) {
		this.applyer_type = applyer_type;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getOrganization_address() {
		return organization_address;
	}
	public void setOrganization_address(String organization_address) {
		this.organization_address = organization_address;
	}
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getWork_time() {
		return work_time;
	}
	public void setWork_time(String work_time) {
		this.work_time = work_time;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getMonthly_income() {
		return monthly_income;
	}
	public void setMonthly_income(String monthly_income) {
		this.monthly_income = monthly_income;
	}
	public String getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(String annual_income) {
		this.annual_income = annual_income;
	}
	public String getWork_phone() {
		return work_phone;
	}
	public void setWork_phone(String work_phone) {
		this.work_phone = work_phone;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
	public String getGraduate_school() {
		return graduate_school;
	}
	public void setGraduate_school(String graduate_school) {
		this.graduate_school = graduate_school;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getHouse_property() {
		return house_property;
	}
	public void setHouse_property(String house_property) {
		this.house_property = house_property;
	}
	public String getHouse_type() {
		return house_type;
	}
	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}
	public String getContact_address() {
		return contact_address;
	}
	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}
	public String getIs_cross_loan() {
		return is_cross_loan;
	}
	public void setIs_cross_loan(String is_cross_loan) {
		this.is_cross_loan = is_cross_loan;
	}
	public String getContact1_name() {
		return contact1_name;
	}
	public void setContact1_name(String contact1_name) {
		this.contact1_name = contact1_name;
	}
	public String getContact1_mobile() {
		return contact1_mobile;
	}
	public void setContact1_mobile(String contact1_mobile) {
		this.contact1_mobile = contact1_mobile;
	}
	public String getContact2_name() {
		return contact2_name;
	}
	public void setContact2_name(String contact2_name) {
		this.contact2_name = contact2_name;
	}
	public String getContact2_mobile() {
		return contact2_mobile;
	}
	public void setContact2_mobile(String contact2_mobile) {
		this.contact2_mobile = contact2_mobile;
	}
	public String getContact3_name() {
		return contact3_name;
	}
	public void setContact3_name(String contact3_name) {
		this.contact3_name = contact3_name;
	}
	public String getContact3_mobile() {
		return contact3_mobile;
	}
	public void setContact3_mobile(String contact3_mobile) {
		this.contact3_mobile = contact3_mobile;
	}
	public String getContact1_relation() {
		return contact1_relation;
	}
	public void setContact1_relation(String contact1_relation) {
		this.contact1_relation = contact1_relation;
	}
	public String getContact1_id_number() {
		return contact1_id_number;
	}
	public void setContact1_id_number(String contact1_id_number) {
		this.contact1_id_number = contact1_id_number;
	}
	public String getContact2_relation() {
		return contact2_relation;
	}
	public void setContact2_relation(String contact2_relation) {
		this.contact2_relation = contact2_relation;
	}
	public String getContact2_id_number() {
		return contact2_id_number;
	}
	public void setContact2_id_number(String contact2_id_number) {
		this.contact2_id_number = contact2_id_number;
	}
	public String getContact3_relation() {
		return contact3_relation;
	}
	public void setContact3_relation(String contact3_relation) {
		this.contact3_relation = contact3_relation;
	}
	public String getContact3_id_number() {
		return contact3_id_number;
	}
	public void setContact3_id_number(String contact3_id_number) {
		this.contact3_id_number = contact3_id_number;
	}
	public String getContact4_relation() {
		return contact4_relation;
	}
	public void setContact4_relation(String contact4_relation) {
		this.contact4_relation = contact4_relation;
	}
	public String getContact4_name() {
		return contact4_name;
	}
	public void setContact4_name(String contact4_name) {
		this.contact4_name = contact4_name;
	}
	public String getContact4_id_number() {
		return contact4_id_number;
	}
	public void setContact4_id_number(String contact4_id_number) {
		this.contact4_id_number = contact4_id_number;
	}
	public String getContact4_mobile() {
		return contact4_mobile;
	}
	public void setContact4_mobile(String contact4_mobile) {
		this.contact4_mobile = contact4_mobile;
	}
	public String getContact5_relation() {
		return contact5_relation;
	}
	public void setContact5_relation(String contact5_relation) {
		this.contact5_relation = contact5_relation;
	}
	public String getContact5_name() {
		return contact5_name;
	}
	public void setContact5_name(String contact5_name) {
		this.contact5_name = contact5_name;
	}
	public String getContact5_id_number() {
		return contact5_id_number;
	}
	public void setContact5_id_number(String contact5_id_number) {
		this.contact5_id_number = contact5_id_number;
	}
	public String getContact5_mobile() {
		return contact5_mobile;
	}
	public void setContact5_mobile(String contact5_mobile) {
		this.contact5_mobile = contact5_mobile;
	}
	public String getCoborrower_name() {
		return coborrower_name;
	}
	public void setCoborrower_name(String coborrower_name) {
		this.coborrower_name = coborrower_name;
	}
	public String getCoborrower_id_number() {
		return coborrower_id_number;
	}
	public void setCoborrower_id_number(String coborrower_id_number) {
		this.coborrower_id_number = coborrower_id_number;
	}
	public String getCoborrower_mobile() {
		return coborrower_mobile;
	}
	public void setCoborrower_mobile(String coborrower_mobile) {
		this.coborrower_mobile = coborrower_mobile;
	}
	public String getCoborrower_phone() {
		return coborrower_phone;
	}
	public void setCoborrower_phone(String coborrower_phone) {
		this.coborrower_phone = coborrower_phone;
	}
	public String getCoborrower_home_address() {
		return coborrower_home_address;
	}
	public void setCoborrower_home_address(String coborrower_home_address) {
		this.coborrower_home_address = coborrower_home_address;
	}
	public String getCoborrower_company_address() {
		return coborrower_company_address;
	}
	public void setCoborrower_company_address(String coborrower_company_address) {
		this.coborrower_company_address = coborrower_company_address;
	}
	public String getSurety_name() {
		return surety_name;
	}
	public void setSurety_name(String surety_name) {
		this.surety_name = surety_name;
	}
	public String getSurety_id_number() {
		return surety_id_number;
	}
	public void setSurety_id_number(String surety_id_number) {
		this.surety_id_number = surety_id_number;
	}
	public String getSurety_mobile() {
		return surety_mobile;
	}
	public void setSurety_mobile(String surety_mobile) {
		this.surety_mobile = surety_mobile;
	}
	public String getSurety_phone() {
		return surety_phone;
	}
	public void setSurety_phone(String surety_phone) {
		this.surety_phone = surety_phone;
	}
	public String getSurety_home_address() {
		return surety_home_address;
	}
	public void setSurety_home_address(String surety_home_address) {
		this.surety_home_address = surety_home_address;
	}
	public String getSurety_company_address() {
		return surety_company_address;
	}
	public void setSurety_company_address(String surety_company_address) {
		this.surety_company_address = surety_company_address;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	@Override
	public String toString() {
		return "TongAntiFraud [partner_code=" + partner_code + ", partner_key=" + partner_key + ", app_name=" + app_name
				+ ", biz_code=" + biz_code + ", account_name=" + account_name + ", id_number=" + id_number
				+ ", account_mobile=" + account_mobile + ", loan_date=" + loan_date + ", loan_amount=" + loan_amount
				+ ", loan_term=" + loan_term + ", loan_purpose=" + loan_purpose + ", apply_channel=" + apply_channel
				+ ", customer_channel=" + customer_channel + ", apply_city=" + apply_city + ", apply_province="
				+ apply_province + ", account_email=" + account_email + ", account_phone=" + account_phone
				+ ", qq_number=" + qq_number + ", card_number=" + card_number + ", home_address=" + home_address
				+ ", applyer_type=" + applyer_type + ", organization=" + organization + ", organization_address="
				+ organization_address + ", company_type=" + company_type + ", industry=" + industry + ", work_time="
				+ work_time + ", occupation=" + occupation + ", career=" + career + ", monthly_income=" + monthly_income
				+ ", annual_income=" + annual_income + ", work_phone=" + work_phone + ", diploma=" + diploma
				+ ", graduate_school=" + graduate_school + ", marriage=" + marriage + ", house_property="
				+ house_property + ", house_type=" + house_type + ", contact_address=" + contact_address
				+ ", is_cross_loan=" + is_cross_loan + ", contact1_name=" + contact1_name + ", contact1_mobile="
				+ contact1_mobile + ", contact2_name=" + contact2_name + ", contact2_mobile=" + contact2_mobile
				+ ", contact3_name=" + contact3_name + ", contact3_mobile=" + contact3_mobile + ", contact1_relation="
				+ contact1_relation + ", contact1_id_number=" + contact1_id_number + ", contact2_relation="
				+ contact2_relation + ", contact2_id_number=" + contact2_id_number + ", contact3_relation="
				+ contact3_relation + ", contact3_id_number=" + contact3_id_number + ", contact4_relation="
				+ contact4_relation + ", contact4_name=" + contact4_name + ", contact4_id_number=" + contact4_id_number
				+ ", contact4_mobile=" + contact4_mobile + ", contact5_relation=" + contact5_relation
				+ ", contact5_name=" + contact5_name + ", contact5_id_number=" + contact5_id_number
				+ ", contact5_mobile=" + contact5_mobile + ", coborrower_name=" + coborrower_name
				+ ", coborrower_id_number=" + coborrower_id_number + ", coborrower_mobile=" + coborrower_mobile
				+ ", coborrower_phone=" + coborrower_phone + ", coborrower_home_address=" + coborrower_home_address
				+ ", coborrower_company_address=" + coborrower_company_address + ", surety_name=" + surety_name
				+ ", surety_id_number=" + surety_id_number + ", surety_mobile=" + surety_mobile + ", surety_phone="
				+ surety_phone + ", surety_home_address=" + surety_home_address + ", surety_company_address="
				+ surety_company_address + ", ip_address=" + ip_address + "]";
	}
	
	

}
