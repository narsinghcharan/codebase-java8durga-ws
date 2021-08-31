package com.myex.wole.test;

import com.myex.wole.Interf;

public class Test {

	public static void main(String[] args) {
		
		Interf i = () -> System.out.println("m1() method implementation.");	//here variable "i" is holding the complete behavior/method logic/Lambda Expression
		
		i.m1();
	}
}
