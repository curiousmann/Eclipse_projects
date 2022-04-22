package com.training.mgdb;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeleteTheDocument {


	public static void main(String[] args) {
		
     //creating  a Mongo Cilent
		
	   MongoClient mgClient= new MongoClient("localhost",27017);
	   
	 //Accessing the Database
	    MongoDatabase dbObj=mgClient.getDatabase("mydb");

	   //get the collection - dept 
	   MongoCollection<Document> clt = dbObj.getCollection("dept");  
	   
	   clt.deleteOne(Filters.eq("deptno",30));
	   System.out.println("DEleted Successfully");
		mgClient.close();
	}
	

}
