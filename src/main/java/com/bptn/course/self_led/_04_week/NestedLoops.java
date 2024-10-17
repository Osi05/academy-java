package com.bptn.course.self_led._04_week;

public class NestedLoops {

	   public static void main(String[] args) {
	       for (int row = 0; row < 5; row++) {
	           for (int col = 0; col < 10; col++) {
	               System.out.print("*");
	           }
	           System.out.println();
	       }
	   }
	}
/*
The outer loop controls the rows and starts at 0 and stops when row gets to 5
loop increases row after each iteration, this runs 5 times

The inner loop controls the columns, the variable col starts at 0 and runs till col gets to 10
col increases by 1 after each iteration
inner loop runs 10 times 

For each iteration of the outer loop which runs 5 times, the inner loop runs 10 times and prints 10 stars(*)
*/