package com.bptn.course.bigCoding._05_week;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		Arrays.sort(arr);
		
		// Initialize low and high pointers for the start and end of the array respectively
		int low = 0;
		int high = arr.length - 1;

		// Keep looping until the high pointer is greater than or equal to the low pointer
		while (high >= low) {
			// Calculate the middle index
			int mid = (low + high)/2;
			
			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) {
				return mid;
			}
			// If the element at the middle index is less than the key, move the low pointer to the middle + 1
			else if (arr[mid] < key) {
				low = mid + 1;
			}
			// If the element at the middle index is greater than the key, move the high pointer to the middle - 1
			else {
				high = mid - 1;
			}
		}
		// If the key is not found, return -1
		return -1;
	}

    //Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}

/* 
 * Created a binarySearch method which takes 2 parameters unsorted array and int key
 * used the Arrays.sort method to sort the array
 * initialized low and high to represent the start and end of the list
 * initialized low with 0 and high with the length of the array
 * did a while loop to iterate through the code while high is greater than or equals to low
 * found the mid point by adding low and high and dividing the result by 2
 * checked to see if mid arr is same as key, returned mid if true
 * if arr[mid] is less than key, i move the low pointer by adding 1 to mid
 * else I moved the high pointer by subtracting 1 from high \
 * outside the loop, I returned -1 if the element is not found in the array 
 */
