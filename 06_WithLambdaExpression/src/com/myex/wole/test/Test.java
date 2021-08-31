package com.myex.wole.test;

import com.myex.wole.Interf;

public class Test {

	public static void main(String[] args) {
		
	//	Interf i = (String s) -> { return s.length(); };
	//	Interf i = (s) -> { return s.length(); };
	//	or
		Interf i = s -> s.length() ;		//here variable "i" is holding the complete behavior/method logic/Lambda Expression
		
		System.out.println(i.getLength("Narsingh"));
		
		System.out.println(i.getLength("Narsingh Charan"));
		
	}
}

/*

Here we have not provided the type of parameters "s", but compiler can guess automatically based on the context 
(left hand side of the "=" operator) which is called type inference.

here the Lambda Expression is represented by, "Interf" interface type of variable, then immediately compiler will check that these 
are the arguments to abstract method getLength() of Interf interface, so compiler can guess automatically then name of the method,
number of arguments, the arguments type by comparing with abstract method of Interf interface.


note :- Lambda Expressions can be hold or referred by only FunctionalInterface by variable.
and using this FunctionalInterface reference variable only we can call/invoke Lambda Expression. 

*/