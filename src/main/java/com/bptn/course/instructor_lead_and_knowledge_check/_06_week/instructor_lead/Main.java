package com.bptn.course.instructor_lead_and_knowledge_check._06_week.instructor_lead;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		StudentAppClass jdbc = new StudentAppClass();
		Connection con = jdbc.createConnection();
		jdbc.getAllStudents(con);
		jdbc.closeConnection(con);

	}

}
