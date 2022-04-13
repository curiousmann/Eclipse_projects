package com.ust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.Employee;
import com.ust.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@Autowired 
	IEmployeeService emps; //has-a relation
	
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee emp) {
		int id=emps.save(emp);
		return "employee id "+id+" inserted sucessfully";
	}
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {
	emps.update(emp);	
	return "updated"+emp.getEmpId()+"sucessfully";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		emps.delete(id);
		return "employee id " +id+" deleted sucessfully";
		}
	@GetMapping("/list")
	public List<Employee> ListAllEmployeeRecords(){
	List<Employee>li=	emps.getAllEmployees();
	return li;
	}
}
