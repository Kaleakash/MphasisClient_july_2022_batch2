package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
	System.out.println("Hi");
	int abc[] = {0,20};
	try {
		int result = 100/abc[2];
		System.out.println("No Exception "+result);
	}catch (ArithmeticException e) {
		System.out.println("Divided by zero "+e);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index "+e);
	}
	System.out.println("Normal Statement");
	}

}
