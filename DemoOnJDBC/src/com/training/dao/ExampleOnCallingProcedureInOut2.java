package com.training.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ExampleOnCallingProcedureInOut2 {

	public static void main(String[] args) {

		// load or register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Define the connection url,username,password
			String url = "jdbc:mysql://localhost:3306/ust";
			String uname = "root";
			String pwd = "root";

			// establish connection between java class and database

			Connection con = DriverManager.getConnection(url, uname, pwd);

			// creating a Callable statement Object to call a procedure

			String query = "{call getMaxSal(?,?)}";

			CallableStatement cstmt = con.prepareCall(query);

			// setting the positional parameter 1
			cstmt.setInt(1, 20);
			// registering the out parameter value at position 2

			cstmt.registerOutParameter(2, Types.INTEGER);

			// call the procedure

			cstmt.execute();

			// get the registerParameter output at Position 2
			int maxSal = cstmt.getInt(2);
			System.out.println("MaxSal from Deptno 20 is : " + maxSal);

			cstmt.close();
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