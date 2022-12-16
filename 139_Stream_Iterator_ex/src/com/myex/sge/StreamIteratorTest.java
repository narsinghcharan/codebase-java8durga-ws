package com.myex.sge;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamIteratorTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		Iterator<Integer> iterator = numbers.stream().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

/*
applying iterator() method on stream is same as applying on list (coding wise).
*/