package com.ust.java8examples;

public class ExampleOnMethodReference1 {

	public void myMethod() {
		System.out.println("we are in myMethod");
	}
	
	public static void main(String[] args) {
	
		ExampleOnMethodReference1 eom1 = new ExampleOnMethodReference1();
		                   
		//method reference using instance method
		MyInterface my1=eom1::myMethod;//refer the logic of the MyMethod
			
		//MyInterface m1=()->System.out.println("welcome to methodReference");
		//m1.display();
		
		my1.display();
		
	}
}
