package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it.
		 *  Using 2 different loops print all values from the array.
		 */

		String[] cars= {"Audi","BMW","Ford","Toyota","Honda","Lincoln"};
		for(int i=0;i<cars.length;i++) {
		
		
		System.out.println(cars[i] +" ");
		}
		for (String make:cars) {
			System.out.print(make +" ");
		}

			
		}
	

}

