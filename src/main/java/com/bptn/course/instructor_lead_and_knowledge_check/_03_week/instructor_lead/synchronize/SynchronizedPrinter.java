package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_lead.synchronize;

public class SynchronizedPrinter {
    
    public void printNumbers() {
        
    	//synchronize instance 
    	
            synchronized(this) {
            	System.out.println("Inside of the synchronized block.");
            	
            	//for loop to print number up to 5 
                for( int i = 1 ; i <= 5 ; i++ ) { 
                    System.out.println(i);
                    try {
                        Thread.sleep(500); //simulate delay
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
			}

        
    }
}


