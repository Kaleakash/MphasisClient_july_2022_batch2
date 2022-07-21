package com;

class Info {
		int a;					// instance variable 
		static int b;		// static variable 
		
		void display() {
			System.out.println(" instance variable "+a);
			System.out.println("static variable        "+b);
		}
}
public class StaticAndHeapMemory {
	public static void main(String[] args) {
					Info obj1 = new Info();
					Info obj2 = new Info();
							obj1.a=10;
								obj1.b=20;
									Info.b=30;
		
									obj2.a=40;
									obj2.b=50;
		Info.b=60;
		obj1.b=70;
		obj2.b=80;
		
		obj1.display();						// a=	10			b=60 
		obj2.display();					  // a= 40				b= 60
	}

}
