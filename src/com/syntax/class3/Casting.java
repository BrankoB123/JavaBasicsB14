package com.syntax.class3;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * type casting=>data type casting=converting
		 * converting one data type to another
		 * 
		 */
		byte box1=127;//smallest box
		short box2=3333; //slightly large box
		int  box3=43778;//large box most commonly used
		long box4=3335699;//slightly large box
		float box5= 4225262;//larger box
		double box6=530036036;//largest
				
		
		int number=(int)15.2;//we cant store the decimal number in a box of type double
		System.out.println(number);
		
		
		long  smallBox=(long)box2;
		System.out.println(smallBox);
		
		
		short biggerBox=box1;
		long box7=box1;//we can do this because box7 is larger than box1
		
		//float box8=box6;  => as box6 is larger than box8 it is double we need type casting 
		
		char a=(char)67;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		
	}
}
