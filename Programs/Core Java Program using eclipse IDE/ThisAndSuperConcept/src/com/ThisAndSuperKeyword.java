package com;
class A {
		int x=10;
}
class B extends A {
		int x=20;						// sub class variable hide the visibility of super class variable. 
		public void dis() {
			int x=30;							// local variable hide the visiblity of instance variable 
			System.out.println("x super class variable "+super.x);
			System.out.println("x instance variable "+this.x);
			System.out.println("x "+x);
		}
}
public class ThisAndSuperKeyword {

	public static void main(String[] args) {
		B obj1 = new B();
		obj1.dis();
	}

}
