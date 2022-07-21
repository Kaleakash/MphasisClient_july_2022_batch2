package xyz;

interface A {
		void dis1();
}
class B implements A {
		public void dis1() {
			System.out.println("A interface dis1 method override by B class");
		}
		void dis2() {
			System.out.println("B class dis2 method");
		}
}
public class Test3 {
	public static void main(String[] args) {
		//A obj1 = new A();				// we can create object of interface 
		B obj2 = new B();			obj2.dis1();    obj2.dis2();
		A obj3 = new B();          						// We can create sub class object and interface reference 
																	// with help ofthat reference we can call only those method which belong to interface. 
		obj3.dis1();                                       // body is provided by sub class. 
	}
}


