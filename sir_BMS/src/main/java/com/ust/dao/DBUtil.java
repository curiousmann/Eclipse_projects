package com.ust.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
static Connection con = null;
	
	public static Connection getMySqlDatabaseConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url ="jdbc:mysql://localhost:3306/Bookstore";
		String user = "root";
		String password = "root";
		
		con = DriverManager.getConnection(url,user,password);
	
		return con;

}
}
