package com.syntax.class10;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it.
		 *  Using 2 different loops print all elements from the array.
		 *  
		 */
		
		String[] animals= {"Elephant","Lion","Dog","Cow","Horse",};
		for(int i=0;i<animals.length;i++) {
		
		
		System.out.println(animals[i] +" ");
		}
		for (String i:animals) {
			System.out.print(i +" ");
		}
		
		
	}

}
