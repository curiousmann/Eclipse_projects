package com.ust.multithreadexamples;

public class Customer {

	int amount=0;
	boolean islow=true;

	public synchronized void withdrawal(int amount){
		if(this.amount<amount){
			this.islow=false;
			System.out.print("\ninsufficient Balence...\n"
					+ "Customer has to wait untill deposit the amount"
					+ "\n\nEnter an option :");

			try {

				wait();
				this.islow=true;
				System.out.print("\nInitiating pending Withdrawal...\nPlease Wait");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
		this.amount=this.amount-amount;

		System.out.println("\nWithdrawal Successfull...\n"
				+ "Balance amount is "+this.amount
				+"\n\nEnter an option :\n");

	}

	public synchronized void deposit(int amount){
		
		
		try {
			Thread.sleep(1000);
			System.out.print("\nChecking Pending Withdrawals...\nPlease Wait");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	



		this.amount= this.amount+amount;

		System.out.println("\n\nAmount is depostied"+"\n\nEnter an option :\n");        

		notify();
	}
}