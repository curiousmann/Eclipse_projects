package com.ust.dao;

import java.util.List;

import com.ust.model.Employee;

public interface IEmpDao {
public int save(Employee e);
public void delete(int id);
public void update(Employee e);
public List<Employee> getAllEmployees();

}
