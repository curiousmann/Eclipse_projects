package com.training.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ExampleOnCallingFunction2 {
	public static void main(String[] args) {

		//load or register the driver
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Define the connection url,username,password
			String url="jdbc:mysql://localhost:3306/ust";
			String uname="root";
			String pwd="root";
			
			//establish connection between java class and database
			
			Connection con=DriverManager.getConnection(url, uname, pwd);
			
			//creating callable statement object to call function
			
			String query="{ ?=call getDeptName(?)}";
			
			CallableStatement cstmt=con.prepareCall(query);
			
			//register the return value at position 1
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.setInt(2, 20);
			cstmt.execute();
			
			String name=cstmt.getString(1);
			System.out.println("Department Name at 20 : "+name);
			
			cstmt.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}
}