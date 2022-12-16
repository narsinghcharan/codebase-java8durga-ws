package com.myex.wcr2;

class Sample {

	Sample() {
		System.out.println("Sample Constructor Execution and Object Creation");
	}
}

interface Interf { // functional interface
	public Sample get();	//Sample constructor and this get() method arguments are same
}


//with constructor reference
public class Test {

	public static void main(String[] args) {
		
		Interf i = Sample :: new;
		
		Sample sam = i.get();
	}
}

