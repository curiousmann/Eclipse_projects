package com.ust.java8examples;

public class ExampleOnLamda3 {

	public static void main(String[] args) {
		Ex3 e3=()->"welcome to java8";
		
		//Ex3 e3=()->{return "welcome to java8 lambda";};
		
		String mg =e3.getMessage();
		System.out.println(mg);
		
		Ex3.methodTwo();//static method
		
		e3.methodOne();//default method
		


	}

}
