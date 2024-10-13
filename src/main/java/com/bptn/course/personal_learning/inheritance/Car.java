package com.bptn.course.personal_learning.inheritance;

public class Car extends Vehicle {
	
	int wheels;
	int windows;
	
//overriding
@Override
 void go(int tire, double speed,String carModel, int year) {
	System.out.println("The Car model is " + carModel + " which has " + tire + " tires " +"and was made in the year "+ year+" is moving at a spead of " + speed + "km/s");
//	void stop(){
//		System.out.println("Car has stopped!");
//		}
 }

void fast ( ) {
	
}
void stop( ) {
	System.out.println("Car has stopped");
}
}
