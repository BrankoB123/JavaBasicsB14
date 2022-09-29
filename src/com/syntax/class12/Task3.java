package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
          Boy or Girl? girl
         Suggested baby name: MAIEL
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is mom's first name");
		String nameMom=scanner.nextLine();
		
		System.out.println("What is dad's first name");
		String nameDad=scanner.nextLine();
		System.out.println("Are you expecting boy or a girl");
		String baby=scanner.nextLine();
		
		if (baby.equals("boy")) {
			System.out.println(nameDad.substring(0,nameDad.length()/2)+(nameMom.substring(nameMom.length()/2)));
		}else if(baby.equals("girl")){
			System.out.println(nameMom.substring(0,nameMom.length()/2)+(nameDad.substring(nameDad.length()/2)));
			
		}
		
		
		
		
	}

}
