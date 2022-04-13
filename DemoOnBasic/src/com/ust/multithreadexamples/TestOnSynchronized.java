package com.ust.multithreadexamples;

public class TestOnSynchronized {

	public static void main(String[] args) {

		Display d=new Display();
		String un ="raju";
		ExampleOnSynchronized esyn=new ExampleOnSynchronized(d, un);
		esyn.start();
		
		
		String un1="ravi";
		ExampleOnSynchronized esyn1=new ExampleOnSynchronized(d, un1);
		esyn1.start();
	}

}
