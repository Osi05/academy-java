package com.bptn.course.instructor_lead_and_knowledge_check._03_week.knowledge_check.thread;

public class Main {

    public static void main(String[] args) {

        // Create a variable from the MyThread class here.
        //creating instance of MyThread
    	MyThread newThread = new MyThread(20);

        // Start the thread here
        newThread.start();
    }

}