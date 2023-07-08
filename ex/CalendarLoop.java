package com.rays.ex;

import java.util.Calendar;
import java.util.Date;

public class CalendarLoop {
	public static void main(String[] args) {
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		for(int i = 1; i<=12; i++) {
			cal.add(Calendar.DATE,10);
			System.out.println(cal.getTime());
			
		}
		
	
	}

}
