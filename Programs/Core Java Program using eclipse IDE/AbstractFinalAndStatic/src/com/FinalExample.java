package com;
class A {
		final void dis1() {
			System.out.println("A class method");
		}
}
class B extends A {
//	void dis1() {
//		System.out.println("Overding A class method");
//	}
}
public class FinalExample {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		a=20;
		final int B=20;
		System.out.println(B);
		//B=30;
		B obj1 = new B();
		//obj1.dis1();
	}

}
