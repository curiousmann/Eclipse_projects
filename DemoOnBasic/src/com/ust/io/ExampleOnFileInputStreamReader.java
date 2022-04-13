package com.ust.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ExampleOnFileInputStreamReader {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Exp\\simple.txt");
		FileInputStream fi=new FileInputStream(f);
		int n=fi.read();
		System.out.println(n);
		fi.close();
		
	}
}
