package com.bptn.course.self_led._03_week.thread;

public class MultiThreadSample extends Thread {
	
	int multiNumber;
	
	//creating constructor for MultiThreadSample
	public MultiThreadSample (int multiNumber) {
		this.multiNumber = multiNumber;
	}
	
	
	//overriding the run method
	@Override
	public void run() {
		//for loop from 0 to 30
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " belongs to thread: " + multiNumber);		
			
		//using thread method sleep
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
