package com.ust.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException {


		ExampleOnSerialization et = new ExampleOnSerialization();

		FileOutputStream fos = new FileOutputStream("D:\\Exp\\file.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(et);//this method is convert the class object into file.

		oos.close();
		fos.close();
		System.out.println("Serailization Completed");


	}
}