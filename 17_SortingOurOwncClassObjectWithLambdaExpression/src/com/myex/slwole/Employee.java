package com.myex.slwole;

public class Employee {

	private int empNo;
	private String ename;
	
	
	public Employee() {
		super();
	}
	public Employee(int empNo, String ename) {
		super();
		this.empNo = empNo;
		this.ename = ename;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + "]";
	}
	
}
