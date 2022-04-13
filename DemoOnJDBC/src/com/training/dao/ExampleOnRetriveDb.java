package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnRetriveDb{
	public static void main(String[] args) {
		//load or register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Define the connection url,username,password
			String url="jdbc:mysql://localhost:3306/ust";
			String uname="root";
			String pwd="root";
			
			//Establish the connection between Java class and Database
			Connection con=DriverManager.getConnection(url, uname, pwd);
					
			//creating the Statement Object executing the select Query
			Statement stmtObj=con.createStatement();	
			String query="select * from dept";
			ResultSet rs=stmtObj.executeQuery(query);
			
			while(rs.next()) {
				//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
				//System.out.println(rs.getInt("deptno")+" "+rs.getString("dname")+" "+rs.getString("loc"));
				
			  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			//close the objects
			stmtObj.close();
			con.close();
					
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}