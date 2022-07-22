package abc;
class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(" i "+i);
		}
	}
}
class B extends Thread{
	public void run() {
		for(int j =0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ExtendsThreadClass {

	public static void main(String[] args) {
		A obj1 = new A();			// obj1 is indirectly thread class reference 
		B obj2 = new B();			// obj2 is indirectly thread class reference. 
		obj1.start();
		obj2.start();                     // runnable state : ready to run 
	}

}
