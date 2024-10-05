package com.bptn.course.bigCoding._02_week._01_area_perimeter;

public class AreaPerimeter{

	  int a =12; // initialized variable a
	  int b = 10; // initialized variable b
	  int c = 4; // initialized variable c

		// Write perimeterCalculator method 
	 public int perimeterCalculator (int a, int b, int c) {

	    int perimeter = a + b + c; // calculates the perimeter 
	    
	    return perimeter; // returns perimeter 

	  }
	    

	    // Write areaCalculator method
	   public int areaCalculator (int b, int h) {

	   int area = (b * h)/2; // calculates the area 
	   
	   return area; //returns area

	  }
		

	    // Do not modify the code below:
	    public static void main (String[]args){
	    	
	    	//creates triangle object
	    	AreaPerimeter object = new AreaPerimeter();

			int a = 7;
	        int b = 10;
	        int c = 35;

	        int perimeter = object.perimeterCalculator(a,b,c);
	        int area = object.areaCalculator(7,10);
	        
	        //prints out perimeter and area
	        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
	    }
	}
