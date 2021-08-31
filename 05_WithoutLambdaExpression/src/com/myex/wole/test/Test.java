package com.myex.wole.test;

import com.myex.wole.Demo;
import com.myex.wole.Interf;

public class Test {

	public static void main(String[] args) {
		
		Interf i = new Demo();
		
		System.out.println(i.getLength("Narsingh"));
		
		System.out.println(i.getLength("Narsingh Charan"));
		
	}
}

