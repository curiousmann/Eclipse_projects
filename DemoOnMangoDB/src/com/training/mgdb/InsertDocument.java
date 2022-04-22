package com.training.mgdb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertDocument {

	public static void main(String[] args) {
		
     //creating  a Mango Cilent
	   MongoClient mgClient= new MongoClient("localhost",27017);
	   
	 //Accessing the Database
	    MongoDatabase dbObj=mgClient.getDatabase("mydb");
	    
	    //creating a collection
	    dbObj.createCollection("dept");
	    
	   //get the collection - dept 
	   MongoCollection<Document> clt = dbObj.getCollection("dept");  
	    
	    Document d = new Document("deptno",10);
	    d.append("dname","research");  //{deptno:10,dname:"resaerch",lcaotion:"boston"};
	    d.append("location","boston");
	    
	    //inserting onec document
	    
	    clt.insertOne(d);
	   
     		System.out.println("document inserted Successfully");
     		mgClient.close();
	}
	

}