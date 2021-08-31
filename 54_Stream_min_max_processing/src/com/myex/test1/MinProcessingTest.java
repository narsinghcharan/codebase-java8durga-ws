/*
sort the elements of the collection and create new collection. 
*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinProcessingTest {
	public static void main(String[] args){
	
		List<Integer> l1 = new ArrayList<Integer>();
	
		l1.add(10);
		l1.add(4);
		l1.add(8);
		l1.add(2);
		l1.add(5);
	
		System.out.println(l1);
	
		Integer minValue = l1.stream().min((s1,s2) -> s1.compareTo(s2)).get();

		Integer maxValue = l1.stream().max((s1,s2) -> s1.compareTo(s2)).get();
		
		System.out.println("Minimum value from the list is  : " + minValue);
		
		System.out.println("Minimum value from the list is  : " + maxValue);
	}
}
