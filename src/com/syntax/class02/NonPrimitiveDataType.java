package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is just 1 example of non primitive data type
		
		String name="Asma";
		//String adress="123 adress street";
		//String phone="12 345 967";
		String  age ="17";//anything you put inside "" becomes a String
		//String  character="A";
		
		
		//ctrl+space auto completes the statement
		//syso +ctrl+space+enter
		System.out.println();
		
		System.out.println(name);
		//"My name is" + Asma
		System.out.println("My name is "+name );
		
		//Asma is 17
		
		System.out.println( name +" is "+age);
		
		String fruit="apple";
		double price=1.99;
		fruit="mango";
		price=5.99;
		

		//the price of the apple is 1.99
		System.out.println("the price of the "+ fruit+ " is "+ price);
		/* to attach any value(int,double,boolean,char,String)
		 * to a String we use +
		 * + next to the String acts as Concatenation
		 * 
		 */
		
		
	}

	
}
