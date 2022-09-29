package com.syntax.class10;

public class HW3 {

	public static void main(String[] args) {
	/*
	 * 	Create an array on integers and calculate 
	 * the sum of all elements in an array
	 */

		
		//Regular loop version
		int[]  numbers= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		System.out.println("Sym of all numbers in array is:    ");
		for (int i=0; i<numbers.length;i++) {
			sum+=numbers[i];
		}System.out.println(sum);
		System.out.println("-----------------");
		
		//enhanced loop version
		sum=0; // Reassigning sum because it would print 55 from previous code
		
		for(int number:numbers) {
			sum+=number;
			
			
		}System.out.println(sum);
		
	}

}
