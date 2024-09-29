package com.bptn.course.bigCoding;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        int userInput; // Declare a variable for user choice
        String str1, str2; // Declare strings for operations

        // Use a do-while loop to keep showing the menu until the user chooses to exit
        do {
            // Print the menu options
            System.out.println("1. Check if a string is a palindrome");
            System.out.println("2. Reverse a string");
            System.out.println("3. Concatenate two strings");
            System.out.println("4. Compare two strings");
            System.out.println("5. Calculate the length of a string");
            System.out.print("Enter the option: ");

            userInput = scan.nextInt(); // Read the user's choice
            scan.nextLine(); // Consume the newline left by nextInt()

            // Perform the respective operation based on the user's input using else-if
            if (userInput == 1) {
                // Palindrome check
                System.out.println("Enter a string to check if it's a palindrome:");
                str1 = scan.nextLine();
                
                String reversedStr = ""; //Create emptyString to store reversedStr 
                
                //manually reverse String
                for (int i = str1.length() - 1; i >= 0; i--) {
                	reversedStr = reversedStr + str1.charAt(i);
                }
                
                //using if statement to confirm if input is Palindrome 
                if (str1.equals(reversedStr)) {
                    System.out.println(str1 + " is a palindrome");
                } else {
                    System.out.println(str1 + " is not a palindrome");
                }
            } 
            else if (userInput == 2) {
                // Reverse a string
                System.out.println("Enter a string to reverse:");
                str1 = scan.nextLine();
                String reversedStr = ""; // Create empty reversed String 

                // Reverse the string manually
                for (int i = str1.length() - 1; i >= 0; i--) {
                    reversedStr = reversedStr + str1.charAt(i);
                }

                System.out.println("Reversed string: " + reversedStr); //Print out reversedString
            } 
            else if (userInput == 3) {
                // Concatenate two strings
                System.out.println("Enter the first string:");
                str1 = scan.nextLine();
                System.out.println("Enter the second string:");
                str2 = scan.nextLine();
                System.out.println(str1 + str2); //Print out concatenated String 
            } 
            else if (userInput == 4) {
                // Compare two strings
                System.out.println("Enter the first string:");
                str1 = scan.nextLine();
                System.out.println("Enter the second string:");
                str2 = scan.nextLine();
                if (str1.equals(str2)) {
                    System.out.println("The entered strings are equal");
                } else {
                    System.out.println("The entered strings are not equal.");
                }
            } 
            else if (userInput == 5) {
                // Calculate the length of a string
                System.out.println("Enter a string to find its length:");
                str1 = scan.nextLine();
                System.out.println("The length of the entered string is: " + str1.length()); //Print out length of String 
            } 
            else {
                //Print out Invalid option
                System.out.println("Invalid choice! Please make a valid choice.");
            }
        } while (true); // Continue until the user chooses to exit 
        
        }
	}