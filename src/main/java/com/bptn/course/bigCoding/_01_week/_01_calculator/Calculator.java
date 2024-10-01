package com.bptn.course.bigCoding._01_calculator;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
//Example 1
        
        //create scanner obj

        Scanner myObj = new Scanner(System.in);

        //Create array of string to get input from user 

        int userInput; // Declare userInput for user to select a choice 
        
        int userContinue; // Declare userContinue if user wants to continue running program 

        
        //Create a do while loop to print out the choices then iterate through
        do {
        	
        	// Print all the available options
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.print("Please Enter your choice: ");

            userInput = myObj.nextInt(); //Read user input
            
            //perform addition when userInput == 1
            if (userInput == 1) {
                System.out.println("Enter the first number: "); // Get first number
                int sumNum1 = myObj.nextInt();
                
                System.out.println("Enter the second number: "); //Get second number
                int sumNum2 = myObj.nextInt();
                
                int sumResult = sumNum1 + sumNum2;
                
                System.out.println("The product of the numbers " + sumNum1 + " and " + sumNum2 + " is = " + sumResult);
                }
            
            //when userInput == 2
            else if (userInput == 2) {
            	 System.out.println("Enter the first number: "); // Get first number
                 int subNum1= myObj.nextInt();
                 
                 System.out.println("Enter the second number: "); //Get second number
                 int subNum2= myObj.nextInt();
                 
                 int subResult = subNum1 - subNum2;
                 
                 System.out.println("The product of the numbers " + subNum1 + " and " + subNum2 + " is = " + subResult);
            }
            
            //when userInput == 3
            else if (userInput == 3) {
            	System.out.println("Enter the first number: "); // Get first number
                double multNum1 = myObj.nextDouble();
                
                System.out.println("Enter the second number: "); //Get second number
                double multNum2 = myObj.nextDouble();
                
                // get mult result
                double multResult = multNum1 * multNum2;
                
                //print out result
                System.out.println("The product of the numbers " + multNum1 + " and " + multNum2 + " is = " + multResult);
            }
            
            //when userInput == 4
            else if (userInput == 4){
            	System.out.println("Enter the first number: "); // Get first number
                double divNum1 = myObj.nextDouble();
                
                System.out.println("Enter the second number: "); //Get second number
                double divNum2 = myObj.nextDouble();
                
                // get div result
                double divResult = divNum1 / divNum2;
                
                //get remainder
                double divRemainder = divNum1 % divNum2;
                
                //print out result  
                System.out.println("Dividing " + divNum1 + " by " + divNum2 + " the quotient is " + divResult + "\n" + "The remainder is " + divRemainder);
            }
            
            //when userInput == 5
            else if (userInput == 5){
            	System.out.println("Enter the number to find Square: "); // Get  number
                double squareNum = myObj.nextDouble();
                
                
                // get square result
                double squareResult = squareNum * squareNum; // Get result 
                
                //print out result
                System.out.println("The Square of the number: " + squareNum + " is = " + squareResult); // Print out square result 
            }
            
            //when userInput == 6
            else if (userInput == 6){
            	System.out.println("Enter the first number: "); // Get  number
                double rootNum = myObj.nextDouble();
                
                
                // get root result
                double rootResult = Math.sqrt(rootNum);
                
                //print out result
                System.out.println("The Square root of the number: " + rootNum + " is = " + rootResult);
            }
            
            //when userInput == 7
            else if (userInput == 7){
            	System.out.println("Enter the number to find Reciprocal : "); // Get first number
                double reciprocalNum = myObj.nextDouble();
                
                // get reciprocal
                double reciprocalResult = 1 / reciprocalNum;
                
                //print out result
                System.out.println("The Reciprocal of the number " + reciprocalNum + " is = " + reciprocalResult);
            }
            else {
            	System.out.println("Invalid choice! Please make a valid choice.");
            	continue; //continue loop if wrong option is entered 
            }
            
            // when user decides to continue 
             System.out.println("To continue calculation press 1, else press any other number to exit.");
            userContinue = myObj.nextInt(); // Read the user's choice to continue or exit
            
            // If the user doesn't press 1, exit the loop
            if (userContinue != 1) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            
            } while (true); //loops continues until user decides to exit 
        myObj.close();
        }
	}