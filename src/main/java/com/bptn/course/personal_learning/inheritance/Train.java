package com.bptn.course.personal_learning.inheritance;

public class Train extends Vehicle {
	
	//overriding go
@Override
	 void go(int tire,double speed,String carModel, int year) {
		 
			System.out.println("The Train is moving at a speed of " + speed + "km/s");
		}

void stop( ) {
	System.out.println("Train has stopped");
}
}
