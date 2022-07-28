package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(60);			// it add at the last. 
		System.out.println(al);
		System.out.println(" Get value using index position "+al.get(1));
		al.add(1, 20);			// added at that position 
		System.out.println(" Get value using index position "+al.get(1));
		System.out.println(" Get value using index position "+al.get(2));
		al.set(1, 200);		// replace on that position 
		System.out.println(" Get value using index position "+al.get(1));
		al.remove(2);						// index position 
		al.remove(new Integer(200));	// using 
		System.out.println(al);
	}

}
