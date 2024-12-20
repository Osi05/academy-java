package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.synchronize;

public class Main {
    
    public static void main(String[] args) {
        
        SynchronizedPrinter printer = new SynchronizedPrinter();

        // use same printer object in both threads
        MyThread t1 = new MyThread(printer);
        MyThread t2 = new MyThread(printer);

        //start the threads t1 and t2
        System.out.println("Start thread1");
        t1.start();
        System.out.println("Start thread2");
        t2.start();
        
    }    
}
