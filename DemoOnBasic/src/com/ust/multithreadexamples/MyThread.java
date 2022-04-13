package com.ust.multithreadexamples;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("we are in child Thread");
		}

	}

}
