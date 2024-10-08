package com.bptn.course._il_._02_week.method_overriding;

public class Vehicle {
    // Instance variables
    private String color;
    private String brand;

    // Parameterized constructor
    public Vehicle(String color, String brand) {
        this.color = color; // Initialize the color variable
        this.brand = brand; // Initialize the brand variable
    }

    // Method to print the vehicle details
    public void print() {
        System.out.println(this.color + " " + this.brand);
    }

}
