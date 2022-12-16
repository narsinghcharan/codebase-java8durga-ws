//wap to take String value and return its length using Function.

package com.myex.function;

import java.util.function.IntSupplier;

public class Test1 {

	public static void main(String[] args) {
		
		IntSupplier s = () -> (int)(Math.random()*10);
		
		//System.out.println(s.getAsInt());
		
		String otp = "";
		for(int i=0; i<=6; i++) {
			otp = otp+s.getAsInt();
		}
		
		System.out.println(otp);
	}
}


/*
interface IntSupplier {
	
	public int getAsInt();
}


interface LongSupplier {
	
	public long getAsLong();
}


interface DoubleSupplier {
	
	public double getAsDouble();
}


interface BooleanSupplier {
	
	public boolean getAsBoolean();
}

*/