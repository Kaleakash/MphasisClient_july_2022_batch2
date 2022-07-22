package com;

public class FinallyBlockExample {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result  = 10/1;
			System.out.println("No Exception ");
		} catch (Exception e) {
			System.out.println("Catch block");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Normal statement");
	}
}
