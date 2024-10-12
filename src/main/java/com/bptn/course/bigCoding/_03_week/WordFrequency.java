package com.bptn.course.bigCoding._03_week;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";

        // Split the sentence into words using split() method
        String [] words = sentence.split(" ");
        

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterate through each word in the sentence
        for (String word : words) {
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(word)) {
            	
            	//create variable freq which adds 1 to word 
                int freq = wordFrequency.get(word + 1);
                
                //replacing the previous entry in the map with the new frequency using the word as the map
                wordFrequency.put(word, freq);
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
               wordFrequency.put(word, 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}

/*
Initialized the String sentence 
created an Array words that is initialized with sentence.split()
created a for loop to check if the word is already in the wordFrequency 
if found, replaced the previous entry in the map with the new frequency using the word as the map
If the word is not on the map, used the put() method to add a new entry
printed out result 
*/