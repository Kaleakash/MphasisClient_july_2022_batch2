package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoApp {

	public static void main(String[] args) {
	List<String> listOfStd = new ArrayList<String>();
	listOfStd.add("Dinesh"); listOfStd.add("Mahesh"); listOfStd.add("Ajay"); listOfStd.add("Vijay");
	listOfStd.add("Ram"); listOfStd.add("Raju");
	System.out.println("Before Sort");
	for(String name : listOfStd) {
		System.out.print(name+" ");
	}
	
									Collections.sort(listOfStd);
	
	System.out.println();
	System.out.println("After Sort - Asc ");
	for(String name : listOfStd) {
		System.out.print(name+" ");
	}
	Collections.reverse(listOfStd);
	System.out.println();
	System.out.println("After Sort - Desc ");
	for(String name : listOfStd) {
		System.out.print(name+" ");
	}
	System.out.println();
	if(Collections.binarySearch(listOfStd,"Raju")>=0) {
		System.out.println("Name present");
	}else {
		System.out.println("Name is not present");
	}
	}
}
