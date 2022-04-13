package com.ust.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ExampleOnPropertiesWrite {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("M:\\Repository\\JAVA\\java FSD\\DemoOnBasic\\src\\com\\ust\\io\\mysql.properties");
		
		Properties p = new Properties();
		
		//set the properties into properties object using setProperty(String key,String value)
		p.setProperty("username","root");
		p.setProperty("url", "jdbc:mysql://localhost:3306/");
		p.setProperty("driver","com.mysql.cj.jdbc.Driver");
		
		p.store(fw,"MySql Database Details");
		
		System.out.println("successfully created....!");
		
		fw.close();
		
	}
	
}
