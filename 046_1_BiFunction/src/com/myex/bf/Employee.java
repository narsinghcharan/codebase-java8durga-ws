package com.myex.bf;

public class Employee {

	int eno;
	String name;
	double dailyWages;

	public Employee(int eno, String name, double dailyWages) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailyWages = dailyWages;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyWages() {
		return dailyWages;
	}

	public void setDailyWages(double dailyWages) {
		this.dailyWages = dailyWages;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", dailyWages=" + dailyWages + "]";
	}

}
