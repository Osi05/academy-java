package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.arraylist;

//imported ArrayList
import java.util.ArrayList;

public class Debug {
	   public static void main(String[] args) {
		   /*Corrected the obj by changing the primitive int to the wrapper class Integer
		    * Also corrected the Arraylist to ArrayList
		   */
		   
	      ArrayList<Integer> numbers = new ArrayList<>();
	      
	       //added input to the ArrayList\
	       numbers.add(100);
	       numbers.add(101);
	      
	      System.out.println(numbers);
	   }
	}