package com.bptn.course.junit_books;

public class Book {
	
	//Declaring title and price 
	private String title;
	private double price;
	
	//creating constructor 
	public Book (String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	//creating getter method for getTitle 
	public String getTitle() {
		return title;
	}
	
	//creating method for getBookInfo
	public String getBookInfo () {
		return title + "-" + price;
	}
}
