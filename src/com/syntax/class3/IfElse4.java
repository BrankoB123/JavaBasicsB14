package com.syntax.class3;

public class IfElse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money=66000;//change to 65k still the same/if
		// 64999 its not equal or greater so/ else
		if(money>=65000) {
			System.out.println("I can buy a tesla");
			
		}else {
			System.out.println("I need to save more");
		}
		
		if(money==65000) { // needs to be equal to exactly the same value as 65000 or triggers else
			System.out.println("I can buy a tesla");
			
		}else {
			System.out.println("I need to save more");
		}
		

	}

}
