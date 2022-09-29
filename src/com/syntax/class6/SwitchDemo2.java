package com.syntax.class6;

public class SwitchDemo2 {

	public static void main(String[] args) {
		//matching cases must be of same data type as a variable
		
		char choice='Y';
		String answer;
			
		switch(choice) {
		case 'Y':
			answer="Yes";
			break;
			
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
			
			default:
				answer="Unknown";
				break;
					
		} 
		System.out.println(answer);
		/*
	     * Limitation of Switch Case:
	     * switch case cannot use logical operators
	     * switch case can not use relational operators 
	     /

	    /
	     * CANNOT work with boolean values
	     boolean boo=true;

	     switch (boo) {

	     *CANNOT work with float/double and long
	     */
		
		
	}

}
