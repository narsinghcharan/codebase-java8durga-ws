package com.myex.wole.test;

import com.myex.wole.Interf;

public class Test {

	public static void main(String[] args) {
		
	//	Interf i = (int x) -> { return x*x };
		
		//or
	//	Interf i = (x} -> x*x ;

		//or
		Interf i = x -> x*x ;

		System.out.println(i.getSquare(9));
		
		System.out.println(i.getSquare(7));
		
	}
}

