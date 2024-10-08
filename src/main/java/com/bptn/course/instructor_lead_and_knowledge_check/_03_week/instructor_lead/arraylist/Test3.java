package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.arraylist;

import java.util.List;
import java.util.ArrayList;

public class Test3 {
    public static void moveSmallest(ArrayList<Integer> list) {
    	//initialize index
        int smallestIndex = 0;
        
        //create a for loop to iterate through the ArrayList
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(smallestIndex)) {
            	smallestIndex = i;
            }
        }
        // Step 2: Remove the smallest element
        int smallestValue = list.remove(smallestIndex);

        // move the smallest element to the front
        list.add(0, smallestValue);
    }
    


    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result: [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result: " + values);
    }
}