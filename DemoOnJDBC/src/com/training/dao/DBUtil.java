package com.training.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	static Connection con = null;

	public static Connection getConnectionForDatabase() {

		try {
			FileReader fr = new FileReader("db.properties");

			Properties p = new Properties();

			p.load(fr);

			String drv = p.getProperty("driver");

			// load or register the driver
			Class.forName(drv);

			// Define the url,username and Password
			String url = p.getProperty("url");
			String uname = p.getProperty("uname");
			String pwd = p.getProperty("passd");

			// establish the connection between Java Class and Database
			con = DriverManager.getConnection(url, uname, pwd);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void closeDatabaseConnection() {

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}