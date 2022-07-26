package com;

import java.util.HashSet;
class A {

	@Override
	public String toString() {
		return "A [toString() A class object ]";
	}
	
}
class B {
	@Override
	public String toString() {
		return "B [toString() B class object ]";
	}
}
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		int a=20;  // primitive value consider 
		Integer b = new Integer(a);		   // converting primitive to Integer object. 
		hs.add(b);
		hs.add(30);    // auto-boxing : converting primitive to Object. 
		hs.add(10.10);
		hs.add("Ravi");
		hs.add(true);
		A obj1 = new A();
		B obj2 = new B();
		hs.add(obj1);
		hs.add(obj2);
		System.out.println(hs);
	}

}
