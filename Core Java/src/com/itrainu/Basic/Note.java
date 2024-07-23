package com.itrainu.Basic;

public class Note {
	public static void main(String[] args) {
		int number = 2720;
		int count = 0;
		int notes []= {200,500,200,100,50,20,10,5,2,1};
		for (int i = 0; i < notes.length; i++) {
			count =number/notes[i];
			number=number%notes[i];
			System.out.println(notes[i]+"="+count);
			
		}
		
	}

}
