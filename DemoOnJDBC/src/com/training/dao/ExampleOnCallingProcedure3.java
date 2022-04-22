package com.training.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class ExampleOnCallingProcedure3 {

	public static void main(String[] args) {

		// load or register the driver
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first value : ");
			int n1=sc.nextInt();
			System.out.println("enter the second value : ");
			int n2=sc.nextInt();
			sc.close();
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Define the connection url,username,password
			String url = "jdbc:mysql://localhost:3306/ust";
			String uname = "root";
			String pwd = "root";

			// establish connection between java class and database

			Connection con = DriverManager.getConnection(url, uname, pwd);

			// creating a Callable statement Object to call a procedure

			String query = "{call addition(?,?,?)}";

			CallableStatement cstmt = con.prepareCall(query);

			// setting the positional parameter 1
			cstmt.setInt(1, n1);
			cstmt.setInt(2, n2);
			// registering the out parameter value at position 2

			cstmt.registerOutParameter(3, Types.INTEGER);

			// call the procedure

			cstmt.execute();

			// get the registerParameter output at Position 3
			int sum = cstmt.getInt(3);
			System.out.println("Sum of two numbers is : " + sum);

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