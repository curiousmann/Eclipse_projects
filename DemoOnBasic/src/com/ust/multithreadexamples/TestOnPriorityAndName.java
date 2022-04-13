package com.ust.multithreadexamples;

public class TestOnPriorityAndName {

	public static void main(String[] args) {//main thread
				
		System.out.println("we are in main Thread");
		
		ExampleOnThreadPriorityAndName etpn= new ExampleOnThreadPriorityAndName();
		etpn.start();//t1
		
		ExampleOnThreadPriorityAndName etpn1=new ExampleOnThreadPriorityAndName();
		etpn1.start();//t2
		
		System.out.println("Displaying the main Thread default name and priority");
		Thread t= Thread.currentThread();
		System.out.println(Thread.currentThread());
		System.out.println("Main Thread Name is :"+t.getName());
		System.out.println("Main Thread default priority :"+t.getPriority());
		
		System.out.println("First ChildThread");
		System.out.println("First ChildThread Name(etpn) is :"+etpn.getName());
		System.out.println("First ChildThread Priority(etpn) is : "+etpn.getPriority());
		
		System.out.println("Secon Thread");
		System.out.println("seconddThread Name(etpn1 is :"+etpn1.getName());
		System.out.println("seconddThread Priority(etpn1 is : "+etpn1.getPriority()); }}