package com.bptn.course.self_led._04_week;

public class FactorialTest {

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println("factorial of 3 is: " + factorial(3));
        System.out.println("factorial of 4 is: " +factorial(4));
        System.out.println("factorial of 5 is: " +factorial(5));
        System.out.println("factorial of 6 is: " +factorial(6));
        System.out.println("factorial of 1 is: " +factorial(1));
    }
}