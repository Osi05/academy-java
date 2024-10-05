package com.bptn.course.personal_learning;

public class Person {
    private String name;
    private String address;
    
    // Using setter to set name
    public void setName(String name){
      this.name = name;
    }
    // Using setter to get name
    public String getName(){
      return name;
    }
    
    // Using setter to get address
    public String getAddress(){
      return address;
    }
	// Using setter to set address
	public void setAddress(String address) {
		this.address = address;
	}
    
}
