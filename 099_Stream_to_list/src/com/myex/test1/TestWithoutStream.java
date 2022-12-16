/*
w.a.p to filter all the even numbers from the collection into another list.
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
			if(i%2==0) {
				l1.add(i);
			}
		}
		
		System.out.println(l1);
	}
}
