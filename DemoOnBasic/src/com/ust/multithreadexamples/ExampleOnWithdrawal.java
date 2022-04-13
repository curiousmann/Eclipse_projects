package com.ust.multithreadexamples;

import java.util.Scanner;

public class ExampleOnWithdrawal extends Thread{

	Customer c;

	Scanner scanner=new Scanner(System.in);
	
	public ExampleOnWithdrawal(Customer c){
		this.c=c;
	}
	
	@Override
	public void  run(){

		System.out.print("\nWithdrawal Amount : ");
		c.withdrawal(scanner.nextInt());

	}

}