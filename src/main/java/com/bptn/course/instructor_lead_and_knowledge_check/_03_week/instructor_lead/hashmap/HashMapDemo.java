package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.hashmap;

// Import HashMap and Map
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
    	
    	// creating HashMap named people
    	
    	Map<String, Integer> people = new HashMap<>();
    	
    	//add keys and values
    	people.put("Angie", 33);
    	people.put("Steve", 30);
    	people.put("John", 32);
    	
    	
    	//using a for loop tp iterate through people
    	
    	for (String person : people.keySet()) {
    		System.out.println("Name: " + person + ", Age: " + people.get(person));
    	}
    }
}