/*

*/
package com.myex.test1;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTimeAPI2 {
	
	public static void main(String[] args){
				
		LocalDate date = LocalDate.now();
		
		System.out.println(date);

		int dd = date.getDayOfMonth();
		
		int mm = date.getMonthValue();
		
		int yyyy = date.getYear();
		
		System.out.println(dd+"/"+mm+"/"+yyyy);
		
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		
	}
}
