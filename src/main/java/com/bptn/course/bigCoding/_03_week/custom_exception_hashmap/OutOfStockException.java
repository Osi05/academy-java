package com.bptn.course.bigCoding._03_week.custom_exception_hashmap;

//Customized Exception Class for when a product is out of stock

public class OutOfStockException extends Exception {
 
 // Modify the constructor below to take a String message parameter.   
 public OutOfStockException(String message) {
     // Call the superclass constructor passing the message parameter.
	 super(message);
 }
}
