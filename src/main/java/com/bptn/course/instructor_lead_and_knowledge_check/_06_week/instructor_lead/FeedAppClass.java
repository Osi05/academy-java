package com.bptn.course.instructor_lead_and_knowledge_check._06_week.instructor_lead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {

	private static final String username = "postgres";
	private static final String password = "pg123";
	private static final String dbUrl = "jdbc:postgresql://localhost:5432/feedApp";
	
	
	
	public Connection createConnection() {
		Connection con = null;
		
		 try {
			con = DriverManager.getConnection(dbUrl, username, password);
			
			 System.out.println("Opened database successfully");
			
		} catch (SQLException e) {
			
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		 return con;
	}
	
	public void addUser(Connection con, String firstName, String lastName, String username, String phone,String emailId, String password, boolean emailVerified) {
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
		try {
			
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);
			
			int resultCount = stmt.executeUpdate();
			
			System.out.println(resultCount + " record(s) inserted");
			
			stmt.close();
		}
		catch (SQLException e) {
			System.out.println("Exception:" + e.getMessage());
			
		}
	}
	
	public boolean closeConnection(Connection con) {
		boolean flag = true;
		
		try {
			con.close();
		}
		catch (SQLException e) {
			flag = false;
			
			System.out.println("Exception: " + e.getMessage());
		}
		return flag;
	}
	
	
}
