package com.bptn.course.challenge._04_week;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public void Start(){
        
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;


        Arrays.sort(array);

        //sort array
        int result = binarySearch(array,key);

        //Print values in array after sort
        System.out.println(result);

    }

    int binarySearch(int arr[], int key){
       // put your code here.
    	int start = 0;
    	int end = arr.length - 1;
    	
    	while (start <= end) {
    		
    		//get mid point
    		int midPoint = (start + end)/2;
    		
    		//if midPoint equals to key
    		
    		if (arr[midPoint] == key) {
    			
    			return midPoint;
    		}
    		
    		//if midPoint less than key
    		if (arr[midPoint] < key) {
    			
    			start = midPoint + 1;
    		}
    		//if midPoint greater than key
    		
    		else {
    			
    			end = midPoint - 1; 
    		}
    	}
    	// Element is not present in the array
        return -1;
    }
    
       public static void main(String[] args) {
        Main main = new Main();
        main.Start();
    }
}