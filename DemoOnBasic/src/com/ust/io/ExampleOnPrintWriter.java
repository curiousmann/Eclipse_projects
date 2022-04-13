package com.ust.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleOnPrintWriter {
	public static void main(String args[]) throws IOException{

		FileWriter fw = new FileWriter("D:\\Exp\\print_out.txt");
		PrintWriter pw  = new PrintWriter(fw);

		//write(int i);
		pw.write(100); //d 
		pw.write("\n");
		pw.write("welcome to java");
		
		pw.write("\n");
		
		pw.println(100); //100 

		pw.println("welcome to java");

		pw.println(120.0);

		pw.println(true);

		pw.flush();
		pw.close();

	}
}