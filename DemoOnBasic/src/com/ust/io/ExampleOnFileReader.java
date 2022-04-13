package com.ust.io;


import java.io.FileReader;
import java.io.IOException;

public class ExampleOnFileReader{

   public static void main(String args[]) throws IOException{

   FileReader fr  = new FileReader("D:\\Exp\\temp.txt");

  //it will get the first character from file
 int i = fr.read();

 while(i!=-1){
  System.out.print((char)i);

    i= fr.read();

}
fr.close();
}
}