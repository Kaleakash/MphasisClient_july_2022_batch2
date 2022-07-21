package abc;
class A {
		void dis1() {
			System.out.println("A class dis1 method");
		}
}
class B extends A {
		void dis1() {
			System.out.println("A class dis1 method override by B class");
		}
		void dis2() {
			System.out.println("B class dis2 method");
		}
}
public class Test1 {
	public static void main(String[] args) {
	A obj1 = new A();			obj1.dis1();									// super 					creaiting super class object and same class reference. possible 
			B obj2  = new B();			obj2.dis1();      obj2.dis2();			// sub class 				creating sub class object and same class reference possible 
	///B obj3 = new A();																	// creating super class object and sub class referene not possible 
			A obj4 = new B();																	// creating sub class object and super class reference possible. run time polymorphism 
																// with help of that reference we can call only those method which belong to super class or override method in sub class. 
			obj4.dis1();
			//obj4.dis2();							// this method purely belong to sub class. 
							
	}
}
