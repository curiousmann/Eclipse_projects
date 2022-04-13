package com.ust.multithreadexamples;

public class Display {

	public synchronized void wish(String name) {

		for (int i = 1; i < 5; i++) {
			System.out.println("Welcome to java by "+name);
		}
	}
}
