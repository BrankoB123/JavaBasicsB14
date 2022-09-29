package Class4;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		/*
		 *Create a Java program that will ask user to input city and temperature
		 *Your program should convert Fahrenheit into celsius and print 
		 *“The temperature in the city  is ”
		 */
		
		
		 Scanner s= new Scanner(System.in);
		
		
		 System.out.println(" Which city do you live in");
		 String city=s.nextLine();
		 
		 System.out.println("What is the current Farenheit temperature in"+ city);
		
		 double tempF=s.nextDouble();
		 
		 double tempC=(tempF-32)/1.8;
		 
		 System.out.println(" The current temperature in "+ city+ " is "+ tempC+" C");
		
		
		
	}

}
