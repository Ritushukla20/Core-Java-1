package com.itrainu.Basic;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate empBirth = LocalDate.of(1999, 8, 20);
		
		Period p = Period.between(empBirth, today);
		
		System.out.println("emplyee age ;" +p.getYears());
		
				
}
}