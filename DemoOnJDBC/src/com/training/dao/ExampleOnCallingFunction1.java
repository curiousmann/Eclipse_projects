package com.training.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ExampleOnCallingFunction1 {
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
			
			String query="{ ?=call fun_addition(?,?,?)}";
			
			CallableStatement cstmt=con.prepareCall(query);
			
			//register the return value at position 1
			
			cstmt.registerOutParameter(1,Types.INTEGER);
			//set the values at position 2,3,4 (int)
			cstmt.setInt(2,10);
			cstmt.setInt(3, 40);
			cstmt.setInt(4,30);
			
			//call the procedure
			cstmt.execute();
			
			//get the value from registerParamter at position 1
			
			int res=cstmt.getInt(1);
			
			System.out.println("calling a function sum of three numbers is : "+res);
			
			cstmt.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}
}