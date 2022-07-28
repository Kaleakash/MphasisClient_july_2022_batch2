package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection framework without generics 
//		List ll1 = new ArrayList();
//       
//		ll1.add(10);					// auto-boxing : converting primitive to object 
//		ll1.add(10.10);
//		ll1.add("Raju");
//		ll1.add(true);
//		
//		Object obj = ll1.get(0);
//		Integer  i = (Integer)obj;			// downlevel type casting 
//		int n		= i.intValue();				// converting object to primitive 
//		System.out.println(n);
		
		// Collection framework with generics 
	
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);					// auto-boxing : converting primitive to object. 
		ll.add(20);
		ll.add(30);
		//ll.add(10.20);		we can't store float or double value 
		
		int n = ll.get(0);    // auto-unboxing : conveting object / integer object to primitve 
		System.out.println(n);
		
		Map<Integer, String> mm = new HashMap<Integer, String>();
		mm.put(1, "Ramesh");
		mm.put(2, "Lokesh");
		System.out.println(mm);
	}

}
