package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.arraylist;

import java.util.TreeSet;

public class TreeSetManipulation  {
    public static void main(String[] args) {
        // Creating a TreeSet and adding elements
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Displaying the size and elements of the set
        System.out.println("Set size: " + set.size());
        System.out.println("Elements in set: " + set);

        // Finding the first and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Elements less than 'B'
        System.out.println("Elements less than 'B': " + set.headSet("B"));

        // Elements greater than or equal to 'B'
        System.out.println("Elements greater than or equal to 'B': " + set.tailSet("B"));

        // Elements between 'A' (inclusive) and 'C' (exclusive)
        System.out.println("Elements between 'A' (inclusive) and 'C' (exclusive): " + set.subSet("A", "C"));

        // Checking if the set contains 'B'
        System.out.println("Does the set contain 'B'? " + set.contains("B"));

        // Removing 'B' from the set
        set.remove("B");
        System.out.println("Set after removing 'B': " + set);
    }
}
