package com.ust.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOnBufferedWriter {
	public static void main(String args[]) throws IOException{

		FileWriter fw = new FileWriter("D:\\Exp\\sample.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		//write(int i);
		bw.write(100);
		bw.newLine();

		//write(String);
		bw.write("welcome to java");
		bw.newLine();

		//writer(char ch[]);
		char ch[] =  { 'a','b','c'};
		bw.write(ch);

		bw.flush();

		bw.close();

	}
}