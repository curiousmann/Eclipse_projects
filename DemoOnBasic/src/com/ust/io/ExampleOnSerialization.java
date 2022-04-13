package com.ust.io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ExampleOnSerialization implements Serializable{

	int a;
	   
    int b;

   public void methodOne(){

    System.out.println("We are in method one of ExampleOnSerialization");

  }
	
}