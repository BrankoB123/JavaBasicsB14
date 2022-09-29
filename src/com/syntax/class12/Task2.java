package com.syntax.class12;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not 
		 * empty perform the following: if the String has 
		 * an odd number of characters and has 3 or more characters,
		 *  print the character in the middle of the String.
		 */

		String str="Data$Base";
		if(!str.isEmpty()) {
			if( str.length()>=3 &&str.length()%2!=0) {
				System.out.println(str.charAt(str.length()/2));
			}
		} 
		/*
		 * Create a String and print it 
		 * in reverse order (Sunday → yadnuS).
     	 */
		
		//1st way
		 for(int i=str.length()-1;i>=0;i--) {
	           
	                System.out.print(str.charAt(i));
	            }
		 System.out.println("--------------------------------------------------");
    // 2nd way
         char [] charArr=str.toCharArray();
         for(int i=charArr.length-1; i>=0; i--) {
             System.out.print(charArr[i]);
         }


		
	}

}
