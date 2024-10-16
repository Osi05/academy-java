package com.bptn.course.instructor_lead_and_knowledge_check._04_week.knowlede_check;

import java.util.ArrayList;
import java.util.List;


public class LinearSearchList {

  // linearSearch() method that takes in a List and an integer target as parameters
  public static boolean linearSearch(List<Integer> list, int target) {
    // Iterate over all elements in the List using for-each loop
    for (int i : list) {
    	
      // Check if the current value is equal to the target
      if (i == target) {
        // If so, return true
    	  return true;
        
      }
    }
    // If the target was not found, return false
    return false;
   
  }

 
  public static void main(String[] args) {
    // Create a ArrayList of integers and populate integer values
    List<Integer> numbers = new ArrayList<>();
   

    // Define the target to search for
    numbers.add(3);
    numbers.add(6);
    numbers.add(2);
    numbers.add(9);
    numbers.add(11);
   
    //initializing target 
    int target = 6;
    
    // Call the linearSearch method with the list and target as arguments
    //Store the result in variable of type boolean
    boolean result = linearSearch(numbers, target);
    
    // Check the result and print the appropriate message
    if (result == true) {
       System.out.println("Target found in the List.");
    } else {
       System.out.println("Target not found in the List.");
    }
  }
}
/* 
 imported the ArrayList and List
 Created a class LinearSearchList
 Created a method linearSearch which takes args List type called list and an int called target
 iterated through the list so if target is in the list, it returns true, if not it returns false
 Created a List obj called numbers
 added values to numbers
 created a variable target to hold the target 6
 created a boolean variable result that called the linearSearch method
 did an if statement to print as required if true or false 
 */
