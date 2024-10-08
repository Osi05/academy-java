package com.bptn.course.instructor_lead_and_knowledge_check._03_week.knowledge_check._arraylists;

import java.util.List;
import java.util.ArrayList;

public class Test8 {
    public static void shiftLeftOne(ArrayList<Integer> list) {
        //code here
        if (list.size() > 0) {  // Ensure the list is not empty
            int firstElement = list.remove(0);  // Remove the first element
            list.add(firstElement);  // Add the removed element to the end of the list
        }
    }
   

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }
}