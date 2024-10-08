package com.bptn.course.instructor_lead_and_knowledge_check._03_week.knowledge_check._arraylists;

import java.util.List;
import java.util.ArrayList;

public class Test10 {
    public static String findLongest(ArrayList<String> list) {
        //code here
        if (list.size() == 0) return "";  // If the list is empty, return an empty string

        String longestString = list.get(0);  // Assume the first element is the longest initially

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > longestString.length()) {
                longestString = list.get(i);  // Update the longest if a longer string is found
            }
        }
        
        return longestString;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }
}
