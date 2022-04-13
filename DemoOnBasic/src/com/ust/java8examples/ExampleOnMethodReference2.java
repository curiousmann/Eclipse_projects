package com.ust.java8examples;

public class ExampleOnMethodReference2 {

	public static void myMethod() {
		System.out.println("we are in static method Of mYmethod");
	}
	
	public static void main(String[] args) {
		
		//static method reference using ClassName
		Ex4 e4 =ExampleOnMethodReference2::myMethod;
		
		e4.methodOne();
		
	}
	

}
