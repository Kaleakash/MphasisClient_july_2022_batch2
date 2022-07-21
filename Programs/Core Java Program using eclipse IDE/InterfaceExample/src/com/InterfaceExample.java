package com;
interface Abc {
	int A=10;
	void dis1();
}
interface Mno {
	int B=20;
	void dis2();
}
interface Xyz extends Abc,Mno{
	int C=30;
	void dis3();
}
class Demo implements Abc,Mno {
		public void dis1() {
			System.out.println("This is Abc interface method");
		}
		public void dis2() {
			System.out.println("This is Xyz interface method");
		}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.dis1();
		obj.dis2();
	}

}
