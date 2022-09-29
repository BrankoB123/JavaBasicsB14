package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array(shorter way) in
		 *  which first array will consist of 4 names 
		 *  and second array will contain grades. 
		 *  Then your program should print name of
		 *   the students that has A and B grade
		 */
		String[][] arr= {
                {"Yusuf", "Hamza", "Adam", "John"},
                {"A", "B", "C", "D"}
        };
		
		System.out.println(arr[0][0]+"="+arr[1][0]);
		System.out.println(arr[0][2]+"="+arr[1][2]);
		
		
		// Enhanced For Loop
    for(String[] singleArray:arr) { //loops over 1D or single array
    	
        for(String el:singleArray) { //loops over each element of the 1DArray
        	
	 System.out.print(el+"  ");
  }
    System.out.println();
  }
   System.out.println(" ---------------------------- ");

//Retrieving all values from2d array with Regular For loops
   
   // String [][] arr={
   // {"Yusuf", "Hamza", "Adam", "John"},
   //{"A", "B", "C", "D"}
   //  }
   
      for(int i=0; i<arr.length; i++) { // i takes care of rows
       for (int j=0; j<arr[i].length; j++) {//j is for columns
          System.out.print(arr[i][j]+"  ");
     }
           System.out.println();
 }
}
}
