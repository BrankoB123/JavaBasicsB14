package com.syntax.class9;

public class Clock2 {

	public static void main(String[] args) {
		
		for (int hr1= 0; hr1<=2; hr1++) {
			
	        for(int hr2=0; hr2<=9; hr2++) {
	        	
	            if(hr1==2&&hr2==4) {
	                break;
	                }
	            for(int m1=0; m1<=5; m1++) {
	                for(int m2=0; m2<=9; m2++) {

	                    System.out.println(hr1 +""+ hr2 +":"+ m1+""+m2);
	                }

	            }
	        }   
	        
		}

	}
}