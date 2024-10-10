package com.bptn.course.instructor_lead_and_knowledge_check._03_week.knowledge_check.thread;

public class MyThread extends Thread{

    int limitToStop;

    // Create a constructor to initialize the above instance variable
    public MyThread (int limitToStop) {
    	this.limitToStop = limitToStop;
    }

    // Override the run() method here.
    @Override
    public void run() {
    	
    	//creating a for loop from 0 to limitToStop
    	
    	for (int i = 0; i < limitToStop; i++) {
    		
    		//if statement to print only odd numbers
    		if (i % 2 != 0) {
    			System.out.println(i);
    		}
    		
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// prints out the StackTrace
				e.printStackTrace();
			}
    	}
    	 
    }
    
}