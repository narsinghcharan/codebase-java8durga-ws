/*
collect only those string elements whose length is greater than 7.
*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
	public static void main(String[] args){
	
		List<String> l1 = new ArrayList<String>();
	
		l1.add("Narsingh");
		l1.add("Charan");
		l1.add("NarsinghCharan");
		l1.add("Babu");
		l1.add("Shashikant");
	
		System.out.println(l1);
	
		List<String> l2 = l1.stream().filter(s -> s.length()>=7).collect(Collectors.toList());
	
		System.out.println(l2);
	}
}