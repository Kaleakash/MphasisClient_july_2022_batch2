package mno;
abstract class A {
		abstract void dis1();
}
class B extends A {
		void dis1() {
			System.out.println("A class dis1 method override by B class");
		}
		void dis2() {
			System.out.println("B class dis2 method");
		}
}
public class Test2 {
	public static void main(String[] args) {
		//A obj1 = new A();				// we can create object of super class because it is abstract class 
		B obj2 = new B();			obj2.dis1();    obj2.dis2();
		A obj3 = new B();          						// We can create sub class object and super class reference super class can be 
																	// be abstract class. with that reference we can call only those method which belong to abstract class. 
		obj3.dis1();                                       // body is provided by sub class. 
	}
}

