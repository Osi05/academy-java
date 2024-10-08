package com.bptn.course._instructor_lead_and_knowledge_check._02_week.program_exception_handling;

public class NestedTryCatch2 {

    void method() {
      //Open outer try
      try {

        //Create inner try
        try {
          int[] arr = {1,2,3,4};
          System.out.println(arr[0]); //printing element in first index

          System.out.println(arr[5]); //trying to print element at index 5

        }
        catch (ArithmeticException e) {
          //print inner catch
          System.out.println("ArithmeticException occurred");
        }
        
      }
      //print outer catch
      catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
      }
    }

  // main() method to run the program
    public static void main(String args[]) {
    	NestedTryCatch2 nestedTryBlockSolutionObject = new NestedTryCatch2();
        nestedTryBlockSolutionObject.method();
    }
}
