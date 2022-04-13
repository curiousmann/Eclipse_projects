package com.ui;
import java.util.Scanner;

import com.utility.EmployeeBO;
public class UserInterface {

	public UserInterface() {
		super();
	}

	public static void main(String[] args) {
		String tn,om;
		int i;
		EmployeeBO emp = new EmployeeBO();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add Employee Details\r\n"
				+ "2. Number of Official Email\n"
				+ "3. Exit\n\n"
				+ "Enter your choice");
		while((i=sc.nextInt())!=3) {
			if(i==1) {
				System.out.println("\nEnter the Team Name");
				tn=sc.next();
				System.out.println("\nEnter the official mail id");
				om=sc.next();
				emp.addEmployeeDetails(tn, om);
			}
			else if(i==2) {
				System.out.println("\nEnter the team Name to find number of official mail");
				System.out.println(emp.countOfOfficialMailIds(sc.next()));
			}
			else
				System.out.println("\nInvalied input\n");
			System.out.println("\n1. Add Employee Details\n"
					+ "2. Number of Official Email\n"
					+ "3. Exit\n\n"
					+ "Enter your choice");
		}
		sc.close();
		System.out.println("\nEnd");
		
	}

}
