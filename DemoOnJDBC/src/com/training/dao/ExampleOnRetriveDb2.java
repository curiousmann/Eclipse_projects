package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleOnRetriveDb2{
	public static void main(String[] args) {
		//load or register the driver
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("In sakila/actor...enter the First name :");
			String fn=sc.next();
			
			System.out.println("enter the Last name :");
			String ln =sc.next();
			
			//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Define the connection url,username,password
			String url="jdbc:mysql://localhost:3306/sakila";
			String uname="root";
			String pwd="root";
			
			//Establish the connection between Java class and Database
			Connection con=DriverManager.getConnection(url, uname, pwd);
			//creating the Statement Object executing the select Query
			
			//Statement stmtObj=con.createStatement();
			
			String query="select actor_id,last_update from actor where first_name=? and last_name=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setString(1,fn);
			pstmt.setString(2,ln);
			
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				
			}
			
			pstmt.close();
			con.close();
			sc.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}