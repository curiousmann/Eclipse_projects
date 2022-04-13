package com.ust.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ust.model.Employee;
@Repository
public class EmpDaoImpl implements IEmpDao{
	@Autowired
	HibernateTemplate htobj;

	@Override
	public int save(Employee e) {
		// TODO Auto-generated method stub
		return (Integer) htobj.save(e);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Employee eobj = new Employee();
		eobj.setEmpId(id);
		
		htobj.delete(eobj); //it will delete based on Id
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> li=htobj.loadAll(Employee.class);
		return li;
	}

	@Override
	public void update(Employee e) {
		// TODO Auto-generated method stub
		htobj.update(e);
	}

	
}
