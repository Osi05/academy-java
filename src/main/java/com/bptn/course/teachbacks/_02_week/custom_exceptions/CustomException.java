package com.bptn.course.teachbacks._02_week.custom_exceptions;

import java.util.Scanner;


public class CustomException {

	 //Method to validate file extension
	 private static void validateFileExtension(String fileName) throws FileExtensionException {
	     if (!fileName.endsWith(".txt")) {

	         // Throw custom exception if file extension is not .txt
	         throw new FileExtensionException("File doesn't have .txt extension");
	     }
	 }

	 public static void main(String[] args) {

	     //Define a Scanner to get user input
	     Scanner scan = new Scanner(System.in);
	     
	     try {

	         //Prompt user for file name
	         System.out.println("Enter the file name with correct extension i.e. .txt ");
	         String fileName = scan.nextLine(); //Read and store file name
	         
	         //Call validateFileExtension method to check the extension
	         validateFileExtension(fileName);

	         //print success message if file is valid
	         System.out.println("Correct file name with extension .txt");

	     } catch (FileExtensionException e) {

	         //Handle the custom exception and print error message
	         System.out.println("Error: " + e.getMessage());
	         
	     } finally {

	         //Close the Scanner
	         scan.close();
	     }
	 }
	}
