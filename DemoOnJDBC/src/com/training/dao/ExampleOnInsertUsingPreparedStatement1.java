package com.training.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleOnInsertUsingPreparedStatement1 {
	
	public static void main(String[] args) {

		//load or register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//define the connection url for mysql database;
			String url="jdbc:mysql://localhost:3306/ust";
			String userName="root";
			String password="root";
			
			//establish the connection between the java class and database
			Connection con =DriverManager.getConnection(url,userName,password);
			
			//creating PreparedStatment Object using con
			String query="insert into customer values(?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1,8675);
			pstmt.setString(2,"venkat");
			pstmt.setString(3,"newyork");
			
			int iobj=pstmt.executeUpdate();
			
			if(iobj>0) {
				System.out.println("Record is inserted using PreparedStatement");
			}else {
				System.out.println("Record is not inserted");
			}
			
			pstmt.close();
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
