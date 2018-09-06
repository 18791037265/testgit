package com.ots.entity;

//530040客户建立
public class BeaiCEstablishCumRequestBean extends BeaICommBean {
    //客户号
    private String customernumber;
    //客户类型
    private String custtype;
    //客户经理
    private String persbankerbr;
    //个人客户称谓
    private String titlecode;
    //nan
    private String keyfirstname;
    //姓名
    private String keysurname;
    //公司名称
    private String name;
    //证件到期日
    private String idexpiry;
    //国民经济部门
    private String nat_eco;
    //企业出资人经济成分
    private String corp_eco;
    //地址栏1
    private String add1;
    //地址栏2
    private String add2;
    //nan
    private String foreignaddr1;
    //nan
    private String foreignaddr2;
    //邮政编码
    private String postcode;
    //存款对帐单类型
    private String depstmttype;
    //是否新增密码
    private String newpswdflag;
    //居住地
    private String rescountrycode;
    //家庭电话
    private String phonenores;
    //传真号
    private String faxno;
    //公司电话
    private String phonenobus;
    //移动电话号码
    private String mobileno;
    //国籍
    private String natcode;
    //房屋所有权人
    private String occupancy;
    //语言
    private String langcode;
    //证件号码
    private String idno;
    //证件签发日
    private String idissue;
    //证件签发地
    private String idplace;
    //证件类型
    private String idtype;
    //国内风险
    private String domesticrisk;
    //洗钱风险
    private String crossborderrisk;
    //贵宾代码
    private String vipcode;
    //状态
    private String restrictstatus;
    //客户段
    private String segmentcode;
    //锁柜持有人
    private String lockerholder;
    //税档号标识
    private String tfnind;
    //开户机构
    private String homebranchno;
    //客户
    private String ccustlmtind;
    //客户上级
    private String ccustpalmtind;
    //行业
    private String cindulmtind;
    //国家
    private String ccntylmtind;
    //部门
    private String csectorlmtind;
    //行业分类
    private String industrycode;
    //风险国家
    private String countryofrisk;
    //nan
    private String groupcode;
    //业务部门代码
    private String bussectorcode;
    //nan
    private String newbizid;
    //nan
    private String newbizidtp;
    //提示码
    private String promo;
    //帐户经理主管
    private String aomgr;
    //税率
    private String wtaxtype;
    //对账单周期
    private String stmtfreq;
    //周期
    private String stmtcycle;
    //天
    private String stmtday;
    //个人数据安全法律许可
    private String pdslawagree;
    //省/市 区/县
    private String add3area;
    //nan
    private String add3filler;
    //结售汇类型
    private String fxsptype;
    //nan
    private String add4;
    //注册地点
    private String foreignaddr3;
    //出生日期
    private String birthday;
    //非金融机构融资类企业
    private String nonfinainst;
    //职业
    private String occupationcode2;
    //CRS分类
    private String crstype;
    //CRS子类
    private String crssubtype;
    //尽调状态
    private String crsstat;
    //nan
    private String lstmdt;
    //nan
    private String lstmbr;
    //nan
    private String lstmtelr;
    //状态2
    private String status2;
    //状态3
    private String status3;
    //资产规模
    private String assetsize;
    //工商年检情况
    private String annualaudit;
    //企业类型
    private String corpcat;
    //组织形式
    private String bustype;
    //变更证件请求
    private String idchgreqby;
    //外国人/大陆人旧证件号码
    private String fororigid;
    //主要市场参与者
    private String majmrkt;
    //使用外汇买卖系统
    private String fxind;
    //使用开放式基金系统
    private String mfind;
    //使用保理业务
    private String factoring;
    //央行行业代码
    private String cbcode;
    //电话号码是否正确
    private String telnotcor;
    //客户介绍部门
    private String introdept;
    //证件变更分行
    private String idchanbr;
    //客户联系人
    private String contcustphone;
    //公共报文
    private BeaiCHeaderRequestBean requestHeader;
    //报文长度
    private int[] msgLen = {17,2,6,2,40,40,60,8,5,7,40,40,40,40,6,1,1,2,16,16,16,16,2,1,2,24,8,30,2,2,2,2,3,5,1,1,5,1,1,1,1,1,6,2,5,5,24,2,2,6,2,1,2,2,1,6,34,2,40,40,8,1,2,1,1,1,8,4,5,1,1,2,1,2,2,1,11,1,1,1,1,6,1,1,4,1};
    //报文类型
    private String[] msgType = {"N","C","N","N","C","C","C","C","C","C","C","C","C","C","N","C","C","C","C","C","C","C","C","C","N","C","N","C","C","C","C","N","N","C","C","C","N","C","C","C","C","C","C","C","C","N","C","C","C","N","N","C","N","N","C","C","C","C","C","C","C","N","C","C","C","N","N","N","N","N","N","C","C","C","C","N","N","N","C","C","C","C","C","C","C","C","N","C"};
	public String getCustomernumber() {
		return customernumber;
	}
	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}
	public String getCusttype() {
		return custtype;
	}
	public void setCusttype(String custtype) {
		this.custtype = custtype;
	}
	public String getPersbankerbr() {
		return persbankerbr;
	}
	public void setPersbankerbr(String persbankerbr) {
		this.persbankerbr = persbankerbr;
	}
	public String getTitlecode() {
		return titlecode;
	}
	public void setTitlecode(String titlecode) {
		this.titlecode = titlecode;
	}
	public String getKeyfirstname() {
		return keyfirstname;
	}
	public void setKeyfirstname(String keyfirstname) {
		this.keyfirstname = keyfirstname;
	}
	public String getKeysurname() {
		return keysurname;
	}
	public void setKeysurname(String keysurname) {
		this.keysurname = keysurname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdexpiry() {
		return idexpiry;
	}
	public void setIdexpiry(String idexpiry) {
		this.idexpiry = idexpiry;
	}
	public String getNat_eco() {
		return nat_eco;
	}
	public void setNat_eco(String nat_eco) {
		this.nat_eco = nat_eco;
	}
	public String getCorp_eco() {
		return corp_eco;
	}
	public void setCorp_eco(String corp_eco) {
		this.corp_eco = corp_eco;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getForeignaddr1() {
		return foreignaddr1;
	}
	public void setForeignaddr1(String foreignaddr1) {
		this.foreignaddr1 = foreignaddr1;
	}
	public String getForeignaddr2() {
		return foreignaddr2;
	}
	public void setForeignaddr2(String foreignaddr2) {
		this.foreignaddr2 = foreignaddr2;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getDepstmttype() {
		return depstmttype;
	}
	public void setDepstmttype(String depstmttype) {
		this.depstmttype = depstmttype;
	}
	public String getNewpswdflag() {
		return newpswdflag;
	}
	public void setNewpswdflag(String newpswdflag) {
		this.newpswdflag = newpswdflag;
	}
	public String getRescountrycode() {
		return rescountrycode;
	}
	public void setRescountrycode(String rescountrycode) {
		this.rescountrycode = rescountrycode;
	}
	public String getPhonenores() {
		return phonenores;
	}
	public void setPhonenores(String phonenores) {
		this.phonenores = phonenores;
	}
	public String getFaxno() {
		return faxno;
	}
	public void setFaxno(String faxno) {
		this.faxno = faxno;
	}
	public String getPhonenobus() {
		return phonenobus;
	}
	public void setPhonenobus(String phonenobus) {
		this.phonenobus = phonenobus;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getNatcode() {
		return natcode;
	}
	public void setNatcode(String natcode) {
		this.natcode = natcode;
	}
	public String getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	public String getLangcode() {
		return langcode;
	}
	public void setLangcode(String langcode) {
		this.langcode = langcode;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getIdissue() {
		return idissue;
	}
	public void setIdissue(String idissue) {
		this.idissue = idissue;
	}
	public String getIdplace() {
		return idplace;
	}
	public void setIdplace(String idplace) {
		this.idplace = idplace;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getDomesticrisk() {
		return domesticrisk;
	}
	public void setDomesticrisk(String domesticrisk) {
		this.domesticrisk = domesticrisk;
	}
	public String getCrossborderrisk() {
		return crossborderrisk;
	}
	public void setCrossborderrisk(String crossborderrisk) {
		this.crossborderrisk = crossborderrisk;
	}
	public String getVipcode() {
		return vipcode;
	}
	public void setVipcode(String vipcode) {
		this.vipcode = vipcode;
	}
	public String getRestrictstatus() {
		return restrictstatus;
	}
	public void setRestrictstatus(String restrictstatus) {
		this.restrictstatus = restrictstatus;
	}
	public String getSegmentcode() {
		return segmentcode;
	}
	public void setSegmentcode(String segmentcode) {
		this.segmentcode = segmentcode;
	}
	public String getLockerholder() {
		return lockerholder;
	}
	public void setLockerholder(String lockerholder) {
		this.lockerholder = lockerholder;
	}
	public String getTfnind() {
		return tfnind;
	}
	public void setTfnind(String tfnind) {
		this.tfnind = tfnind;
	}
	public String getHomebranchno() {
		return homebranchno;
	}
	public void setHomebranchno(String homebranchno) {
		this.homebranchno = homebranchno;
	}
	public String getCcustlmtind() {
		return ccustlmtind;
	}
	public void setCcustlmtind(String ccustlmtind) {
		this.ccustlmtind = ccustlmtind;
	}
	public String getCcustpalmtind() {
		return ccustpalmtind;
	}
	public void setCcustpalmtind(String ccustpalmtind) {
		this.ccustpalmtind = ccustpalmtind;
	}
	public String getCindulmtind() {
		return cindulmtind;
	}
	public void setCindulmtind(String cindulmtind) {
		this.cindulmtind = cindulmtind;
	}
	public String getCcntylmtind() {
		return ccntylmtind;
	}
	public void setCcntylmtind(String ccntylmtind) {
		this.ccntylmtind = ccntylmtind;
	}
	public String getCsectorlmtind() {
		return csectorlmtind;
	}
	public void setCsectorlmtind(String csectorlmtind) {
		this.csectorlmtind = csectorlmtind;
	}
	public String getIndustrycode() {
		return industrycode;
	}
	public void setIndustrycode(String industrycode) {
		this.industrycode = industrycode;
	}
	public String getCountryofrisk() {
		return countryofrisk;
	}
	public void setCountryofrisk(String countryofrisk) {
		this.countryofrisk = countryofrisk;
	}
	public String getGroupcode() {
		return groupcode;
	}
	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}
	public String getBussectorcode() {
		return bussectorcode;
	}
	public void setBussectorcode(String bussectorcode) {
		this.bussectorcode = bussectorcode;
	}
	public String getNewbizid() {
		return newbizid;
	}
	public void setNewbizid(String newbizid) {
		this.newbizid = newbizid;
	}
	public String getNewbizidtp() {
		return newbizidtp;
	}
	public void setNewbizidtp(String newbizidtp) {
		this.newbizidtp = newbizidtp;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	public String getAomgr() {
		return aomgr;
	}
	public void setAomgr(String aomgr) {
		this.aomgr = aomgr;
	}
	public String getWtaxtype() {
		return wtaxtype;
	}
	public void setWtaxtype(String wtaxtype) {
		this.wtaxtype = wtaxtype;
	}
	public String getStmtfreq() {
		return stmtfreq;
	}
	public void setStmtfreq(String stmtfreq) {
		this.stmtfreq = stmtfreq;
	}
	public String getStmtcycle() {
		return stmtcycle;
	}
	public void setStmtcycle(String stmtcycle) {
		this.stmtcycle = stmtcycle;
	}
	public String getStmtday() {
		return stmtday;
	}
	public void setStmtday(String stmtday) {
		this.stmtday = stmtday;
	}
	public String getPdslawagree() {
		return pdslawagree;
	}
	public void setPdslawagree(String pdslawagree) {
		this.pdslawagree = pdslawagree;
	}
	public String getAdd3area() {
		return add3area;
	}
	public void setAdd3area(String add3area) {
		this.add3area = add3area;
	}
	public String getAdd3filler() {
		return add3filler;
	}
	public void setAdd3filler(String add3filler) {
		this.add3filler = add3filler;
	}
	public String getFxsptype() {
		return fxsptype;
	}
	public void setFxsptype(String fxsptype) {
		this.fxsptype = fxsptype;
	}
	public String getAdd4() {
		return add4;
	}
	public void setAdd4(String add4) {
		this.add4 = add4;
	}
	public String getForeignaddr3() {
		return foreignaddr3;
	}
	public void setForeignaddr3(String foreignaddr3) {
		this.foreignaddr3 = foreignaddr3;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNonfinainst() {
		return nonfinainst;
	}
	public void setNonfinainst(String nonfinainst) {
		this.nonfinainst = nonfinainst;
	}
	public String getOccupationcode2() {
		return occupationcode2;
	}
	public void setOccupationcode2(String occupationcode2) {
		this.occupationcode2 = occupationcode2;
	}
	public String getCrstype() {
		return crstype;
	}
	public void setCrstype(String crstype) {
		this.crstype = crstype;
	}
	public String getCrssubtype() {
		return crssubtype;
	}
	public void setCrssubtype(String crssubtype) {
		this.crssubtype = crssubtype;
	}
	public String getCrsstat() {
		return crsstat;
	}
	public void setCrsstat(String crsstat) {
		this.crsstat = crsstat;
	}
	public String getLstmdt() {
		return lstmdt;
	}
	public void setLstmdt(String lstmdt) {
		this.lstmdt = lstmdt;
	}
	public String getLstmbr() {
		return lstmbr;
	}
	public void setLstmbr(String lstmbr) {
		this.lstmbr = lstmbr;
	}
	public String getLstmtelr() {
		return lstmtelr;
	}
	public void setLstmtelr(String lstmtelr) {
		this.lstmtelr = lstmtelr;
	}
	public String getStatus2() {
		return status2;
	}
	public void setStatus2(String status2) {
		this.status2 = status2;
	}
	public String getStatus3() {
		return status3;
	}
	public void setStatus3(String status3) {
		this.status3 = status3;
	}
	public String getAssetsize() {
		return assetsize;
	}
	public void setAssetsize(String assetsize) {
		this.assetsize = assetsize;
	}
	public String getAnnualaudit() {
		return annualaudit;
	}
	public void setAnnualaudit(String annualaudit) {
		this.annualaudit = annualaudit;
	}
	public String getCorpcat() {
		return corpcat;
	}
	public void setCorpcat(String corpcat) {
		this.corpcat = corpcat;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public String getIdchgreqby() {
		return idchgreqby;
	}
	public void setIdchgreqby(String idchgreqby) {
		this.idchgreqby = idchgreqby;
	}
	public String getFororigid() {
		return fororigid;
	}
	public void setFororigid(String fororigid) {
		this.fororigid = fororigid;
	}
	public String getMajmrkt() {
		return majmrkt;
	}
	public void setMajmrkt(String majmrkt) {
		this.majmrkt = majmrkt;
	}
	public String getFxind() {
		return fxind;
	}
	public void setFxind(String fxind) {
		this.fxind = fxind;
	}
	public String getMfind() {
		return mfind;
	}
	public void setMfind(String mfind) {
		this.mfind = mfind;
	}
	public String getFactoring() {
		return factoring;
	}
	public void setFactoring(String factoring) {
		this.factoring = factoring;
	}
	public String getCbcode() {
		return cbcode;
	}
	public void setCbcode(String cbcode) {
		this.cbcode = cbcode;
	}
	public String getTelnotcor() {
		return telnotcor;
	}
	public void setTelnotcor(String telnotcor) {
		this.telnotcor = telnotcor;
	}
	public String getIntrodept() {
		return introdept;
	}
	public void setIntrodept(String introdept) {
		this.introdept = introdept;
	}
	public String getIdchanbr() {
		return idchanbr;
	}
	public void setIdchanbr(String idchanbr) {
		this.idchanbr = idchanbr;
	}
	public String getContcustphone() {
		return contcustphone;
	}
	public void setContcustphone(String contcustphone) {
		this.contcustphone = contcustphone;
	}
	public BeaiCHeaderRequestBean getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(BeaiCHeaderRequestBean requestHeader) {
		this.requestHeader = requestHeader;
	}
	public int[] getMsgLen() {
		return msgLen;
	}
	public void setMsgLen(int[] msgLen) {
		this.msgLen = msgLen;
	}
	public String[] getMsgType() {
		return msgType;
	}
	public void setMsgType(String[] msgType) {
		this.msgType = msgType;
	}
    
    
}