package com.bptn.course.instructor_lead_and_knowledge_check._03_week.instructor_led.arraylist;

class Student {

	   private String name;
	   private String email;
	   private int id;

	   public Student(String initName, String initEmail, int initId) {
	      name = initName;
	      email = initEmail;
	      id = initId;
	   }

	   // toString() method
	   public String toString() {
	     return id + ": " + name + ", " + email;
	   }

	}