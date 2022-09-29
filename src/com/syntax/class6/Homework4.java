package com.syntax.class6;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...)
		 *  and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
		 *  any other grade --> Not Acceptable. At the end your program should print 
		 *  which grade was entered by a user with explanation.
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter your Quiz Score?");
        String grade = input.nextLine();
        
        
        String explanation;
 
        if(grade.equals("A")) {
            explanation= "A-Excellent";
        }else if(grade.equals("B")) {
        	explanation = "B-Good";
        }else if(grade.equals("C")) {
        	explanation = "C-Average";
        }else if(grade.equals("D")) {
        	explanation = "D-Bad";
        }else {
            System.out.println("Not Acceptable");
            explanation ="Invalid";
        
        }
        System.out.println("You got: "+explanation);
		
	}

}
