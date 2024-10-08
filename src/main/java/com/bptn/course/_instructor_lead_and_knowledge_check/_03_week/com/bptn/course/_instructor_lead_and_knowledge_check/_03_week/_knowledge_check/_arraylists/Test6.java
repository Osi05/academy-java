package com.bptn.course._instructor_lead_and_knowledge_check._03_week.com.bptn.course._instructor_lead_and_knowledge_check._03_week._knowledge_check._arraylists;

import java.util.List;
import java.util.ArrayList;

public class Test6 {
    public static int sumNegValues(ArrayList<Integer> list) {
        //code here
    	//initialized sum
    	int sum = 0;
    	
    	//created a for loop to iterate through the list
    	for (int value : list) {
    		
    		//created an if statement to add sum to the value 
            if (value < 0) {
                sum += value;
            }
        }
        return sum;       
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }
}
