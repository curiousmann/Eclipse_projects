package com.ust.io;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleOnFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		try {
			fw = new FileWriter("D:\\Exp\\simple.txt");
			
			//write(int ch)
			fw.write(100);//d
			fw.write("\n");
			
			//write(char ch[]);
			char ch[]= {'a','b','c'};
			fw.write(ch);//abc
			fw.write("\n");
			
			//write(String s);
			fw.write("welcome to java");
			
			fw.flush();
			
			System.out.println("successfully written into the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			fw.close();
		}
		

	}

}
