package com.ust.multithreadexamples;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread t = new MyThread();

		t.start();// internally jvm will execute your thread class run() method.

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread or parent child");
		}

	}

}
