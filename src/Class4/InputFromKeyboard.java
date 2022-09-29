package Class4;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * scanner is a class that helps us take the input from keyboard 
		 * it contains many different smaller modules called methods that can help
		 * us take String booleans all types of data from keyboard
		 */
		Scanner input=new Scanner(System.in);
		//a message will be displayed to the user on the console to enter his/her name
         System.out.println("Please enter your name ");
         //activates the java program to take the input from the keyboard and store 
         //it inside the name variable
         
		String name= input.next();
         //prints whatever name user enters on the keyboard on the console
		System.out.println("hello "+name+" dont be cofused");
		
		
		
	}

}
