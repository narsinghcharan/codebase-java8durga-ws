package com.myex.wcr1;

class Sample {

	Sample() {
		System.out.println("Sample Constructor Execution and Object Creation");
	}
}

interface Interf { // functional interface
	public Sample get();
}

//without constructor reference
public class Test {

	public static void main(String[] args) {
		
		Interf i = () -> { 
			Sample s = new Sample();
			return s;
		};
		
		Sample sam = i.get();
	}
}
