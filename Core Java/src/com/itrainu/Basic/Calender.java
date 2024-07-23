package com.itrainu.Basic;

import java.util.Calendar;
import java.util.Date;

public class Calender {
	public static void main(String[] args) {
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, 2);
		System.out.println(cal.getTime());
	}

}

