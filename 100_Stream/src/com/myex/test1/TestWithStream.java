/*
w.a.p to create a new Collection where each element is the double of the existing collection.
*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestWithStream {

	public static void main(String[] args) {
		
		List<Integer> l = new  ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
		
		List<Integer> l1 = l.stream().map(i -> i*2).collect(Collectors.toList());
		
		System.out.println(l1);
		
	}
}
