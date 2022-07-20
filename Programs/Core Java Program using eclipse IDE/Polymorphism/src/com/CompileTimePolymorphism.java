package com;
class Operation {
	public void area(int r) {
		double area = 3.142*r*r;
		System.out.println(" Area of circle "+area);
	}
	public void area(int b, int h) {
		double area = 0.5*b*h;
		System.out.println("Area of triangle "+area);
	}

}
public class CompileTimePolymorphism {
	public static void main(String[] args) {
	Operation op = new Operation();
	op.area(4);
	op.area(10,12);
	}

}
