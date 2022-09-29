package com.syntax.class10;

public class GroupProjectTask3 {

	public static void main(String[] args) {
		/*Task 3
		 * Create a 2D array of integer values. 
		 * Print the sum of all numbers.
		 */
		int[][] num= {
				{5,6,7},
				{15,20,25},
				{200,300,400},
				{1000,2000,3000},
		};
		
		int sum=0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				sum=sum+ num[i][j];
				
			/* with enhanced loop
			 *   int sum=0;

        for(int[] ar:arr) {

            for(int num:ar) {
                sum+=num;

            }

        }
        System.out.println(sum);

			 */
			}
		}System.out.println(" The sum of all numbers is "+":"+sum);
	}
}