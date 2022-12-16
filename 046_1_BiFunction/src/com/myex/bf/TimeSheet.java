package com.myex.bf;

public class TimeSheet {

	int eno;
	int days;

	public TimeSheet(int eno, int days) {
		super();
		this.eno = eno;
		this.days = days;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "TimeSheet [eno=" + eno + ", days=" + days + "]";
	}

}
