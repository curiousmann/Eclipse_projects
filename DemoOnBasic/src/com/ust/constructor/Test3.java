package com.ust.constructor;

public class Test3 extends ExampleOnSuper{
	int a=20;
	public Test3() {
		super("welcome");
		System.out.println("in defalt of test");
		
	}
	public Test3(String s) {
		this();
		System.out.println("in defalt of test2");
		
	}
	public void display() {
		System.out.println("in display of test");
	}

	public static void main(String[] args) {
	
		Test3 t3=new Test3();
		t3.a=20;

	}

}
