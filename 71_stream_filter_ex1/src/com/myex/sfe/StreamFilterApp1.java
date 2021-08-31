package com.myex.sfe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterApp1 {

	public static void main(String[] args) {

		List<Long> numbers = new ArrayList<>();

		numbers.add(1l);
		numbers.add(2l);
		numbers.add(3l);
		numbers.add(4l);
		numbers.add(5l);
		numbers.add(6l);
		numbers.add(7l);
		numbers.add(8l);
		numbers.add(9l);
		numbers.add(10l);
		
		List<Long> evenNumbers = numbers.stream().filter(element -> element%2==0).collect(Collectors.toList());
		
		List<Long> oddNumbers1 = numbers.stream().filter(element -> element%2!=0).collect(Collectors.toList());
		
		List<Long> oddNumbers2 = numbers.stream().filter(element -> !(element%2==0)).collect(Collectors.toList());
		
		System.out.println("Even Numbers " + evenNumbers);
		
		System.out.println("Odd Numbers " + oddNumbers1);
		
		System.out.println("Odd Numbers " + oddNumbers2);
	}

}