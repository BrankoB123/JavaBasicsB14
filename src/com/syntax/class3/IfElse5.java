package com.syntax.class3;

public class IfElse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=19;//when we target exact value
		if(number!=18) {
			System.out.println("This number is not 18");
		}
		
		//for multiple conditions  else if
		int day=8;
		if (day==1){
			System.out.println("Monday");
			
		}else if(day==2) {
			System.out.println("Tuseday");
			}
		else if(day==3){
			System.out.println("Wednesday");
		}else if(day==4){
			System.out.println("Thursday");
			
		}else if(day==5){
			System.out.println("Friday");
		}else if(day==6){
			System.out.println("Saturday");
		}else if(day==7){
			System.out.println("Sunday");
		} else { System.out.println("Please enter a valid number (1-7)");
		
		}
		
	}

}
