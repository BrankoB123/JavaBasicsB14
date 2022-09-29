package com.syntax.class05;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/*
		 *  Write a program that will print whether it is a weekend or weekday. 
		 *  If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → 
		 *  output “It is a weekend”, any other day → output “Invalid day”
		 */
		
	    
	    int day=9;
	    System.out.println("what number of a day in a week");
	    
		if(day>=1&& day<=5) {
		System.out.println("weekday");
		}else if (day==6&&day==7) {
			System.out.println("weekend");
		}else {
			System.out.println("Invalid day");
		}
		
	}

}
