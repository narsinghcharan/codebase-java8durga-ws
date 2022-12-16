//w.a.p to display names start with 'k' using "Predicate".

package com.myex.pj;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		String[] names = {"Kajol","Katrina","Tamana","Kareena"};
		
		//Predicate<String> startWithK = s -> s.startsWith("k");
		
		Predicate<String> startWithK = s -> s.charAt(0) == 'K';
		
		for(String name : names) {
			
			if(startWithK.test(name)) {
				System.out.println(name);
			}
		}
	}
}
