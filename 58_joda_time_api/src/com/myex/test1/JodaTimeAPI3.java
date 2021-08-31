/*

*/
package com.myex.test1;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTimeAPI3 {
	
	public static void main(String[] args){
				
		LocalTime time = LocalTime.now();
		
		System.out.println(time);

		int h = time.getHour();
		
		int m = time.getMinute();
		
		int s = time.getSecond();
		
		int n = time.getNano();
		
		
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
	}
}
