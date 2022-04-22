package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUilts {

	static Connection con=null;
	
	public static Connection getConnectionForDatabase() {
		
		try {
			//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Define the url,username and Password
			String url="jdbc:mysql://localhost:3306/ust";
			String uname="root";
			String pwd="root";
			
			//establish the connection between Java Class and Database
			
		  con=DriverManager.getConnection(url,uname,pwd);	
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return con;
	}
	public static void closeDatabaseConnection() {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}