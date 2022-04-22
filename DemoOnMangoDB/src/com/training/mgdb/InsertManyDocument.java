package com.training.mgdb;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertManyDocument {

	public static void main(String[] args) {
		
     //creating  a Mango Cilent
		
	   MongoClient mgClient= new MongoClient("localhost",27017);
	   
	 //Accessing the Database
	    MongoDatabase dbObj=mgClient.getDatabase("mydb");

	   //get the collection - dept 
	   MongoCollection<Document> clt = dbObj.getCollection("dept");
Document d1 = new Document("deptno",20);
	    d1.append("dname","sales");  //{deptno:10,dname:"resaerch",lcaotion:"boston"};
	    d1.append("location","newjersey");
	    
	    
	    Document d2 = new Document("deptno",30);
	    d2.append("dname","resources");  //{deptno:10,dname:"resaerch",lcaotion:"boston"};
	    d2.append("location","canada");
	    
	    Document d3 = new Document("deptno",40);
	    d3.append("dname","Accounting");  //{deptno:10,dname:"resaerch",lcaotion:"boston"};
	    d3.append("location","Uk");
	    
	    List<Document> li = new ArrayList<>();
	    
	    li.add(d1);
	    li.add(d2);
	    li.add(d3);
	    
	    
	    //inserting mutliple Documents
	    clt.insertMany(li);
	    

     		System.out.println("Multiple documents are  inserted Successfully");
     		mgClient.close();
	}
	

}