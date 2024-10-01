package com.bptn.course._06_oop;

class Car {

    // Declare the instance variables
    String color;
    String brand;
    int price;

      public Car(String color, String brand, int price) {
        // Assign constructor arguments to instance variables using 'this' keyword
        this.color = color;
        this.brand = brand;
        this.price = price;

      }

      // Method to print car details
      void printCarDetails() {
          System.out.println("Car{" +
                  "color='" + color + '\'' +
                  ", brand='" + brand + '\'' +
                  ", price=" + price +
                  '}');
    }

    // Fill in the code
    public static void main(String args[]) {
        Car objCar = new Car("white", "BMW", 70000); // Create Car objects
        objCar.printCarDetails(); //Call printCarDetails on car object
}
}