package com.myex.womr;

interface Interf {

	public void m1();
}

public class Test {
	public static void main(String args[]) {

		Interf i = () -> {

			System.out.println("Lambda Expression implementation");
		};

		i.m1();
	}

}
