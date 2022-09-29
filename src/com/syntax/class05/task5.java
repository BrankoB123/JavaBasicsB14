package com.syntax.class05;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month.
		 *  Based on the month define the season.
		 *  Example: if user is born in March, April, May → season =”Spring” 
		 *  if user is born in June, July, August → 
		 *  season =”Summer”  etc …
		 */
		        Scanner input = new Scanner(System.in);
		        System.out.println("What is your Birth Month?  ");
		        String month = input.nextLine();
		        if((month.equalsIgnoreCase("December")) || (month.equalsIgnoreCase("January")) || (month.equalsIgnoreCase("Febrauary"))) {
		            System.out.println("Winter");
		        }else if ((month.equalsIgnoreCase("March")) || (month.equalsIgnoreCase("April"))  ||(month.equalsIgnoreCase("May"))) {
		            System.out.println("Spring");
		        }else if ((month.equalsIgnoreCase("June"))||  (month.equalsIgnoreCase("July")) || (month.equalsIgnoreCase("August"))) {
		            System.out.println("Summer");
		        }else if((month.equalsIgnoreCase("September")) || (month.equalsIgnoreCase("October"))  ||(month.equalsIgnoreCase("November"))) {
		            System.out.println("Autumn");
		        }else {
		            System.out.println("There is no such Month!");
		        }

		    }

		}
