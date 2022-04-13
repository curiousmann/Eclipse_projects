package com.ust.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

	static Connection con=null;
	
	public static Connection getDataBaseConnection() {
		
		try {
			FileReader fr = new FileReader("C:\\Users\\hp\\JavaFSD\\BookManagementSystem\\src\\db.properties");
		   
			Properties p= new Properties();
			
			p.load(fr);
			
			String drv=p.getProperty("driver");
			
			//load or register
			Class.forName(drv);
			
			//Define the Url,username and password		
		   String url=p.getProperty("url");
		   String un=p.getProperty("uname");
		   String pwd =p.getProperty("passd");
			
		   //establish the connection between java class  and Database
		   con=DriverManager.getConnection(url, un, pwd);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return con;
	}
	
	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
