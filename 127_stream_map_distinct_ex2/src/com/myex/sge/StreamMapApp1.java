package com.myex.sge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Student;

public class StreamMapApp1 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		//making list of name from the given list of student list

		List<Integer> num = numbers.stream().distinct().collect(Collectors.toList());
		
		num.forEach(n -> System.out.println(n));
		
		
	}
}
