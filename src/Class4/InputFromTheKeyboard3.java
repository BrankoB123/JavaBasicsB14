package Class4;

import java.util.Scanner;

public class InputFromTheKeyboard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new  Scanner(System.in);
		int age=scanner.nextInt();
		// we use nextInt() if we want int type data from keyboard
		
		if (age<18) {
			System.out.println("You should study");
			
		}else {
			System.out.println("You should start working");
		}
		
		
	}

}
