package com.itrainu.Basic;

public class Prime {
	public static void main(String[] args) {
		
		int num=8;
		int count =0;
		
		for (int i = 2; i < num; i++) {
			
			if(num% i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime");
		}
		
		else{
			System.out.println("not Prime");
		}
		
	}
}



