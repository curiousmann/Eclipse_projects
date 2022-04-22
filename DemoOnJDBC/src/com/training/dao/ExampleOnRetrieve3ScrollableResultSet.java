package com.training.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnRetrieve3ScrollableResultSet {

	public static void main(String[] args) {
		
		try {
			//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Define the connection url,username,password
			String url="jdbc:mysql://localhost:3306/ust";
			String uname="root";
			String pwd="root";
			
			//Establish the connection between Java class and Database
			Connection con=DriverManager.getConnection(url, uname, pwd);
			
			//creating the Statement Object executing the select Query
			Statement stmtObj=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			String query="select * from dept";
			
			ResultSet rs=stmtObj.executeQuery(query); //scrollable result set
			
			System.out.println("Department Details in Forword direction : ");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	
			}
			
			System.out.println("");
			System.out.println("Department Details in backword  direction : ");
			while(rs.previous()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	
			}
			
			//place cursor at first record
			rs.first();
			System.out.println("");
			System.out.println("at first record");
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			//place the cursor at last
			
			rs.last();
			System.out.println("");
			System.out.println("at last record");
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			
			//random record
			rs.absolute(1);
			System.out.println(" ");
			System.out.println("Random record at 3");
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
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