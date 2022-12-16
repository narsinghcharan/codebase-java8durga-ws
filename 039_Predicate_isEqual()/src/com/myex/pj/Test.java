//w.a.p to display names start with 'k' using "Predicate".

package com.myex.pj;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		//Predicate<String> p = s -> s.equals("NarSingh");
		//or
		Predicate<String> p = Predicate.isEqual("NarSingh");
		
		
		System.out.println(p.test("NarSingh"));
		
		System.out.println(p.test("Charan"));
		
	}
}
