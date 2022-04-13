package com.ust.service;

import java.util.List;

import com.ust.model.Employee;

public interface IEmployeeService {
	public int save(Employee e);
	public void delete(int id);
	public void update(Employee e);
	public List<Employee> getAllEmployees();
	
}
