/*

*/
package com.myex.test1;

import java.time.Year;
import java.util.Scanner;

public class JodaTimeAPI7_Year {
	
	public static void main(String[] args){
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year Number : ");
		
		int n = sc.nextInt();
		
		Year year = Year.of(n);
		
		System.out.println(year);
		
		if(year.isLeap()) {
			System.out.printf("%d, entered year is a leap year", n);
		}
		else {
			System.out.printf("%d, entered year is not a leap year",n);
		}
	}
}
