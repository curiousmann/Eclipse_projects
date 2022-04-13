package com.ust.multithreadexamples;

public class ExampleOnSynchronized extends Thread{

	Display d;	//has-a relation
	String un;
	public ExampleOnSynchronized(Display d, String un) {
		this.d = d;
		this.un = un;
	}
	
	@Override
	public void run() {
		d.wish(un);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
