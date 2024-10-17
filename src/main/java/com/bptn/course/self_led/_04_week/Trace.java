package com.bptn.course.self_led._04_week;

public class Trace {

    public static void main(String[] args) {
        int var1 = 3;
        int var2 = 2;
        
        //print statement before the loop
        System.out.println("var1: " + var1 + " var2: " + var2);

        while ((var2 != 0) && ((var1 / var2) >= 0)) {
            var1 = var1 + 1;
            var2 = var2 - 1;
            
            //print statement inside the loop
            System.out.println("var1: " + var1 + " var2: " + var2);
        }
        
        //print statement after the loop
        System.out.println("var1: " + var1 + " var2: " + var2);
    }
}