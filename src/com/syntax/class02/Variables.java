package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Branko";
		String last="Bajagic";
		String grade="A";
		String city="GR";
		String state="MI";
		String phone="333 444 555";
		
		System.out.println("My name is "+name+" and my last name is "+ last );
		System.out.println("I am "+ grade+ " student");
		System.out.println("I live in a city "+city+ " and state "+ state);
		System.out.println("And my phone number is "+phone);
		
		city="Miami";
		state="FL";
		phone="999 876 543 ";
		
		System.out.println("My name is "+name+" and I moved to new city  "+city+" and new state "+ state);
		System.out.println("My new phone number is "+phone);
		//Rules for Identifiers= names(variables,methods,variables are identifiers
		//1/cannot use keywords as identifiers
		//string new="Hello";-- error
		//2.cannot have spaces in identifiers
		//  String last name="Smith";
		//3.identifiers cannot start with numbers
		// int 1number=123;
	    int number1=123; //number can be anywhere after 1st character
	    
	    /* boolean hello!=true;4.identifiers cannot contain any special characters
	     * boolean hello!=true;
	     * except $ or _
	     * 
	     */
	    
		double $price=9.99F;
		float _price1_=1.99F;
		
		/*
		 * Naming Conventions
		 * 
		 * Class should start with Uppercase and follow camelcasing
		 * variables should start with lowercases and follow 
		 */
		
		
				
		
		
		System.out.println();

	}

}
