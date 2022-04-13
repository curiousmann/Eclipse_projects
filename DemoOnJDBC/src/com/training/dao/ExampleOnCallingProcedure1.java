package com.training.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExampleOnCallingProcedure1 {
  	
	public static void main(String[] args) {
	   
		try { //load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Define the connection url,username,password
			String url="jdbc:mysql://localhost:3306/ust";
			String uname="root";
			String pwd="root";
			
			//establish connection between java class and database
			
			Connection con=DriverManager.getConnection(url, uname, pwd);
			
			//creating Object for callable statement to call a procedure
			
			String query="{call getEmpDetails(?)}";
			CallableStatement cstmt =con.prepareCall(query);
			cstmt.setInt(1,20);
			
			//call the execute() or executeQuery();
			
			ResultSet rs =cstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			cstmt.close();
			con.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	   
}
}