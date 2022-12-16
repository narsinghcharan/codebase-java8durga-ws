package com.myex.sge;

import java.util.ArrayList;
import java.util.List;

public class StreamMatchTest1 {


	public static void main(String[] args) {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		/*
		Various matching operations can be used to check whether a given predicate matches the stream elements. 
		All of these matching operations are terminal and return a boolean result.
		 */
		
		// anyMatch()
		Boolean matchedResult = memberNames.stream().anyMatch(name -> name.startsWith("A"));
		System.out.println(matchedResult);
		
		
		// allMatch()
		matchedResult = memberNames.stream().allMatch(name -> name.startsWith("A"));
		System.out.println(matchedResult);
		
		// noneMatch()
		matchedResult = memberNames.stream().noneMatch(name -> name.startsWith("A"));
		System.out.println(matchedResult);
		
	}
}
