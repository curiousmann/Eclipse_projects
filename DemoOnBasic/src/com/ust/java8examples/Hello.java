package com.ust.java8examples;

public class Hello {

	public Hello(String say) {
		System.out.println("welcome to java8 constructor Reference: "+say);
	}
	public static void main(String[] args) {
	Ex6 e6=Hello::new;	//Implementation for functional interface using constructor 
		
		e6.display("helloWorld");//
	}
}
