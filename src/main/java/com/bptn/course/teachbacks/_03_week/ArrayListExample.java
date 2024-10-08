package com.bptn.course.teachbacks._03_week;

import java.util.List;

import java.util.ArrayList;
public class ArrayListExample {
	    public static void main(String[] args) {
	    	
	        // Create an ArrayList of Strings
	        List<String> fruits = new ArrayList<>();
	        
	        // Add elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Mango");
//	        fruits.add(0, "Mango");
	        
	        
	        // Display the ArrayList
//	        System.out.println("Fruits list: " + fruits);
	        
	        // Get an element from the ArrayList (by index)
//	        String fruit = fruits.get(1);  // Index 1 corresponds to "Banana"
//	         String fruit2 = fruits.get(2);
	        
//	        System.out.println("Element at index 1: " + fruit);
//	        System.out.println("Element at index 2: " + fruit2);
	        
	        // Remove an element from the ArrayList (by index)
//	        fruits.remove(0);  // Removes "Apple"
//	        
//	        System.out.println("After removing element at index 0: " + fruits);
	        
	        // Remove an element from the ArrayList (by value)
	        fruits.remove("Cherry");  // Removes "Cherry"
	        
	        System.out.println("After removing 'Cherry': " + fruits);
	    }
	}

