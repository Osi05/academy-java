package com.bptn.course.self_led._03_week.thread;

public class MultiThreadRunnable implements Runnable {

	//initializing a variable
	
	int runNumber;
	
	//creating a constructor
	
	public MultiThreadRunnable (int runNumber) {
		this.runNumber = runNumber;
	}
	
	//overriding the run 
	@Override
	public void run() {
		for (int i = 1; i <=6; i++) {
			System.out.println(i + " and the runnable is: " + runNumber);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
