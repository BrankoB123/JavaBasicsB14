package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		String day="monday";
		
		if(day.equals("saturday")|| day.equals("sunday")) {
			
			System.out.println("I have Java class at Syntax");
			}
		System.out.println("------");
		if(day.equals("saturday")&& day.equals("sunday")) {
			System.out.println("I have Java class at Syntax-using logical ");
		}
      double money=120000;
      
      String title="Automation Tester";
      
      if(title.equals("Automation Tester")|| money==120000) {
    	  System.out.println("Happy");
      }
	}

}
