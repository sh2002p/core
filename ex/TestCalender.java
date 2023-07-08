package com.rays.ex;

import java.util.Calendar;
import java.util.Date;

public class TestCalender {
	public static void main(String[] args) {
		Date Today= new Date();
		Calendar cal = Calendar.getInstance(); 
		cal.setTime (Today);
		cal.add(Calendar.DATE,+30);
		System.out.println(cal.getTime());
		
	}

}
