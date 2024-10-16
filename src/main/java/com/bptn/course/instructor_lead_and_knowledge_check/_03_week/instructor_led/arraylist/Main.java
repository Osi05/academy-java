package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.arraylist;

import java.util.List;
import java.util.ArrayList;
 
public class Main {
    
    // Complete the functionality of the method below
    public static  List<String> convertArrayToList(String[] inputArray) {
        
        // Create a new ArrayList of String. 
        List<String> convertedArray = new ArrayList<>();

        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
        
        for (String input : inputArray) {
        	convertedArray.add(input);
        }
        // return the new list with elements.
        return convertedArray;
    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }
}
