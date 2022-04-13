package com.ust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ust.dao.IEmpDao;
import com.ust.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmpDao edao; //has-a relation

	@Override
	@Transactional
	public int save(Employee e) {
		// TODO Auto-generated method stub
		return edao.save(e);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		edao.delete(id);
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return edao.getAllEmployees();
	}

	@Override
	@Transactional
	public void update(Employee e) {
		// TODO Auto-generated method stub
		edao.update(e);
	}

	

}
