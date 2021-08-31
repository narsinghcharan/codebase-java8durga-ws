/*

*/
package com.myex.test1;

import java.time.LocalDate;
import java.time.Period;

public class JodaTimeAPI6_Period {
	
	public static void main(String[] args){
				
		LocalDate  birthDate = LocalDate.of(1990,3,12);
		
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthDate, today);
		
		
		System.out.printf("Your age is %d years %d months and %d days.",p.getYears(),p.getMonths(),p.getDays());
		
		
		LocalDate deathDate  = LocalDate.of(1990+80, 5, 12);
		
		Period p1 = Period.between(today, deathDate);
		
		int d = p1.getYears()*365 + p1.getMonths()*30 + p1.getDays();
		
		
		System.out.println("Time Left : "+d);
	}
}
