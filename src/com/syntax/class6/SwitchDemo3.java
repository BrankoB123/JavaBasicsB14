package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		
		
		Scanner in=new Scanner(System.in);
		
       System.out.println("Please tell me whera are you from");
       String country=in.nextLine();
       String favouriteFood;
       
       
       switch (country) {
       case "Usa":
    	   favouriteFood="burgers and fries";
    	   break;
       case "Khazakhstan":
    	   favouriteFood="beshpamrmak";
    	   break;
       case "Turkey":
    	   favouriteFood="adana kebab";
    	   break;  
       case "Venezuela":
    	   favouriteFood="Arepa";
    	   break;
    	   
       case "India":
    	   favouriteFood="Chicken curry";
    	   break;
       case "Yemen":
    	   favouriteFood="Mandi";
    	   break;
       case "Afganistan":
    	   favouriteFood="Qaboli Palow";
    	   break;
    	   
    	 default:
    		 favouriteFood="Unknown";
    	  break; 
       }System.out.println("You are from "+ country+" and your favourite foor is "+favouriteFood);
       

	}

}
