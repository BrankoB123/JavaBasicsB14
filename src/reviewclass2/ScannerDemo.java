package reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

		
		public static void main(String[] args) {
	        // TODO Auto-generated method stub

/*
 * nextLine is the special method that can capture spaces and enters as well
 * when we use any method like nexInt() or nextBoolean()... and when we use 
 * nextLine() we need to discard that enter by using extra nextLine() call
 */
	         Scanner scanner = new Scanner(System.in);

	        System.out.println("Pelease Enter your age");
	        int age=scanner.nextInt();

	        System.out.println("Pelease Enter your name");
	        scanner.nextLine();
	        String name=scanner.nextLine();


	        System.out.println(name+" is "+age+" years old");


	    }
		
		
		
		
		
		
	}

