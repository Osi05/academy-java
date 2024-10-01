package com.bptn.course._06_oop;

public class Car2 {
    // Declare class variables
    private String color;
    private String brand;
    private int price;

    // Default constructor
    public Car2() {
        // Calls the parameterized constructor with default values
        this("Red", "Toyota", 20000);
    }

    // Parameterized constructor
    public Car2(String color, String brand, int price) {
        // Assign constructor parameters to class variables using the this keyword
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    // Method to print car details using print() method
    void printCarDetails() {
        this.print();
    }

    // Private method to print formatted car details
    private void print() {
        System.out.println("Car{color='" + color + "', brand='" + brand + "', price=" + price + '}');
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Create a car object using the default constructor
        Car2 defaultCar = new Car2();
        defaultCar.printCarDetails(); // Call method to print details

        System.out.println(); // Adding a blank line for readability

        // Create a car object using the parameterized constructor
        Car2 customCar = new Car2("Blue", "Honda", 25000);
        customCar.printCarDetails(); // Call method to print details
    }
}

