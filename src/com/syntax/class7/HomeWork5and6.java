package com.syntax.class7;

import java.util.Scanner;

public class HomeWork5and6 {

	public static void main(String[] args) {
		
	// HW5 Prompt the user to ask the name 3 times and print "Good afternoon +name...
		
		Scanner input=new Scanner(System.in);
			
			  for(int i=1; i<=3; i++) {
		            System.out.println("Please write a name");
		            String name=input.nextLine();
		            System.out.println("Good afternoon "+name);
		            System.out.println("---------------------------------");
		        }
			
			 //HW6 
			  
			  /*Declare a variable to store a price for a coffee.
		         * Ask the user to pay for a coffee.
		         * Keep asking to pay for coffee until the user enters the EXACT amount .
		         * If the user gives more than coffee price --> ask them to give less.
		         * If the user gives less money then ask to give more.
		         * Once user give EXACT amount print “Please enjoy your coffee"
		         */
			
			  double price = 2.85;
		        double user;
		        Scanner in= new Scanner(System.in);

		        
		        do {

		            System.out.println("Please pay for the cofee");
		            user= in.nextDouble();
		            
		            if(user>price) {
		            System.out.println("Please give lesser price");
		          
		            }else if(user<price){
		                System.out.println("Please give more price");
		              
		            }
		            
		        }while(user!=price);

		        System.out.println("Please enjoy your coffee");
			  
			  
		}

	}


