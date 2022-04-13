package com.ust.java8examples;

public class ExampleOnJava8Interface implements Example1 {
	@Override
	public void methodOne() {
		System.out.println("we are in methodOne");		
	}

	public static void main(String[] args) {
		
		ExampleOnJava8Interface ejf = new ExampleOnJava8Interface();
		
		ejf.methodOne();
		
		//calling default methods from interface
		ejf.methodTree();
		String msg =ejf.getMessage();
		System.out.println(msg);
		
		//calling static method from interface
		Example1.methodTwo();
		Example1.display();
		
		
		//InterfaceName referecnceVariable = new IMplementationClassName();
		Example1 e1 = new ExampleOnJava8Interface();
		
		e1.methodOne();
		
		//calling default method;
		e1.methodTree();
		
		
		//calling static method from interface
				Example1.methodTwo();
				Example1.display();
	
	}

}
