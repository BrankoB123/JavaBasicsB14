package com.syntax.class6;


import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
		 * *Example: if user is born in March, April, May → season =”Spring” 
		 * if user is born in June, July, August → season =”Summer”  etc …
		 *At the end of the program we should see 1 output as “You were born is season __”.
		 */

		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month=inp.nextLine();
		String season;
		
		if(month.equals("December") ||month.equals ("January")||month.equals ("February") ) {
		season="Winter";
		}else if (month.equals("March") ||month.equals ("April")||month.equals ("May")) {
		season="Spring";
		}else if (month.equals("June") ||month.equals ("July")||month.equals ("August")) {
	    season="Summer";
	   }else if (month.equals("September") ||month.equals ("October")||month.equals ("November")) {
		season="Fall";
	   }else {
		   System.out.println("Wrong input");
		   season="Invalid";
	   } System.out.println(" You were born in season "+ season);
	}
}