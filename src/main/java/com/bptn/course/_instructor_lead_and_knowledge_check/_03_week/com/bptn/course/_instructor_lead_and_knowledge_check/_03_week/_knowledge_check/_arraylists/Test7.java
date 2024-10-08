package com.bptn.course._instructor_lead_and_knowledge_check._03_week.com.bptn.course._instructor_lead_and_knowledge_check._03_week._knowledge_check._arraylists;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {
    public static void removeLongStrings(ArrayList<String> list) {
        //code here
    	Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.length() > 4) {
                it.remove();  // Use iterator's remove method to avoid ConcurrentModificationException
            }
        }
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);
    }
}