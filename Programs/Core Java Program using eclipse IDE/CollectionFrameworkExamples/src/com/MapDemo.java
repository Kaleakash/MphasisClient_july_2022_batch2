package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//Map mm = new HashMap();					// unorder 
		//Map mm = new LinkedHashMap();			// it maintain the order
		//Map mm = new TreeMap();							// ascending order as a key
		Map mm  = new Hashtable();						// by default method are synchronized 
		mm.put(2, "Ravi");
		mm.put(1, "Ramesh");
		mm.put(4, "Lokesh");
		mm.put("A","B");
		mm.put(3, "Ajay");
		System.out.println(mm);
		mm.put(2, "Dinesh");       //it doesn't allow duplicate key if we try to store it will replace by new value
		mm.put(6,"Ajay");
		System.out.println(mm);
		System.out.println(mm.get(1));
		System.out.println(mm.get(100));
		System.out.println(mm.containsKey(1));
		System.out.println(mm.containsValue("Dinesh"));
		
	}

}
