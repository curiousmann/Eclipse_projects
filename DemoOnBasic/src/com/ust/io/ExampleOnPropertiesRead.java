package com.ust.io;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExampleOnPropertiesRead {

	public static void main(String[] args) throws IOException {
		
      FileReader fr = new FileReader("M:\\Repository\\JAVA\\java FSD\\DemoOnBasic\\src\\com\\ust\\io\\mysql.properties");	
		
		Properties p= new Properties();
		
		p.load(fr);//we are loading the db.properties into Properties class
      
      System.out.println("Reading values from properties file");
		
		String un=p.getProperty("username");
		String em= p.getProperty("url");
		String ad= p.getProperty("driver");
		
      System.out.println(un+"\n"+em+"\n"+ad);
      
      	
	}
	
	
	
}