package com.ust.java8examples;
public class ExampleOnConstructorReference1 {

	public static void main(String[] args) {
		
		Ex6 e6=Hello::new;//it will refer or call the Parameterized Constructor of Hello Class.
		
		e6.display("helloWorld");//
		
	}
	
}
