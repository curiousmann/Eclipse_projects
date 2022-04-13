package com.ust.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.config.JavaConfig;
import com.ust.model.Employee;
import com.ust.service.IEmployeeService;

public class Test {

  public static void main(String[] args) {
	
	  ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	  
	  IEmployeeService  iesobj=(IEmployeeService)context.getBean("emloyeeService");
	  
		
		  //insert 
			
//			  Employee e= new Employee(); e.setEmpId(1223); e.setEmpName("sam");
//			  e.setEmpSal(5000);
//			  
//			  int iobj= iesobj.save(e);
//			  System.out.println("Record inserted successfully "+iobj);
//			 

	  
	  //update
	  //update empid 1223 ename to john,sal to 5000
	  
		/*
		 * Employee e= new Employee(); e.setEmpId(1223); e.setEmpName("john");
		 * e.setEmpSal(8000);
		 * 
		 * iesobj.update(e);
		 * 
		 * System.out.println("Record is updated ..!");
		 * 
		 */
	  //deleted this record based on id 1211
//	  
		/*
		 * iesobj.delete(1211); System.out.println("deleted the record");
		 */
	  
	  //search an employee record based on id 1212
		
		/*
		 * Employee eobj=iesobj.getEmployeeById(1211);
		 * 
		 * if(eobj!=null) {
		 * System.out.println(eobj.getEmpId()+" "+eobj.getEmpName()+" "+eobj.getEmpSal()
		 * ); }else { System.out.println("based on id record doesnot exits"); }
		 * 
		 */
	  
	  //list all the records 
	  
		
		  List<Employee> liobj= iesobj.getAllEmployees();
		  
		  System.out.println("Employee Details are : ");
		  liobj.forEach(eobj->System.out.println(eobj.getEmpId()+" "+eobj.getEmpName()
		  +" "+eobj.getEmpSal()));
		 
}
}