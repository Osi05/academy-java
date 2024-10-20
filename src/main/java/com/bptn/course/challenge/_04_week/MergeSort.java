package com.bptn.course.challenge._04_week;

import java.util.Arrays;

class MergeSort {

    public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // sort array
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {
    	
    	// Find sizes of 2 subarrays to be merged 
    	int subOne = m - l + 1;
    	int subTwo = r - m;
        
    	//create temp arrays
    	int[] firstTemp = new int[subOne];
    	int[] secondTemp = new int[subTwo];
    	
    	//copy data to temp arrays
    	for (int i = 0; i < subOne; i++) {
    		
    		firstTemp[i] = arr[l + i];
   
    	}
    	
    	for (int j = 0; j < subTwo; j++) {
    		
    		secondTemp[j] = arr[m + 1 + j];
    	}
    	
    	//merging temp arrays staring with initializing i and j
    	int i = 0;
    	int j = 0;
    	
    	int k = l;
    	while (i < subOne && j < subTwo) {
    		if (firstTemp[i] <= secondTemp[j]) {
    			arr[k] = firstTemp[i];
    			i++;
    		}
    		else {
    			arr[k] = secondTemp[j];
    			j++;
    		}
    		k++;
    	}
    	
    	//copy remaining elements of firstTemp[] if any
    	while (i < subOne) {
    		arr[k] = firstTemp[i];
    		i++;
    		k++;
    	}
    	
    	//copy remaining elements of second] if any
    	while (j < subTwo) {
    		arr[k] = secondTemp[j];
    		j++;
    		k++;
    	}
    	
 }
 
    // Main function that sorts arr[l..r] using
    // merge()
    static void mergeSort(int arr[], int l, int r) {
       // Add code here
    	
    	if (l < r) {
    		
    		//find mid point
    		int m = (l + r )/ 2;
    		
    		// recursively sort first and second halves
    		mergeSort(arr, l, m);
    		mergeSort(arr, m + 1, r);
    		
    		//merge sorted halves
    		merge(arr, l, m, r);
    	}
    }
}
