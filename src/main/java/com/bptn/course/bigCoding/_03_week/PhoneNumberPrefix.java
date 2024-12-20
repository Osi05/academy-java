package com.bptn.course.bigCoding._03_week;

import java.util.ArrayList; // import ArrayList class
import java.util.HashSet; // import HashSet class
import java.util.List; // import List interface
import java.util.Set; // import Set interface

public class PhoneNumberPrefix {
    public static void main(String[] args) {
        
        // Create a list of phone numbers
    	List<String> phoneNumbers = new ArrayList<>();
    	
    	//adding phone numbers
    	phoneNumbers.add("555-555-1234");
    	phoneNumbers.add("555-555-2345");
    	phoneNumbers.add("555-555-3456");
    	phoneNumbers.add("444-444-1234");
    	phoneNumbers.add("333-333-1234");
        

        // Create a set to hold the unique prefixes
        Set<String> prefixes = new HashSet<>();
       

        // Add the prefix of each phone number to the set using a loop
        
        for (String phoneNumber : phoneNumbers) {
        	
        	//create a variable prefix and initialize with the substring 
        	String prefix = phoneNumber.substring(0, 7);
        	
        	//add prefix to prefixes 
        	prefixes.add(prefix);
    
        }
            
     
        // Print the unique prefixes
        System.out.println("Unique prefixes: " + prefixes);
    }
}

/*
imported the necessary class
created the List phoneNumbers
added values to the list
created the set prefixes
used the for loop to iterate through the list
created a new variable prefix and initialized with the substring of the list from chars 0 to 7
added prefix to prefixes 
printed out prefixes
*/