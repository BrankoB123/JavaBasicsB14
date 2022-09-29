package Class4;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not.
		 *  If you user does not have a credit card then offer them
		 *  If they do have one ask what is balance on the card? If balance of 
		 *  the card is larger than 1000, tell them to pay off immediately, otherwise 
		 *  you can tell them that they can spend more.
		 */

		Scanner a=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		boolean cCard=a.nextBoolean();
		
		if(cCard) {
			System.out.println("What is the card balance?");
			int balance=a.nextInt();	
			
		if(balance>1000) {
				System.out.println("Pay it off immidiately");
			}else {
				System.out.println("You can spend more money");			
			}
		}else {
			System.out.println("Would you like to apply for a credit card?");
		}
		
	}

}
