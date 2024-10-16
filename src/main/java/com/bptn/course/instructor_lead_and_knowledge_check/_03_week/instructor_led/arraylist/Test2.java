package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.arraylist;

import java.util.List;
import java.util.ArrayList;

public class Test2 {
    
    public static String findLongest(ArrayList<String> list) {
    	// Initialize a variable to store the longest string
        String longest = "";

        // Iterate through the list and compare the length of each string
        for (String word : list) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Return the longest string
        return longest;
    }
    
    //Do not modify below code
    public static void main(String[] args) {
        //instantiate ArrayList 
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result: metropolitan");
        System.out.print("Your Result: ");
        System.out.println(findLongest(values));
    }
}