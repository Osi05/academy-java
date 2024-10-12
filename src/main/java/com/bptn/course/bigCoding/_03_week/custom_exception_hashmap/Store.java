package com.bptn.course.bigCoding._03_week.custom_exception_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Store {
    
    // create the map instance variable
	private  Map<String, Integer> products = new HashMap<>();
    
 
	public Store() {
        // Initialize the products map with default values 
		
    	products.put("apple", 10);
    	products.put("banana", 5);
    	products.put("orange", 0);
    }

    public void purchase(String product, int quantity) throws OutOfStockException {
        // Check if the product is available in the store. Hint: Use the map
        
    		
    		if (!products.containsKey(product)){
    			
			    // If not, throw an OutOfStockException with a message indicating the product is not available.
    			throw new OutOfStockException("Product " + product + " not available in store");
    		}
    			
    		// Check if there is enough stock for the desired quantity. Hint: Use the map
				
				if (quantity > products.get(product)) {

			    // If not, throw an OutOfStockException with a message indicating the product is out of stock.   
					throw new OutOfStockException("Product " + product + " out of stock");
			}

    	
    }
}
/*
 *Created the Map instance 
 *Added keys and values to products
 *Created the purchase method to check if product is available
 *throws an outOfStockException if product not found
 *using the purchase method to check if quantity is more than available stock and throwing the Exception if true  
 */
