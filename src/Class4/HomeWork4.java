package Class4;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them,
		 *  otherwise you will offer them to get a learners permit.
		 * 
		 */

		Scanner s=new Scanner(System.in);
		
		System.out.println("How old are you");
		int age=s.nextInt();
		
		if (age>18) {
			System.out.println("We can issue a drivers license");
			
		}else {
			System.out.println("You need to get a learners permit first");
			
		}
		
		
		
	}

}
