package com.bptn.course.bigCoding._05_string_pluralizer;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object to take user input
        // Ask the user for a number
        System.out.println("Enter a non-negative integer:");
        int amt = myObj.nextInt(); // Read the integer input
        myObj.nextLine(); // read the leftover newline
        
        // Ask the user for a word
        System.out.println("Enter a singular noun:");
        String word = myObj.nextLine(); // Read the singular noun as a string

        // If the amt is 1, print the singular form, otherwise print the plural form
        if (amt == 1) {
            System.out.println(amt + " " + word); // Singular case: number is 1
        } 
         else {
            //If word ends in "fe", replace "fe" with "ves"
            if (word.endsWith("fe")) {
            	word = word.substring(0, word.length() - 2) + "ves"; // knife -> knives
            } 
            //If word ends in "y" and the second-to-last letter is not a vowel, replace "y" with "ies"
            else if (word.endsWith("y")) {
                char secondLastChar = word.charAt(word.length() - 2);
                if (secondLastChar != 'a' && secondLastChar != 'e' && secondLastChar != 'i' && secondLastChar != 'o' && secondLastChar != 'u') {
                	word = word.substring(0, word.length() - 1) + "ies";
                } else {
                	word = word + "s"; //
                }
            } 
            // If word ends in "sh" or "ch", add "es"
            else if (word.endsWith("sh") || word.endsWith("ch")) {
            	word = word + "es"; 
            } 
            //If the word ends in "us", replace "us" with "i"
            else if (word.endsWith("us")) {
            	word = word.substring(0, word.length() - 2) + "i"; 
            } 
            //If word ends in "ay", "ey", "oy", or "uy", just add "s"
            else if (word.endsWith("ay") || word.endsWith("ey") || word.endsWith("oy") || word.endsWith("uy")) {
            	word = word + "s"; 
            } 
            // Default rule: just add "s" for other cases
            else {
            	word = word + "s"; 
            }

            // Print the pluralized form
            System.out.println(amt + " " + word);
        }

        // Close the scanner
        myObj.close();

	}

}
