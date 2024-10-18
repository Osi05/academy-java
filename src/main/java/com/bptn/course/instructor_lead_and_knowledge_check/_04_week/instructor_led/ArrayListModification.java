package com.bptn.course.instructor_lead_and_knowledge_check._04_week.instructor_led;

import java.util.ArrayList;

public class ArrayListModification {
    public static void main(String[] args) {
        // Create an ArrayList
         ArrayList<String> languages = new ArrayList<>();

        // Add elements to the ArrayList
        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");
        

        // Print the original ArrayList using forEach and a lambda
        System.out.println("Original ArrayList:");
        languages.forEach(language -> System.out.println(language));

        // Modify all elements to uppercase using replaceAll()
        languages.replaceAll(language -> language.toUpperCase());     

        
         // Print the updated ArrayList using forEach and a lambda
        System.out.println("\nUpdated ArrayList:");
        languages.forEach(language -> System.out.println(language));
    }
}
