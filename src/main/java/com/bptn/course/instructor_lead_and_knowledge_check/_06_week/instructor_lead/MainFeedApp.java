package com.bptn.course.instructor_lead_and_knowledge_check._06_week.instructor_lead;

import java.sql.Connection;

public class MainFeedApp {

	public static void main(String[] args) {
		
		FeedAppClass jdbc = new FeedAppClass();
		Connection con = jdbc.createConnection();
		
		
		//calling the addUser method 
		jdbc.addUser(con, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		
		//closing connection
		jdbc.closeConnection(con);
	}

}
