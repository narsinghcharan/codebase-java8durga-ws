package com.myex.pj;

public class Employee {

	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) {
			return true;
		}
		
		if(obj instanceof Employee) {
			
			Employee emp = (Employee)obj;
			
			if(emp.name.equals(this.name) && emp.designation.equals(this.designation) && emp.city.equals(this.city) && (emp.salary==this.salary)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}
	
}
