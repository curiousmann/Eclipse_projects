package com.ust.exceptionexamples;
import java.util.Scanner;
public class TestOnUserDefined {
			 public void validate(int age) throws ExampleOnUserDefined {
				
				if(age<15) {
					throw new ExampleOnUserDefined("age should be greater than 15");
				}else {
					System.out.println("Valid Age");
				}}	
	public static void main(String[] args) {
		
				
				 Scanner sc = new Scanner(System.in);
				 System.out.println("enter the age : ");
				 int age=sc.nextInt();
				 sc.close();
				 TestOnUserDefined udemo= new TestOnUserDefined();
				 try {
					udemo.validate(age);
				} catch (ExampleOnUserDefined e) {
					
					System.err.println(e.getMessage());
				}
		

	}

}
