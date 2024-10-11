package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.threads;

public class CountdownTimer implements Runnable {

    private int startValue;

    public CountdownTimer(int startValue) {

        // Assign the startValue parameter to the instance variable   
    	this.startValue = startValue;
    }
    
    @Override
    public void run() {
    
       // Complete the functionality of run() method. Complete Steps 2,3,4
    	for (int i = startValue; i >= 1; i--) {
    		System.out.println(i);
    		
    		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }


    // Define the main function
    public static void main(String[] args) {
        
        // Create a new CountdownTimer object with a start value of your choice. For instance: 10
    	CountdownTimer countObj = new CountdownTimer(10);
        

        // Create a new Thread object, passing the countdownTimer object as the Runnable target
    	Thread countThread = new Thread(countObj);
       

        // Start the thread by calling the start() method
    	countThread.start();
        
        
        System.out.println("Main thread continues to execute...");    
    }
}
