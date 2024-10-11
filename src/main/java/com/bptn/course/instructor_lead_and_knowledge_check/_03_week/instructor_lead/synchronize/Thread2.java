package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.synchronize;

public class Thread2 extends Thread {
    
    SynchronizedPrinter obj;
    
    // Create a constructor to initialize the above instance variable
    public void SynchronizedPrinter(SynchronizedPrinter obj) {
    	this.obj = obj;
    }
    
    // Override the run() method here to call printNumbers()
    @Override
    public void run() {
    	obj.printNumbers();
    }
    
}