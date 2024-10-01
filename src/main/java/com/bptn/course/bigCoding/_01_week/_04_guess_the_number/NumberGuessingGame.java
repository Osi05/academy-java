package com.bptn.course.bigCoding._01_week._04_guess_the_number;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // Create a Scanner object to take user input
        Random rand = new Random(); // Create a Random object rand to generate a random number

        int targetNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        int guess = 0; // Declare variable guess to store user's guess

        System.out.println("Please enter a number between 1 and 100.");

        // Loop until the user guesses the correct number
        while (guess != targetNumber) {
            // Ask the user for their guess
            System.out.print("Enter your guess: ");
            guess = myObj.nextInt(); // Read the user's guess

            // Check if the guess is too low
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            }
            // Check if the guess is too high
            else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
            // If the guess is correct
            else {
                System.out.println("Congratulations! You guessed the number correctly!");
            }
        }

        // Close the scanner
        myObj.close();
	}

}
