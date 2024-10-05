package com.bptn.course._il_._02_week.method_overriding;

public class Bike extends Vehicle {
    // Instance variable for bike handle
    private String bikeHandle;

    // Parameterized constructor
    public Bike(String color, String brand, String bikeHandle) {
        super(color, brand); // Call to the parent class constructor
        this.bikeHandle = bikeHandle; // Initialize the bikeHandle variable
    }

    // Method to print the bike details
    public void print() {
        // Call the print method of the parent class
        super.print();
    }
}
