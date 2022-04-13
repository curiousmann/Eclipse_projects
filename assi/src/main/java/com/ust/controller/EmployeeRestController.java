package com.ust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ust.model.Employee;

import com.ust.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@Autowired
	IEmployeeService empserobj;
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee emp) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("empserobj", emp);
		int id = empserobj.addEmployee(emp);
		mv.addObject("empserobj",emp);
	
		empserobj.save(emp);
		
		return "student Id"+id+"insert into hash map";

	
	

	
	
	}
	    
}