package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class CollectionRetrieve {

	public static void main(String[] args) {
	//Set ss = new HashSet();
		HashSet ss = new HashSet();
	ss.add(2); ss.add(4);ss.add(1); ss.add(5); ss.add(3);
	System.out.println(ss);
	System.out.println("for each loop");
	for(Object i:ss) {
			System.out.println(i);
	}
	System.out.println("using Iterator interface");
	Iterator ii	= ss.iterator();
	while(ii.hasNext()) {
		System.out.println(ii.next());
	}
	
	List ll = new ArrayList();
	ll.add(1); ll.add(5); ll.add(4); ll.add(3);
	System.out.println("we can use for each loop and iterator");
	System.out.println("Using for each loop");
	for(Object i:ll) {
		System.out.println(i);
	}
	System.out.println("Using iterator interface");
	Iterator ii1  = ll.iterator();
	while(ii1.hasNext()) {
		System.out.println(ii1.next());
	}
	ListIterator li = ll.listIterator();
	System.out.println("using listiterator - forward direction");
	while(li.hasNext()){
		System.out.println(li.next());
	}
	System.out.println("using listiterator - backward direction");
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
	
	Map mm = new HashMap();
	mm.put(1, "Raj");
	mm.put(2, "Ramesh");
	mm.put(3,"Lokesh");
	System.out.println(mm);
	Set s		 = mm.entrySet();   // converting map to set 
	Iterator ii2 = s.iterator();
	while(ii2.hasNext()) {
		System.out.println(ii2.next());
	}
	}

}



