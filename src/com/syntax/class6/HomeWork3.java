package com.syntax.class6;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print 
		 * which language user speaks.
		 */

		Scanner in=new Scanner(System.in);
		
	       System.out.println("Please tell me where are you from");
	       String country=in.nextLine();
	       String language;
	       
	       
	       switch (country) {
	       case "Usa":
	    	   language="English";
	    	   break;
	       case "Khazakhstan":
	    	   language="Russian";
	    	   break;
	       case "Turkey":
	    	   language="Turkish";
	    	   break;  
	       case "Venezuela":
	    	   language="Spanish";
	    	   break;
	    	   
	   
	    	   
	    	 default:
	    		 language="Unknown";
	    	  break; 
	       }System.out.println("You are from "+ country+" and your favourite foor is "+language);
	       
		
	}

}
