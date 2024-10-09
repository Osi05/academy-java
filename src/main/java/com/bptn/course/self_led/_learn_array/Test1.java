package com.bptn.course.self_led._learn_array;

import java.util.*;

public class Test1 {
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
    	
        // Iterate through the list in reverse order
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i)); // Add elements to the reversed list
        }
        return reversed;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        ArrayList<Integer> result = reverse(values);
        System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
        System.out.println("Your Result:\t\t " + result);
    }
}
