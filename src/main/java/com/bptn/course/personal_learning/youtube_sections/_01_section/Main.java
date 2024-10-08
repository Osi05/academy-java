package com.bptn.course.personal_learning.youtube_sections._01_section;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		//creating a function that asks you to guess a random number 
		//and determines if you got the right number
		
		//create scanner
		Scanner scan = new Scanner(System.in);
		
//		ArrayList<Main> myArray = new ArrayList<Main>();
		
		//create random object
		Random rand = new Random();
		
		//ask user for number
		System.out.println("Guess number: ");	

		
//		while (true) {
//		try {
//			
//			//read user input
//			int num = scan.nextInt();
//			
//			//variable to hold the random number
//			int randNumber = rand.nextInt(100);
//			
//			if (num == randNumber) {
//				System.out.println("You got the right number!");
//			}
//			else if (num < randNumber) {
//				
//				System.out.println("OOhs! Still too low, Try again!");
//		
//			}
//			else if (num > randNumber){
//				System.out.println("Too high, Try again!");
//		
//			}
//			else {
//				continue; 
//			}
//		break;
//		}
//		catch(InputMismatchException e) {
//			//catch error
//			System.out.println("Wrong input, try again! ");
//		}
//		finally {
//			scan.close();
//		}
//		
//	}
//		do {
//		//read user input
//		int num = scan.nextInt();
//		
//		//variable to hold the random number
//		int randNumber = rand.nextInt(100);
//		
//		if (num == randNumber) {
//			System.out.println("You got the right number!");
//		}
//		else if (num < randNumber) {
//			
//			System.out.println("OOhs! Still too low, Try again!");
//			
//			System.out.println("Guess number: ");	
//	
//		}
//		else if (num > randNumber){
//			System.out.println("Too high, Try again!");
//			
//			System.out.println("Guess number: ");	
//	
//		}
//		else if (num < 0) {
//					System.out.println("Pleasee enter a vaid number ");
//					
//					System.out.println("Guess number: ");	
//		}
//		else {
//			System.out.println("Please numbers only");
//			
//			System.out.println("Guess number: ");	
//		}
//	}
//		while (true);
		
		
		  ArrayList<String> names = new ArrayList<String>();
	        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
	        for (int i = 0; i < friends.length; i++) {
	            names.add(friends[i]);
	        }
	        System.out.println(names);
	}
}
