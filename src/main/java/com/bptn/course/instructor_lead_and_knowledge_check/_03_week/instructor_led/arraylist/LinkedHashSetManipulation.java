package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.arraylist;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetManipulation {
	
    public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
    	
    	LinkedHashSet<String> set = new LinkedHashSet<>();
    	
    	// Add elements to the LinkedHashSet
        set.add("A");
        set.add("B");
        set.add("C");
	
		// Print the size of the set
        System.out.println("Set size: " + set.size());
		

		// Use for each loop to print the elements in the set
        for (String i : set) {
        	System.out.println("Element: " + i);
        }
		

		// Use iterator to print the elements in the set
        Iterator<String> alpha = set.iterator();
        while (alpha.hasNext()) {
        	System.out.println("Element: " + alpha.next());
        }
        
        
        
		// Use remove() method to remove the element A from the set
        set.remove("A");
        
        //printing set to show new set
		System.out.println("Set after using remove(): " + set);
		
		// Use contains() method to check if the element B exists in the set
        if (set.contains("B")) {
        	System.out.println("Element 'B' exists in the set.");
        }
        else {
        	System.out.println("Element ‘B’ does not exist in the set.");
        }
        
		// Use clear() method to remove all elements from the set
		set.clear();

        // Print the set to show that it is empty.
		System.out.println("Set after using clear(): " + set);
        
	}
}
