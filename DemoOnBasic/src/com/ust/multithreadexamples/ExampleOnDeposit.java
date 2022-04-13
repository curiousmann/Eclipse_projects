package com.ust.multithreadexamples;

import java.util.Scanner;

public class ExampleOnDeposit  extends Thread{
	Customer c;

	Scanner scanner=new Scanner(System.in);
	
	public ExampleOnDeposit(Customer c){
		this.c=c;
	}

	@Override
	public void run(){
		System.out.print("\nDeposit Amount : ");
		
		c.deposit(scanner.nextInt());
	}
}