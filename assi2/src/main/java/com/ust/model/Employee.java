package com.ust.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab")
public class Employee {

	@Id
	@Column(name = "empno")
	private int empId;
	
	@Column(name = "ename",length = 20)
	private String empName;
	
	@Column(name = "sal")
	private float empSal;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public float getEmpSal() {
		return empSal;
	}


	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}


	
	  @Override
	  public String toString()
	  { return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]"; }
	 
	
	
	
	
}
