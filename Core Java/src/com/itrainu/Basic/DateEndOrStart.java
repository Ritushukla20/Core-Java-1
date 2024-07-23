package com.itrainu.Basic;

import java.time.LocalDate;


public class DateEndOrStart {
	public static void main(String[] args) {
		LocalDate endDate= LocalDate.of(2024,07,06);
		LocalDate startDate = LocalDate.now();
		if (endDate.isAfter(startDate))
		{
			System.out.println("Success Message");
			
		}
		else {
			System.out.println("error Message");
		}
}
}