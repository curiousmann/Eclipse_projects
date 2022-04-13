package com.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ust.config.JavaConfig;
import com.ust.model.Employee;
import com.ust.service.IEmployeeService;

@Controller
@RequestMapping("/ec")
public class EmployeeController {
	@Autowired
	IEmployeeService empObj;
	
@RequestMapping("/show")	
		public String getPage() {
			 return "Employee";
	 
		
	}


@RequestMapping(value ="/store",method =RequestMethod.POST)
public ModelAndView getEmpDetails(@ModelAttribute Employee e) {
	  
   ModelAndView mv = new ModelAndView();
	
	mv.addObject("empObj",e);
	mv.setViewName("success");
	empObj.save(e);
	
	return mv;
}


	    
}
