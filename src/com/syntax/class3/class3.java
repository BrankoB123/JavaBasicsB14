package com.syntax.class3;

public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String firstName="Mina";
		String  lastName="Henen";
		String fullName=firstName+ ""+lastName;
		System.out.println(fullName);
		
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="NewYork";
		String country="USA";
		String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String incompleteAddress= houseNo+city;
		String step1="if we substract 10 from 5 we get="+10;//
		System.out.println(step1);
		//String step2=step1-5;
		System.out.println("if we substract 10 from 5 we get="+(10-5));

	}

}
