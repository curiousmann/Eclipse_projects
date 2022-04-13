package com.ust.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ust.model.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao{
	
	@Autowired
	HibernateTemplate htobj;

	@Override
	public int save(Employee e) {
		
		return (Integer) htobj.save(e);
	}

	@Override
	public void update(Employee e) {
	
	    htobj.update(e);//based on id it will update	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Employee eobj = new Employee();
		eobj.setEmpId(id);
		
		htobj.delete(eobj); //it will delete based on Id
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee eobj=htobj.get(Employee.class,id);
		return eobj;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> li=htobj.loadAll(Employee.class);
		return li;
	}

}
