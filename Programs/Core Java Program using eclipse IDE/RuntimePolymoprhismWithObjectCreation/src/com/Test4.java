package com;

interface Team1 {
			public int add(int x, int y);
}
interface Team2 {
			public int sub(int x, int y);
}
class Manager implements Team1, Team2 {
		public int add(int x, int y) {
				return x+y;
		}
		public int sub(int x, int y) {
			return x-y;
		}
		public void ownMethod() {
			System.out.println("manager own method");
		}
}
public class Test4 {
	public static void main(String[] args) {
			Manager mgr = new Manager();
		   System.out.println(mgr.add(100, 50));
		   System.out.println(mgr.sub(100, 60));
		   mgr.ownMethod();
		   Team1 t1 = new Manager();
		   System.out.println(t1.add(100, 40));
		   //System.out.println(t2.sub(40,20));
		   Team2 t2 = new Manager();
		   System.out.println(t2.sub(30, 20));
	}

}
