//w.a.p for user authentication using "Predicate".

package com.myex.pj;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
			
		Predicate<User> p = user -> user.userName.equals("Durga") && user.pwd.equals("Java");
		
		User user = new User("Durga", "Java");
	//	User user = new User("Durga", ".Net");

		if(p.test(user)) {
			System.out.println("Valid user");
		}else {
			System.out.println("InValid user, try again!!!");
		}
		
	}
}
