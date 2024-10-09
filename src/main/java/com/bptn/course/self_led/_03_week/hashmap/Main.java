package com.bptn.course.self_led._03_week.hashmap;

import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
        // Instantiate HashMap and try to use some of the methods listed above.

        Map<String, Integer> first = new HashMap<>();
        
        //adding key and values to first
        first.put("no1", 1);
        first.put("no2", 100);
        first.put("no3", 1000);
        first.put("no4", 10000);
        
        System.out.println(first);
        
        //removing a key and printing result
        first.remove("no3");
        
        System.out.println(first);
        
        //if statement to check for value
        if (first.containsValue(10000)) {
        	System.out.println("HAHAHAHAHAHAHAHHAHAHAHA");
        }
        else {
        	System.out.println("Not Here!!!!!");
        }
        
        //replacing a key
        first.replace("no1", 200);
        System.out.println(first);    }

}
