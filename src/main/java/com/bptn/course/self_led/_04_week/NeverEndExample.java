package com.bptn.course.self_led._04_week;

public class NeverEndExample {

	static void neverEnd(int num) {
		neverEnd(num+1);
		
		System.out.println("This is the method that never ends, num = " + num);
		
//		if (num == 10000) {
//			System.out.println("Bye");
//		}
//		else {
//			neverEnd(num+1);
//		}
	}
	
	public static void main (String[] args) {
		
		neverEnd(0);
	}
}
