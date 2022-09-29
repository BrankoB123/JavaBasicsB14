package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class GroupProjectTask2 {

	public static void main(String[] args) {

        /*
         * Using Scanner create an array of countries. When an array is created,
         * retrieve all values from it and while retrieving those values print capital
         * for each country. (use 2 different loops)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter how many countries you want to process");
        int size=scanner.nextInt();
        String [] countries=new String[size];// create array to store country
        String [] capitals=new String[size];// array to store capitals
        
        //this part to consume extra enter that we will het from line 18
        scanner.nextLine();
        for(int i=0;i<size;i++) {
            System.out.println("Please Enter the country name");
            countries[i]=scanner.nextLine();//stores the name of country in array countries[i]

            System.out.println("Please Enter the capital for "+countries[i]);
            capitals[i]=scanner.nextLine();
        }
     //prints array in good format
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.toString(capitals));
        for(int i=0;i<size;i++) {

            System.out.println("The Country "+ countries[i]+" Has the capital "+capitals[i]);

    }
}
}