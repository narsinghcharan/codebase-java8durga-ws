package com.myex.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachTest {
	public static void main(String[] args){
	
		List<String> l1 = new ArrayList<String>();
	
		l1.add("A");
		l1.add("BB");
		l1.add("CCC");
		l1.add("DDD");
		l1.add("EEEE");
	
		System.out.println(l1);
	

		l1.stream().forEach(s -> System.out.println(s));
		
		//or using method reference
		
		l1.stream().forEach(System.out :: println);

	}
}
