package com.bptn.course._instructor_lead_and_knowledge_check._03_week.instructor_lead.arraylist;

import java.util.*;

public class StudentList {
   // main method for testing
   public static void main(String[] args) {
      ArrayList<Student> roster = new ArrayList<Student>();
      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
     
      
      // add your code here
      //adding a new student to roster
      roster.add(new Student("Ayanna", "ayanna@gmail.com", 789012));

      System.out.println(roster);
   }
 }