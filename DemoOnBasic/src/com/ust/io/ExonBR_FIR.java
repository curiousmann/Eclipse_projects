package com.ust.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExonBR_FIR {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos =new FileOutputStream(new File("D:\\Exp\\simple.txt"));
		FileReader fis = new FileReader(new File("D:\\Exp\\Untitled.png"));
		
		int ini=fis.read();
		while(ini!=-1) {
			fos.write(ini);
			ini=fis.read();
		}
	}

}
