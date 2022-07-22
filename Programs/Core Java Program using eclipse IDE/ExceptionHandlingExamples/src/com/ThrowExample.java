package com;
class MyException extends Exception {
	public MyException() {
	
	}
	public MyException(String msg) {
		super(msg);                      // passing this message to Exception parameter constructor to set the message. 
	}
}
public class ThrowExample {

	public static void main(String[] args) {
	int a=10;
	int b=5;
	try {
			if(a>b) {
				//throw new Exception();				// super class predefined 
				//throw new Exception("a>b");		// super class with custom message predefined with custom message 
				//throw new ArithmeticException();		// arithmeticException 
				//throw new ArithmeticException("a>b");// pre-defined exception with custom message. 
				//throw new MyException();						// custom exception 
				throw new MyException("a>b");           // custom exception with custom message 
			}else {
				//throw new Exception();
				System.out.println("No");
			}
	} catch (Exception e) {
		//System.out.println(e.toString());
		System.out.println(e);		// internally it will call toString method to display the name of the exception 
	}
	}
}
