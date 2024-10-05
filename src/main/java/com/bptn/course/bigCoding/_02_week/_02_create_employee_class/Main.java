package com.bptn.course.bigCoding._02_week._02_create_employee_class;

public class Main {
	   public static void main(String[] args) {
	       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
	       Employee student = new Employee(100, 8);
	       
	       // print the salary of the employee
	       System.out.println(student.getSalary());
	   }
	}