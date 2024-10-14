package com.bptn.course.bigCoding._03_week.sum_calculator_thread;

public class TestMain {

    public static void main(String[] args) {
    	
        
        // Create two SumCalculator threads to calculate the sum of two different ranges
        SumCalculator sumCalculator1 = new SumCalculator(1, 50);
        SumCalculator sumCalculator2 = new SumCalculator(51, 100); 
        SumCalculator sumCalculator3 = new SumCalculator(1, 2000);  
        
    	//start timing for the thread
    	long startThreadTime = System.nanoTime();

        //Start both threads
       sumCalculator1.start();
       sumCalculator2.start();
       sumCalculator3.start();

        try {
           // Wait for both threads to finish using join() method of each thread.
        	sumCalculator1.join();
        	sumCalculator2.join();
        	sumCalculator3.join();
        } catch (InterruptedException e) {
            // Print the stack trace if an interruption occurs
            e.printStackTrace();
        }
        
        //creating a variable to get the time for execution 
        long endThreadTime = System.nanoTime();
        
        //creating a variable to get the time for execution 
        double finalThreadTime = (endThreadTime - startThreadTime) / 1_000_000.0; // convert to seconds 
        
       // Calculate the total sum by adding the sum of both ranges
        int totalThreadSum = sumCalculator1.getSum() + sumCalculator2.getSum() + sumCalculator3.getSum();
        
        
        
        
        //creating same process but without thread 
        
    	//start timing for the thread
    	long startTime = System.nanoTime();
    	
    	// Calculate the sum of the first range
        int sum1 = calculateSum(1, 50);
        
        // Calculate the sum of the second range
        int sum2 = calculateSum(51, 100);
        
        // Calculate the sum of the third range
        int sum3 = calculateSum(1, 2000);
        
        
        //creating a variable to get the time for execution 
        long endTime = System.nanoTime();
        
        //creating a variable to get the time for execution 
        double finalTime = (endTime - startTime) / 1_000_000.0; // convert to seconds 
        
        //getting result for the no thread method 
        int noThreadSum = sum1 + sum2 + sum3;
        
        
        
        
        // Print the results
        System.out.println("Sum calculated using thread (1 to 2000): " + totalThreadSum);
        System.out.println("Time taken for thread calculation: " + finalThreadTime + " miliseconds");
        System.out.println("Sum calculated without thread (1 to 2000): " + noThreadSum);
        System.out.println("Time taken for non-threaded calculation: " + finalTime + " miliseconds");
    }


    private static int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}