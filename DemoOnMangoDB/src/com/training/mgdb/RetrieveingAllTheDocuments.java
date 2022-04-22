package com.training.mgdb;

import java.util.Iterator;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class RetrieveingAllTheDocuments {

	public static void main(String[] args) {
		
     //creating  a Mango Cilent
		
	   MongoClient mgClient= new MongoClient("localhost",27017);
	   
	 //Accessing the Database
	    MongoDatabase dbObj=mgClient.getDatabase("mydb");

	   //get the collection - dept 
	   MongoCollection<Document> clt = dbObj.getCollection("dept");  
	    
	    FindIterable<Document> fi=clt.find();//
	  
	    System.out.println("Displaying all the Documents from the dept Collection");
        Iterator<Document> iobj= fi.iterator();      
     		
	    while(iobj.hasNext()) {
	    	System.out.println(iobj.next());
	    }
	    
	    mgClient.close();
	}
	

}
