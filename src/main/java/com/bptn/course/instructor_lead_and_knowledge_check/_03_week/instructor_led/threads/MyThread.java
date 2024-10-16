package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.threads;

import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {

	//declaring variable
	List<Integer> list;
	
    // Create a constructor to initialize the above instance variable
    public MyThread(String name, List<Integer> list) {
		//invoking the Super class
		super(name);
		
		//initializing variable list
		this.list = list;
    }
    
	//overriding the run() method
	@Override
	public void run() {
		
		//invoke the insertNextId() static method of the ListUtils class
		
		ListUtils.insertNextId(list);
		
	}
}
