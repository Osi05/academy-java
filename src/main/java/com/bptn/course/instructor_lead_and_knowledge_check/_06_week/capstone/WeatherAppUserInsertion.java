package com.bptn.course.instructor_lead_and_knowledge_check._06_week.capstone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class WeatherAppUserInsertion {
	private static final String username = "admin";
	private static final String password = "password";
	private static final String dbUrl = "jdbc:postgresql://academydb-c6-s1-t11-do-user-12484302-0.j.db.ondigitalocean.com:25060/weatherDB";
	// creating method createConnection
	public Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			// Establishing connection
			conn = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Opened database successfully");
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return conn;
	}
	// method addUser()
	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);
			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");
		} catch (SQLException ex) {
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
	}
	
	//method to close connection
	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		
		try {
			
			conn.close();
		}
		catch (SQLException e) {
			flag = false;
			// handle exception
	        System.out.println("Exception:" + e.getMessage());
		}
		return flag;
	}
}