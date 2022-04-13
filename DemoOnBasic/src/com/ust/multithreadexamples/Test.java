package com.ust.multithreadexamples;

public class Test {
	// single Threaded Model
	public static void main(String[] args) {

		System.out.println("helloworld");
		System.out.println("hi");
		System.out.println("hello");

		Thread t = Thread.currentThread();// factory method
		System.out.println(t);
		System.out.println("current Thread name is : " + t.getName());// it will return thread name
		System.out.println("thread priority: " + t.getPriority());

	}

}
