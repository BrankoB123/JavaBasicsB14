package Class4;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 *  First, program should check if rate is higher than 4.5 user will not buy a house,
		 *   otherwise user will consider buying.
		 *   Once user decides to buy a house, if price of the house is larger than 200000
		 *   than user will take a loan, otherwise user will pay cash.
		 */
		
		Scanner s = new Scanner(System.in);{
		
				System.out.println("Enter your mortgage rate? ");
				double mortgageRate=s.nextDouble();
					
		if (mortgageRate>4.5) {
		System.out.println("It is not the right time to buy a house");
		
		}else if (mortgageRate<4.5){
				System.out.println("You should consider buying");
				System.out.println("Please enter the house price");
				int mortgagePrice=s.nextInt();
		
		if(mortgagePrice>200000){
				System.out.println("Consider buying on loan");
		}else {
		System.out.println("Pay with cash");
		  }
	   }
     }
   }
 }

		
		

	

