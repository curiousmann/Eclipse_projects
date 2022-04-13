package com.ust.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleOnFileOutputStreamReader {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Exp\\simple.txt");
		FileOutputStream fo=new FileOutputStream(f);
		fo.write(100);
		fo.close();
		
	}
}
