package com;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(2);
		hs.add(1);
		hs.add(5);
		hs.add(3);
		hs.add(3);
		hs.add(8);
		hs.add(7);
		HashSet hs1  = new HashSet();
		hs1.add(100);
		hs1.add(400);
		hs1.add(200);
		System.out.println(hs);
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(hs1);
		System.out.println("size "+hs.size());
		System.out.println(hs);
		System.out.println(" Search "+hs.contains(2));
		System.out.println(" Search "+hs.contains(200));
		System.out.println("Remove "+hs.remove(2));
		System.out.println("Remove "+hs.remove(200));
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	}

}
