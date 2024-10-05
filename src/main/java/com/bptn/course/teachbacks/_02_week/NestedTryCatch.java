package com.bptn.course.teachbacks._02_week;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block: This will execute without any exceptions.");

            // First inner try block
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch 1: Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
            }

            // Second inner try block
            try {
                String text = null;
                System.out.println(text.length()); // This will throw NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Inner Catch 2: Caught a NullPointerException: " + e.getMessage());
            }

            System.out.println("Outer try block: This line will also execute after inner catches.");

        } catch (Exception e) {
            System.out.println("Outer Catch: Caught an Exception: " + e.getMessage());
        }

        System.out.println("Program continues after the outer try.");
    }
}
