package com.bptn.course.self_led._setters_getters;

class Student {
	private String name;
	private String studentId;
	private int classId;
	private int age;
	
	
	Student(String name, String studentId, int classId, int age) {
		this.name = name;
		this.studentId = studentId;
		this.classId = classId;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public int classId() {
		return classId;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName (String name) {
		 this.name = name;
	}
	
	public void setStudentId (String studentId) {
		this.studentId = studentId;
	}
	
	public void setClassId (int classId) {
		this.classId = classId;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
}
