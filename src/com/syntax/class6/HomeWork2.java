package com.syntax.class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 *and determine the grade based on the following rules: if the average score >=90 → grade=A
		 *if the average score >= 70 and <90 → grade=B
		 *if the average score>=50 and <70 → grade=C
		 *if the average score<50 → grade=F
          */
		
		Scanner inp=new Scanner(System.in);
		
	   System.out.println("Enter your quiz score");
	   int quizScore=inp.nextInt();
	   System.out.println("Enter your mid term score");
	   int midTermScore=inp.nextInt();
	   System.out.println("Enter your final score");
	   int finalScore=inp.nextInt();
	   
	   char grade = 0;
	   
	   int average=(quizScore+midTermScore+finalScore)/3;
	   
	   if( average>= 70 && average<90) {
		   grade='B';
	   }else if( average>=90) {
		   grade='A';
	   }else if( average>=50 && average<70) {
		   grade='C';
	   }else if( average<50) {
		   grade='F';
	   }
	   System.out.println("Your average grade is "+grade);
	}

}
