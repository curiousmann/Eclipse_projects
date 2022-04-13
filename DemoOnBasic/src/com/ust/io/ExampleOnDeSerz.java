package com.ust.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExampleOnDeSerz {

	public static void main(String args[]) throws IOException, ClassNotFoundException{

	     FileInputStream fis = new FileInputStream("D:\\Exp\\file.ser");
	     ObjectInputStream ois = new ObjectInputStream(fis);

	     Object o = ois.readObject();//this method is responsible to  covert file into an object

	    //converting super class object(o) into sub class(corresponding class)
	      ExampleOnSerialization eos =(ExampleOnSerialization) o;

	       System.out.println(eos.a);
	       System.out.println(eos.b);

	        eos.methodOne();   

	        ois.close();

	        }
}