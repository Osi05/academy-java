package com.bptn.course.instructor_lead_and_knowledge_check._03_week.knowledge_check._arraylists;

import java.util.*;

public class Test3 {
    
    public static void printEvenIndex(ArrayList<Integer> list) {
    	//fixed the for loop so i iterates through the ArrayList
        for (int i = 0; i < list.size(); i++) {
        	//fixed the modulus operation so list.get(i) is printed when the remainder is 0 
            if (i % 2 == 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 1, 7, -2, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenIndex(values);
    }
}