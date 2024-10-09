package com.bptn.course.self_led;


//How can we make the Student class inherit from class Person?
//uses the extends so class Student can Extend Person 
public class Student extends Person {
 private int id;
 private int gpa;


 // Using getter to get name
 public String getName(String name){
   return name;
 }
 // Using getter to get address
 public String getAddress(String address){
   return address;
 }
 
//Using getter to get gpa 
 public int getGpa() {
		return gpa;
	}
//Using setter to set gpa
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	// Using getter to get id
	public int getId() {
		return id;
	}
	// Using setter  to set id 
	public void setId(int id) {
		this.id = id;
	}


 
public static void main(String[] args) {
     Student s = new Student();
     System.out.println(s instanceof Student);
     System.out.println(s instanceof Person);
     System.out.println(s);
 }
}