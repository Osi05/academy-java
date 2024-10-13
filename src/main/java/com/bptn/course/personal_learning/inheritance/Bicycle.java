package com.bptn.course.personal_learning.inheritance;

public class Bicycle extends Vehicle  {
	
	int pedals;

	//overriding go
@Override
	 void go(int tire,double speed,String carModel, int year) {
		 
			System.out.println("The Bicyle is moving at a speed of " + speed + "km/s");
		}

void stop( ) {
	System.out.println("Bicycle has stopped");
}
}
