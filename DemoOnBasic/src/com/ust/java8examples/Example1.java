package com.ust.java8examples;

public interface Example1 {
	float pi=3.142f;
	public void methodOne();
	
	default String getMessage() {
		return "welcome to java8";
	}
	
	static void methodTwo() {
		System.out.println("we are in static methodTwo of Example1 interface");
	}
	
	default void methodTree() {
		System.out.println("we are in methodThree of Example Interface");
	}
	
	static void display() {
		System.out.println("we are in display method of Example1 Interface");

}
}
