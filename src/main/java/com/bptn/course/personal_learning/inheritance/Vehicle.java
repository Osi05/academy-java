package com.bptn.course.personal_learning.inheritance;

public class Vehicle {
	
	double speed;
	int tire;
	String carModel;
	int year;
	
	//creating a go method
	void go (int tire,double speed,String carModel, int year){

		System.out.println("Vehicle model is " + carModel + " which has " + tire + " tires " +"and was made in the year "+ year+" is moving at a spead of " + speed + "km/s");
		
	}
	
	void go (String carModel, int year) {
		
		System.out.println("Vehicle is moving with " + tire + " tires and at the speed of " + speed + "km/s");
	}
	
	//creating a slow method
	void slow(int tire,double speed) {
		System.out.println("Vehicle is moving with " + tire + " tires and at the speed of " + speed + "km/s");
	}
	
	//creating a stop method
	void stop( ) {
		System.out.println("Vehicle has stopped");
	}
	
	public String toString() {
		
		return " ";
	}
	
	//overloading 
	public int add (int a, int b) {
		
		return a + b;
	}
	
	public int add(int a, int b, int c, int d) {
		
		return a + b + c + d;
	}
	
	public int add(int a, int b, int c) {
		
		return a + b + c;
	}

}
