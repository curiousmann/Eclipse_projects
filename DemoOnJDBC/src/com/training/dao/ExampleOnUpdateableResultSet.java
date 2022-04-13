package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnUpdateableResultSet {

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
			
			Statement stmtObj=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
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
			rs.absolute(3);
			System.out.println(" ");
			System.out.println("Random record at 3");
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			
			/*
			 * //insert a record rs.moveToInsertRow(); rs.updateInt(1,50);
			 * rs.updateString(2,"testing"); rs.updateString(3,"kerala"); rs.insertRow();
			 */
			
			/*
			 * //updating record rs.absolute(3); rs.updateString(2,"Marketing");
			 * rs.updateString(3,"viriginia"); rs.updateRow();
			 */
			/*
			 * //deleteing a record at row 4 rs.absolute(4); rs.deleteRow();
			 */
			//close the objects
			stmtObj.close();
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