package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.arraylist;

import java.util.*;  // import all classes in this package.
//correct class name
public class ListGetSet {
	
   public static void main(String[] args) {
      ArrayList<String> nameList = new ArrayList<String>();
      nameList.add("Diego");
      nameList.add("Grace");
      nameList.add("Deja");
      System.out.println(nameList);

      // add code here
      //Getting the last element 
      
      System.out.println(nameList.get(2));
      
      
      //setting the first name to my name
      nameList.set(0, "Callistus");
      
      //print list
      System.out.println(nameList);
   }
}