package com.myex.womr;

interface Interf {

	public void m1();
}

public class Test {

	public void m2() {					//non-static or instance method
		System.out.println("implementation by method reference");
	}

	public static void main(String args[]) {

		Test t = new Test();
		Interf i = t::m2;
		i.m1();
	}
}
