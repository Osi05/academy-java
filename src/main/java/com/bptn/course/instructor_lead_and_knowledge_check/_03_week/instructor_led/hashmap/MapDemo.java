package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.hashmap;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {
    	
    	//creating HashMap called numbers
    	
    	Map<Integer, String> numbers = new HashMap<>();
    	
    	//adding key-value pairs
    	numbers.put(1, "One");
    	numbers.put(2, "Two");
    	numbers.put(3, "Three");
    	numbers.put(4, "Four");
    	numbers.put(5, "Five");
    	numbers.put(6, "Six");
    	numbers.put(7, "Seven");
    	numbers.put(8, "Eight");
    	numbers.put(9, "Nine");
    	numbers.put(10, "Ten");
    	
    	
    	//using a for loop to print out numbers  	
    	for (Integer number : numbers.keySet()) {
    		System.out.println(number + " : " + numbers.get(number));
    	}
    	
    	//removing key 7
    	numbers.remove(7);
    	
    	//adding key 11
    	numbers.put(11, "Eleven");
    	
    	//using for loop to print out updated numbers 
    	for (Integer number : numbers.keySet()) {
    		System.out.println(number + " : " + numbers.get(number));
    	}

    }
}