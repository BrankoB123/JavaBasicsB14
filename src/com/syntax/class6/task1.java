package com.syntax.class6;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month.
		 *  Based on the month define the season.
		 *  Example: if user is born in March, April, May → season =”Spring” 
		 *  if user is born in June, July, August → 
		 *  season =”Summer”  etc …
		 */
		 Scanner input = new Scanner(System.in);
	        System.out.println("Please Enter your Quiz Score?");
	        double quiz = input.nextDouble();
	        System.out.println("Please Enter your mid term Score?");
	        double midterm = input.nextDouble();
	        System.out.println("Please Enter your Final Score?");
	        double Final = input.nextDouble();
	        
	        double average;
	        
	        String grade = null;

	        average = (quiz+midterm+Final)/3;
	        

	        if(average>=90 && average<=100) {
	            grade = "A";
	        }else if(average>=70 && average<90) {
	            grade = "B";
	        }else if(average>=50 && average<70) {
	            grade = "C";
	        }else if(average<50&& average>0) {
	            grade = "F";
	        }else {
	            System.out.println("Please enter valid score!");
	            grade ="None";
	        }
	        System.out.println("Grade: "+grade);





	    }

	}