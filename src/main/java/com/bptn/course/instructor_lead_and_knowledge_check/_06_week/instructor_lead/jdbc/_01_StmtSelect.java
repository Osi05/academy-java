package com.bptn.course.instructor_lead_and_knowledge_check._06_week.instructor_lead.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bptn.course.instructor_lead_and_knowledge_check._06_week.instructor_lead.jdbc.bean.Student;

public class _01_StmtSelect {
	
	public static void main(String[] args) {

		String dbURL = "jdbc:postgresql://localhost:5432/bptn";
		String dbUsername = "postgres";
		String dbPassword = "pg123";
		
		List<Student> students = new ArrayList<>();
		
//		String sql = "SELECT * FROM students ORDER BY \"studentName\"";
		
		String sql = "SELECT * FROM students ORDER BY \"studentId\"";
		
		try(Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			
//			System.out.println("Connection successful");
			while (rs.next()) {
				int studentId = rs.getInt("studentId");
//				System.out.println("Student is is: " + studentId);
				
				int courseId = rs.getInt("courseId");
				String studentName = rs.getString("studentName");
				String studentEmail = rs.getString("studentEmail");
				String studentPhone = rs.getString("studentPhone");
				
				
				Student student = new Student();
				
				student.setStudentId(studentId);
				student.setCourseId(courseId);
				student.setStudentName(studentName);
				student.setStudentEmail(studentEmail);
				student.setStudentPhone(studentPhone);
				
				students.add(student);
			}
			
			students.forEach(System.out::println);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	}
	
}



