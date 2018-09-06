package com.ots.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;



public class AgeIdNoUtil {
	
	//签证日
	public static  String periodValidity(String idno,String IdEndDate) {
		if("2099-12-30".equals(IdEndDate)){
			return"00000000";}
		String Birthday=idno.substring(6, 10);
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(currentTime).substring(0, 4);
		//算出年龄
		Integer nn= Integer.parseInt(Birthday);
		
		Integer Kn= Integer.parseInt(dateString);
		Integer nianling=Kn-nn;
		System.out.println("年龄"+nianling);
		 if(StringUtils.isNotBlank(IdEndDate) ){
			//到期年
			String replace = IdEndDate.replace("-", "");
			Integer daoqi=Integer.parseInt(replace.substring(0,4));
			//到期月日
			String daoqi2=replace.substring(4,8); 
			if(nianling>=16&&nianling<=25){
				Integer	EndDate=daoqi-10;
				String  EndDate2=EndDate.toString()+daoqi2.toString();
				System.out.println("16-25=="+EndDate2);
				if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
					return"20040101";	
				}
				return EndDate2;
			}else if(nianling>=26&&nianling<=45){
				Integer	EndDate=daoqi-20;
				String  EndDate2=EndDate.toString()+daoqi2.toString();
				System.out.println("26-45=="+EndDate2);
				if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
					return"20040101";	
				}
				return EndDate2;
				}else if(nianling>=46){
					Integer	EndDate=daoqi-20;
					String  EndDate2=EndDate.toString()+daoqi2.toString();
					System.out.println("46以上=="+EndDate2);
					if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
						return"20040101";	
					}
					return EndDate2;
					}
		}else{
			Integer Birthday1=Integer.parseInt(idno.substring(6, 10));
			String daoqi2=idno.substring(10, 14);
			if(nianling>=16&&nianling<=25){
				Integer	EndDate=Birthday1+16;
				String  EndDate2=EndDate.toString()+daoqi2;
				System.out.println("为空签证16-25=="+EndDate2);
				if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
					return"20040101";	
				}
				return EndDate2;
			}else if(nianling>=26&&nianling<=45){
				Integer	EndDate=Birthday1+26;
				String  EndDate2=EndDate.toString()+daoqi2;
				
				if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
					return"20040101";	
				}
				return EndDate2;
				
			}else if(nianling>=46){
				Integer	EndDate=Birthday1+46;
				String  EndDate2=EndDate.toString()+daoqi2;
				
				if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
					return"20040101";	
				}
				return EndDate2;	
			}	
			}
		
		return "00000000";
	}
	
	//签证日2
	public static  String periodValiditys(String idno,String  replace) {
		//450521198602063311      2035-12-30
		String Birthday=idno.substring(6, 10);
		String daoqi2=idno.substring(10, 14);
		String  EndDate2 =null;
		Date currentTime = new Date();
		//到期年
		String IdEndDate = replace.replace("-", "");
		System.out.println("^^^^^^^^^^"+IdEndDate);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(currentTime).substring(0, 4);
		//算出年龄
     	Integer nn= Integer.parseInt(Birthday);
		
		Integer Kn= Integer.parseInt(dateString);
		Integer nianling=Kn-nn;
		Integer dqr=Integer.parseInt(IdEndDate.substring(0,4));
		System.out.println("**********"+dqr);
		if("2099-12-30".equals(IdEndDate)){
			if(nianling>=46){
				Integer	EndDate=nn+46;
				String  EndDate3=EndDate.toString()+daoqi2;
				
				if(Integer.parseInt(EndDate3)<Integer.parseInt("20040101")){
					return"20040101";	
				}
				System.out.println("$$$$$$$$$$"+EndDate2);
				return EndDate2;	
			}
			}
		if((dqr-10-nn)>=16&&(dqr-10-nn)<=25){
			Integer EndDate=dqr-10;
			 EndDate2=EndDate.toString()+daoqi2;
			// System.out.println("%%%%%%%%%%"+EndDate2);
		}
		
		if((dqr-20-nn)>=26&&(dqr-20-nn)<=45){
			Integer EndDate=dqr-20;
			 EndDate2=EndDate.toString()+daoqi2;
			 System.out.println("@@@@@@@"+EndDate2);
		}
		
		
		System.out.println("&&&&&&"+EndDate2);
		return EndDate2;
		
	}
	//到期日
	public static  String duedateValidity(String idno){
		String Birthday=idno.substring(6, 10);
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(currentTime).substring(0, 4);
		//算出年龄
		Integer nn= Integer.parseInt(Birthday);
		Integer Kn= Integer.parseInt(dateString);
		Integer nianling=Kn-nn;
		Integer Birthday1=Integer.parseInt(idno.substring(6, 10));
		String daoqi2=idno.substring(10, 14);
		if(nianling>=16&&nianling<=25){
			Integer	EndDate=Birthday1+16+10;
			String  EndDate2=EndDate.toString()+daoqi2;
			if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
				return"20040101";	
			}
			return EndDate2;
		}else if(nianling>=26&&nianling<=45){
			Integer	EndDate=Birthday1+16+30;
			String  EndDate2=EndDate.toString()+daoqi2;
			
			if(Integer.parseInt(EndDate2)<Integer.parseInt("20040101")){
				return"20040101";	
			}
			return EndDate2;
			
		}else if(nianling>=46){
			
			return "00000000";	
		}
		
		
		return "9999999";
	}
}
