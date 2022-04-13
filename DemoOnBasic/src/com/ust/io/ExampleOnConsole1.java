package com.ust.io;
import java.io.Console;

public class ExampleOnConsole1 {
	public static void main(String arg[]){

		//get the Console class Object

		Console cobj =System.console();//factory method

		System.out.println("Enter the username :");
		String un = cobj.readLine();
		char[] p=cobj.readPassword();

		System.out.println("welcome "+un + ","+String.valueOf(p));

	}
}