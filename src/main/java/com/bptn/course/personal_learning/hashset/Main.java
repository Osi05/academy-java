package com.bptn.course.personal_learning.hashset;
import java.util.HashSet;
import java.util.LinkedList;
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
    	
    	LinkedList<Integer> num = new LinkedList<>();
    	
    	num.add(10);
    	num.set(0, 2);
    	System.out.println(num);
    	
    }
    
    

}