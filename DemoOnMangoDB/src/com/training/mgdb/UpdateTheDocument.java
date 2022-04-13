package com.training.mgdb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdateTheDocument {

	public static void main(String[] args) {
		
     //creating  a Mongo Cilent
		
	   MongoClient mgClient= new MongoClient("localhost",27017);
	   
	 //Accessing the Database
	    MongoDatabase dbObj=mgClient.getDatabase("mydb");

	   //get the collection - dept 
	   MongoCollection<Document> clt = dbObj.getCollection("dept");  
	   
	   clt.updateOne(Filters.eq("deptno",20),Updates.set("location","washington")); 
	   
	   System.out.println("Document is updated");
		
	}
	

}
