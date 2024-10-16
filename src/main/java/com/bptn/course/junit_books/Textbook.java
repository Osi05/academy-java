package com.bptn.course.junit_books;

public class Textbook extends Book {
	
	//creating private instance 
	private int edition;
	
	//creating constructor for Textbook
	public Textbook (String title, double price, int edition) {
		super(title, price);
		this.edition = edition;
	}
	
	//creating a method for getBookInfo
	public String getBookInfo() {
		
		return super.getBookInfo() + "-" + edition;
	}
	
	//creating a method for getEdition
	public int getEdition() {
		return edition;
	}
	
	//creating method for canSubstituteFor
	public boolean canSubstituteFor(Textbook other) {
		if (this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle())) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
