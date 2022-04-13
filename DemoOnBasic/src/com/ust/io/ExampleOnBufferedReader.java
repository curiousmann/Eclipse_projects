package com.ust.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOnBufferedReader {

	public static void main(String args[]) throws IOException {

		FileReader fr = new FileReader("D:\\Exp\\temp.txt");

		BufferedReader br = new BufferedReader(fr);

		
		  String s = br.readLine(); //it will read first line from file
		  
		  //System.out.println("using readLine method");
		  while(s!=null) {
		  System.out.println(s); 
		  s=br.readLine(); 
		  }
		  br.close();
//		  System.out.println(" ");
//		  System.out.println(" ");
//		 
		/*
		 * System.out.println("using read method");
		 * 
		 * int i=br.read();
		 * 
		 * while(i!=-1) { System.out.print((char)i); i=br.read(); }
		 */
		
		
		
		

	}
}