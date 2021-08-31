package com.myex.sge;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sge.pojo.User;

/*
 * peek() can be useful in another scenario: when we want to alter the inner state of an element. For example, let's say we want to convert all user's name to lowercase before printing them: 
 */
public class StreamFlatMapApp1 {


	public static void main(String[] args) {
		
		List<User> userNames1 = Arrays.asList(new User("Babu"),new User("Charan"),new User("Narsingh"));
		System.out.println("Names before change" + userNames1);
		
		List<User> userNamesAfterChange1 = userNames1.stream().peek(u -> u.setName(u.getName().toUpperCase())).collect(Collectors.toList());
		
		System.out.println("Names after change" + userNames1);
		System.out.println(userNamesAfterChange1);
		
		System.out.println(userNames1 == userNamesAfterChange1);
		
		System.out.println("---------------------------------------------------------");
		
		//Alternatively, we could have used map(), but peek() is more convenient since we don't want to replace the element.
		
		List<User> userNames2 = Arrays.asList(new User("Babu"),new User("Charan"),new User("Narsingh"));
		System.out.println("Names before change" + userNames2);
		
		List<User> userNamesAfterChange2 = userNames1.stream()
				.map(u -> {
					u.setName(u.getName().toUpperCase());
					return u;
				}).collect(Collectors.toList());
				
		
		System.out.println("Names after change" + userNames2);
		System.out.println(userNamesAfterChange2);
		
		System.out.println(userNames2 == userNamesAfterChange2);
		
		
		
	/*
	 * 	if we are using peek() then it creates a new list but it makes the changes in the original list element.
	 * 
	 *  if we are using map() then it creates a new list with new elements.
	 *  
	 *  so if we want to make the changes in the current list or original list elements then we should go for peek() not map().
	 */
	}
}
