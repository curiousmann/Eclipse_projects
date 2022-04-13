package com.ust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ust.dao.IEmployeeDao;
import com.ust.model.Employee;

@Service("emloyeeService")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeDao edao; //has-a relation
	
	@Override
	@Transactional
	public int save(Employee e) {
		return edao.save(e);
	}

	
	@Override
	@Transactional
	public void update(Employee e) {
		// TODO Auto-generated method stub
		edao.update(e);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		edao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return edao.getEmployeeById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
	
		return edao.getAllEmployees();
	}

	
	
	
	
}
