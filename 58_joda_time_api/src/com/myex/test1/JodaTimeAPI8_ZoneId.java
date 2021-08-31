/*

*/
package com.myex.test1;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTimeAPI8_ZoneId {

	public static void main(String[] args) {

		ZoneId zid = ZoneId.systemDefault();
		
		System.out.println(zid);
		
		//-----------------------------------------------
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		
		ZonedDateTime dt = ZonedDateTime.now(la);
		
		System.out.println(dt);
	}
}
