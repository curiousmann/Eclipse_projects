package com.ust.dao;

import java.util.List;

import com.ust.model.Employee;

public interface IEmployeeDao {

  public int save(Employee e);
  public void update(Employee e);
  public void delete(int id);
  public Employee getEmployeeById(int id);
  public List<Employee> getAllEmployees();
	
}
