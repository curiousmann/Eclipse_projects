package com.training.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnUpdateableResultSet2UsingExt {

	public static void main(String[] args) {

		try {

			Connection con = DBUilts.getConnectionForDatabase();
			Statement stmtObj = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			String query = "select * from dept";

			ResultSet rs = stmtObj.executeQuery(query); // scroll-able result set

			System.out.println("Department Details in Forword direction : ");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

			}

			System.out.println("");
			System.out.println("Department Details in backword  direction : ");
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

			}

			// place cursor at first record
			rs.first();
			System.out.println("");
			System.out.println("at first record");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			// place the cursor at last

			rs.last();
			System.out.println("");
			System.out.println("at last record");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

			// random record
			rs.absolute(1);
			System.out.println(" ");
			System.out.println("Random record at 3");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

			
			  //insert a record 
			rs.moveToInsertRow();
			rs.updateInt(1,51);
			rs.updateString(2,"testing");
			rs.updateInt(3,1000); 
			rs.insertRow();
			 

			
			  //updating record 
			rs.absolute(3); 
			rs.updateString(2,"Marketing");
			  rs.updateInt(3,200); 
			  rs.updateRow();
			 
			
//			  Deleting a record at row 4 
			  rs.absolute(2); 
			  rs.deleteRow();
			 
			// close the objects
			stmtObj.close();
			DBUilts.closeDatabaseConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}