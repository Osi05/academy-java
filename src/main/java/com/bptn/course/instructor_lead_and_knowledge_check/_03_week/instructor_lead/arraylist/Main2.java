package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        
       List<String> nameList = new ArrayList<String>();

       nameList.add("Robert");
       nameList.add("Samson");
       nameList.add("Alex");
       nameList.add("William");
       
       System.out.println("Elements of List: " + nameList);

       // Create an array of String named output of the same size as nameList.
       String[] output = new String[nameList.size()]; // Using size() method to create an array of the same size.
        
       // Fetch the elements from the nameList and insert them into the newly created array.
       for (int i = 0; i < nameList.size(); i++) {
           output[i] = nameList.get(i); // Using get() method to fetch elements from nameList.
       }
      
        // Print the elements of the array.
        System.out.print("Elements of Array: ");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + "  ");
        }
    }
}
