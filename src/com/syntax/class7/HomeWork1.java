package com.syntax.class7;

public class HomeWork1 {

	public static void main(String[] args) {
		//Print numbers from 1 to 100 in 1 line with space

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			}
		System.out.println( " --------------");
		
		// Print numbers from 100 to 1
		
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
			}
		System.out.println( " --------------");
		
		//Print even numbers from 20 to 1 (2 ways
		

      for (int num=20;num>=1; num-=2) {
      
        System.out.print(num+"  ");
        
	} System.out.println("IF for loop");

        int i = 1;

        while (i <= 20) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }System.out.println( " --------------");
        //Print odd numbers between 20 and 50 (2 ways)
        int num1= 20;

        while (num1<=50) {
        	
        	if(num1%2!=0) {
            System.out.print(num1 + " ");
            
        	}
        num1 ++;
		 }System.out.println( " other way ");
       
	        for (int num3=20;num3<= 50;num3++) {
	        	if(num3%2!=0) {
	            System.out.print(num3 + " ");
	        	}
	        }
        
        
	}

}
