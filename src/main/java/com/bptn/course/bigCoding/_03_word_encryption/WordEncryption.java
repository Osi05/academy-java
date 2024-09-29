package com.bptn.course.bigCoding._03_word_encryption;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in); // Create a Scanner object to take user input

        // Ask the user to enter a word
        System.out.println("Enter a word to encrypt:");
        String userInput = myObj.nextLine(); // Read the user's input

        // Create an empty string to store the encrypted word
        String encryptedWord = "";

        // Loop through each character in the word
        for (int i = 0; i < userInput.length(); i++) {
            char letter = userInput.charAt(i); // Get the current character from the word

            // Check if the character is a lowerCase letter (a-z)
            if (letter >= 'a' && letter <= 'z') {
                if (letter == 'z') {
                    encryptedWord += 'a'; // If it's 'z', change it to 'a'
                } else {
                    encryptedWord += (char)(letter + 1); // Shift to the next letter
                }
            }
            // Check if the character is an upperCase letter (A-Z)
            else if (letter >= 'A' && letter <= 'Z') {
                if (letter == 'Z') {
                    encryptedWord += 'A'; // If it's 'Z', change it to 'A'
                } else {
                    encryptedWord += (char)(letter + 1); // Shift to the next letter
                }
            }
            // If it's not a letter, leave it unchanged
            else {
                encryptedWord += letter; // Non-alphabetic characters stay the same
            }
        }

        // Display the encrypted word
        System.out.println("Encrypted word: " + encryptedWord);

        // Close the scanner
        myObj.close();

	}

}
