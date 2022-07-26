package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(4);
		ts.add(1);
		ts.add(6);
		ts.add(2);
		ts.add(3);
	//	ts.add(10.20);
		ts.add(7);
		System.out.println(ts);
		System.out.println(ts.headSet(3));
		System.out.println(ts.tailSet(3));
		System.out.println(ts.subSet(3, 6));
		System.out.println(ts.remove(6));
		System.out.println(ts);
	}

}
