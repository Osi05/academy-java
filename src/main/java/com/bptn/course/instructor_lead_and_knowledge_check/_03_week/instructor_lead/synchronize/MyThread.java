package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.synchronize;

public class MyThread extends Thread {
    
    SynchronizedPrinter printer;

    // Create a constructor to initialize the printer instance variable.
    public MyThread(SynchronizedPrinter printer) {
    	this.printer = printer;
    }


    // Override the run() method to call printNumbers() method of the printer instance variable.
    @Override
    public void run() {
    	printer.printNumbers();
    }
}