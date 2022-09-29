package Class4;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan  needed
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would 
		 * reject the client.
		 */

		Scanner amount=new Scanner(System.in);
		
		System.out.println("What is the amount of loan needed");
		int loan=amount.nextInt();
		 
		if(loan<=200000) {
			System.out.println("We can do business");
			
		}else {
				System.out.println("Sorry we have to reject your inquiry  ");
			}
			

		}
		
		
		
	}

