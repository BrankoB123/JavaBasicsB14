package com.syntax.class10;

import java.util.Scanner;

public class GroupProjectTask8 {
	

	
		
		public static void main(String[] args) {

	        // Write a Java Program to print the first 10 numbers of Fibonacci series
	        // 0 1 1 2 3 5 8 13 21
	        int previous=0;
	        int currentNumber=1;
	        int nextNum=0;
	        System.out.println(previous);
	        System.out.println(currentNumber);
	        for(int i=0; i<8;i++) {
	            nextNum=previous+currentNumber;
	            System.out.println(nextNum);
	            previous=currentNumber;
	            currentNumber=nextNum;

	        }

	    }
		//task 4
		/*
		 * Create a 2D array or integer type where you will store
		 * odd and even numbers. Develop a program which will
		 * identify/print the even numbers only.
		 */
		
		 int[][] numbers = { 
	                { 10, 11, 12, 13, 71, 73 }, 
	                { 32, 78, 21, 13, 13, 17 }, 
	                { 10, 44, 19, 89, 51, 93 },
	                { 56, 45, 96, 76, 28, 62 }, 
	                };

	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = 0; j < numbers[i].length; j++) {
	                if (numbers[i][j] % 2 == 0) {
	                    System.out.println(numbers[i][j]);
	                }
	            }
	        }
	       
	            // Write a program to print out duplicate elements from an Array of Strings?

	             String[] str= {"AB","AC","AF","AC","AM","AF"};

	             for(int a=0;a<str.length-1;a++) 
	             {
	                 for(int b=a+1;b<str.length;b++)
	                 {
	                  if((str[a].equals(str[b])) && (a!=b))
	                  {
	                      System.out.println("Duplicate elements "+str[b]);
	                  }
	                  }
	                  }
	                  
	                 
	    }
	}

		