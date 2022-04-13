package com.ust.multithreadexamples;

import java.util.Scanner;

public class TestOnInterThreadCommunication {
	public static void thanks() {
		char[] thxarr= {'T','h','a','n','k',' ','Y','o','u','.','.','.','V','i','s',
				'i','t',' ','A','g','a','i','n'};
		for (int i = 0; i < thxarr.length; i++) {
			try {
				System.out.print(thxarr[i]);
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		boolean is_wrong_option=true;
		int initial_option;

		Customer customerobject  = new Customer();
		Scanner scanner=new Scanner(System.in);

		System.out.println("\nAutomatic Teller Machine (ATM)\n==============================\n\n"
				+ "Enter an option :\n"
				+ "\nDeposit         ->  1\n"
				+ "Withdrawal      ->  2\n"
				+ "Balence Enquiry ->  3\n"
				+ "Exit            ->  4\n");

		while(is_wrong_option) {

			initial_option=scanner.nextInt();
			switch (initial_option) {
			case 1:
				ExampleOnDeposit Deposite_thread = new ExampleOnDeposit(customerobject);
				Deposite_thread.start();
				try {
					Deposite_thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				ExampleOnWithdrawal withdrowal_thread = new ExampleOnWithdrawal(customerobject);

				withdrowal_thread.start();
				
				while(withdrowal_thread.isAlive()&&customerobject.islow){
					try {
						Thread.sleep(1000);
						//System.out.println(withdrowal_thread.isAlive());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;

			case 3:
				System.out.println("Balance Available : "+ customerobject.amount);

				break;

			case 4:
				
				TestOnInterThreadCommunication.thanks();
				is_wrong_option=false;
				break;

			default:
				System.out.println("Wrong option...Try Again\n");
				System.out.println("Automatic Teller Machine (ATM)"
						+ "\n==============================\n\n"
						+ "Enter an option (0 for help)\n");
				break;
			}
		}
		scanner.close();

	}
}