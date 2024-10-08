package com.bptn.course.instructor_lead_and_knowledge_check._02_week.program_exception_handling;


public class NestedTryCatch  {
    
    // Method to demonstrate exception propagation
     public void method1(){
      
      int[] arr = {1,2,3,4}; // creating an array named arr

          arr[4] = 6; //tried accessing an out of bounds element
     
    }
    // Method to handle exception and demonstrate propagation
    public void method2(){
      try {
    	  method1();
        System.out.println();
      }
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
      }
     
    }
    
    
    // main() method to run the program
    public static void main(String args[]) {
    	NestedTryCatch exceptionSolutionObject = new NestedTryCatch();
        exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
    }
}
