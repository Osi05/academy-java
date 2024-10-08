package com.bptn.course._instructor_lead_and_knowledge_check._03_week.com.bptn.course._instructor_lead_and_knowledge_check._03_week._knowledge_check._arraylists;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        //Created ArrayList names
        ArrayList<String> names = new ArrayList<String>();

        //Initialized array friends
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
        
        /* using a for loop, I interated through array friends from the first
         to last index and added the result to the ArrayList names
        changed <= to < hence the code will be out of bounds 
        */
        for (int i = 0; i < friends.length; i++) {
            names.add(friends[i]);
        }
        //printed out names 
        System.out.println(names);
    }
}