package com.bptn.course.self_led._03_week.thread;

public class MultiThread {

    public static void main(String[] args) {
	
	//creating an object of MultiThreadSample
//	MultiThreadSample object = new MultiThreadSample(1);
//	
//	//using start to run our object
//	object.start();
//	
	//using for loop to create multiThread
//	for (int i = 0; i <= 5; i++) {
//		MultiThreadSample loopObj = new MultiThreadSample(i);
//		loopObj.start();
//	}
	
	//using for loop for runnable
	for (int m = 1; m <=6; m++) {
		MultiThreadRunnable newObj = new MultiThreadRunnable(m);
		
		//create thread obj
		Thread newThread = new Thread(newObj);	
		
		//start
		newThread.start();	
		
		try {
			newThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

}