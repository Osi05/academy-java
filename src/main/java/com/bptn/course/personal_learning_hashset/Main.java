package com.bptn.course.personal_learning_hashset;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Instantiate HashSet and try to use some of the methods listed above.
    	
    	Set<Integer> nums = new HashSet<>();
    	
    	nums.add(4);
    	nums.add(7);
    	nums.add(9);
    	nums.add(10);
    	nums.add(6);
    	nums.remove(3);
    	
    	System.out.println("The mumbers in the Set are: " + nums);
    	System.out.println("Size of the Set is: " + nums.size());
    	
    }
    
    

}