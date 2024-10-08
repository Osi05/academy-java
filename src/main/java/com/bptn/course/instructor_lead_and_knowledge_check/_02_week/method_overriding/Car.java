package com.bptn.course.instructor_lead_and_knowledge_check._02_week.method_overriding;

public class Car extends Vehicle {
    // Instance variable for steering wheel
    private String steeringWheel;

    // Parameterized constructor
    public Car(String color, String brand, String steeringWheel) {
        super(color, brand); // Call to the parent class constructor
        this.steeringWheel = steeringWheel; // Initialize the steeringWheel variable
    }

    // Method to print the car details
    public void print() {
        // Call the print method of the parent class
        super.print();
    }
}
