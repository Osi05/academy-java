package com.bptn.course.instructor_lead_and_knowledge_check._03_week.knowledge_check._arraylists;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        for (int i = 0; i < nums.length; i++) {
        	values.add(nums[i]); //added nums[i] to the ArrayList
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}