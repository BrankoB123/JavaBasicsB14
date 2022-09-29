package com.syntax.class9;

public class PaternsHomeWork {
	public static void main( String [] args){
	// size of the square
    int size =4;
    // outer loop
    for (int i = 0; i < size; i++) {
      // inner loop
      for (int j = 0; j < size; j++) {
        // print only star in first and last row
        if (i == 0 || i == size - 1) {
          System.out.print("*");
        }
        else {
          // print star only at first and last position row
          if (j == 0 || j == size - 1) {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}