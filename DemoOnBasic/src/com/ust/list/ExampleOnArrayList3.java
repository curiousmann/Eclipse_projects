package com.ust.list;

import java.util.*;

public class ExampleOnArrayList3 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		 Employee e1 = new Employee(1001,"simth",3000);
		 Employee e2 = new Employee(1002,"laxmi",2000);
		 
		 al.add(e1);
		 al.add(e2);
		 al.add(new Employee(1003,"martin",2000));
		 
		 System.out.println("size of an arraylist : "+al.size());
		 
		 System.out.println("displaying the elements using iterator :");
		 Iterator<Employee> iobj= al.iterator();
		 
		 while(iobj.hasNext()) {
			  Employee eobj =iobj.next();
			  System.out.println(eobj.getEmpId()+" "+eobj.getEmpName()+" "+eobj.getEmpSal());
		 }
		 System.out.println("using foreach loop jdk 1.5");
		 for(Employee e: al) {
			 System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSal());
		 }
		 
		 System.out.println("using forEach lambda function jdk 1.8");
		 al.forEach((e)->System.out.println(e.getEmpId()+" "+e.getEmpName()+""+e.getEmpSal()));
		 
		 
		 
		


	}

}
