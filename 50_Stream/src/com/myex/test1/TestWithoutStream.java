/*
w.a.p to create a new Collection where each element is the double of the existing collection.
*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.List;

public class TestWithoutStream {

	public static void main(String[] args) {
		
		List<Integer> l = new  ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
		
		List<Integer> l1 = new ArrayList<>();
		
		for(Integer i : l) {
			
				l1.add(i*2);
			
		}
		
		System.out.println(l1);
	}
}
