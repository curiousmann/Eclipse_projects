package com.ust.set;

import java.util.*;

public class ExampleOnHashMap1 {
//wAP to store heterogeneous keys and values
	
	public static void main(String[] args) {
		
		HashMap<Object,Object> hm= new HashMap<Object,Object>();
		//hm.put(key,value) --EntrySet
		hm.put("smith", 10);
		hm.put(101,"hello");
		hm.put(true,"hi");
		hm.put(10,10);
		hm.put(null,null);
		hm.put(10,10.0f);
		
		System.out.println("no of emlements are "+hm.size());
		System.out.println(hm);

		//Object get(Key) :- based on the Key(10)  get the value-hello .
		
		System.out.println("Getting value based on key(101) : "+hm.get(101));
//Object remove(key) ;- true
		hm.remove(true);
		System.out.println("after remove true key from hm : ");
		System.out.println(hm);
		
		//get the Only Keys
		  Set<Object> s= hm.keySet();
		
		System.out.println("the key are : "+s);
		 System.out.println("displaying Only the Keys :");
		   Iterator<Object> iobj = s.iterator();
		  while(iobj.hasNext()) {
			  System.out.println(iobj.next());
		  }
		 
		System.out.println("displaying only values");
		Collection<Object> cobj  =hm.values();
		 //converting values(cobj) collection to ArrayList;
		ArrayList<Object> al = new ArrayList<Object>(cobj);
		al.forEach((c)->System.out.println(c));
		
 System.out.println("displaying the elements using the iterator");
	     //get the entrySet()->(key,value)
		 Set<?> sobj= hm.entrySet();
		 Iterator<?> iobj1= sobj.iterator();
		 System.out.println(("Key value pairs are : "));
		 while(iobj1.hasNext()) {
			 @SuppressWarnings("rawtypes")
			Map.Entry me=(Map.Entry)iobj1.next();
			 System.out.println(me.getKey()+" "+me.getValue());
		 }
			  
	}
}

