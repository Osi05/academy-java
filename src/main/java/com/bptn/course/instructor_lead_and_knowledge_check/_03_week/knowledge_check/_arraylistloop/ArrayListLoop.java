package com.bptn.course.instructor_lead_and_knowledge_check._03_week.knowledge_check._arraylistloop;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i < 5; i++) {
            arr.add(i);
            System.out.println(arr); // added more print statements
        }
        for(int i=0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("Removing element " + i + " : " + arr.get(i));
                arr.remove(i);
                System.out.println(arr); // added more print statements
            }
        }
        System.out.println(arr);
    }
}