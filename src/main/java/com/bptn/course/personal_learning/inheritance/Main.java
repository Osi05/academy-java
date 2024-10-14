package com.bptn.course.personal_learning.inheritance;

import java.util.ArrayList;
public class Main {

	

	
	public static void main(String[] args) {
		
		//creating an object of the class for car
		
//		Car car = new Car();
//		
//		car.go();
//		car.stop();
//		car.slow();
		
//		Car car = new Car();
//		Bicycle bike = new Bicycle();
//		Train train = new Train();
//		
//		train.speed = 100;
//		
//		Vehicle[] vehicles = {car,bike,train};
//		
//		for(Vehicle vehicle : vehicles) {
//			vehicle.go();
//			System.out.println(vehicle);
//		}
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		Train train = new Train();
		
		
//		Car[] common = {car,bike,train};
//		Bicycle[] commonBike = {car,bike,train};
//		Train[] commonTrain = {car,bike,train};
		
		Vehicle[] vehicles = {car,bike,train};
		
		for (Vehicle common : vehicles) {
			common.stop();
			
			System.out.println(common);
		}
		
//		car.go(4, 40, "Toyota Camry", 2025);
//		
//		Bicycle bike = new Bicycle();
//		
//		car.fast();
//		
////		bike.slow(2,90);
//		
////		bike.go(2, 30);
//		
//		bike.fast();
		
		
//		System.out.println(car.add(120, 100));
		
		int number = 13;
//		boolean isEqual = (number == 13);
		
		String hola = "Hello World!";
//		boolean isEqual = !(hola == "Hello World!");
		



ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(2);
        
        int val1 = 0;
        int val2 = 5;
        
        boolean isEqual = (!nums.get(val1).equals(nums.get(val2)));

		System.out.println(isEqual);
		
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.print(" - even");
            }
//            System.out.println();
        }
        System.out.print("We love to print lines.");
}
	
	
	}

