package com;

public class TryWithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				int res = 10/0;
				System.out.println("No Exception ");
			} finally {
					System.out.println("finally block");
			}
			System.out.println("Normal Statement");
	}

}
