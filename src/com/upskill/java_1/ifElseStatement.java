package com.upskill.java_1;

public class ifElseStatement {
 
	public static void main(String[] args) {
		
		int age = 100;
		
		if (age <= 13){
			System.out.println("you are children");
		} else if(age >13 & age <18){
			System.out.println("you are Teenager");
		} else if (age >=60){
			if (age<100){
				System.out.println("you are senior");
			}else
			System.out.println("you are champion'");
		} else {
			System.out.println("you are adult");
		}
		
	}
	
}