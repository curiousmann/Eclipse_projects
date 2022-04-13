package com.ust.list;

public class Employee {
	public Employee(int empId, String empName, float empSal) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSal = empSal;
	}
	private  int EmpId;
    private String EmpName;
    private  float EmpSal;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public float getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(float empSal) {
		EmpSal = empSal;
	}
}
