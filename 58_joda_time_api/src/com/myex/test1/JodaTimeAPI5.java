/*

*/
package com.myex.test1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JodaTimeAPI5 {
	
	public static void main(String[] args){
				
		//LocalDateTime dt = LocalDateTime.of(yy,mm,dd,h,m,s,n)
		
		LocalDateTime dt = LocalDateTime.of(1990,05,12,8,25,7,5);
		//or
		LocalDateTime dt1 = LocalDateTime.of(1990,Month.MAY,12,8,25,7,5);
		
		System.out.println(dt);
		System.out.println(dt1);
		
		System.out.println("After six months : " + dt.plusMonths(6));
		
		System.out.println("Before six months : " + dt.minusMonths(6));
	}
}
