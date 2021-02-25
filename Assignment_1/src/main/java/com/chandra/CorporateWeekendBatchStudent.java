package com.chandra;

public class CorporateWeekendBatchStudent extends Student {
	public double calculateFee(String course) {
		double fee = 0;
		double corporateWeekEndFee = 22000;
		if(course.equals("java")) {
			fee = 18000;
		}else if(course.equals("frameworks")) {
			fee = 12000;
		}else if(course.equals("tools")) {
			fee = 6000;
		}
		return fee+corporateWeekEndFee;
	}
}
