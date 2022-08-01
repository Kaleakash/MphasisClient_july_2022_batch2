package com;

import java.util.Arrays;

public class SearchingExample {
	public static int linearSearch(int num[],int leng, int key) {
			for(int i=0;i<leng;i++) {
				if(num[i]==key) {
					return i;
				}
			}
			return -1;
	}
	// 1 2 3 4 5 6 7 9 
	public static void bindarySearch(int num[],int first, int last, int key) {
		int mid = (first+last)/2;				// 0+99/2=49 mid = 3
		while(first<=last) {
			if(num[mid]< key) {
				first = mid+1;
			}else if(num[mid]==key) {
				System.out.println("Element found at index position "+mid);
				break;
			}else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not found");
		}
	}
	// 1 2 3 4 5 6 7 9 
	public static void exponentialSearch(int num[], int leng, int key) {
		if(num[0]==key) {
			System.out.println("Element present in 0 position");
		}
		int i=1;
		while (i < leng && num[i] <= key) {
				i = i*2;														//i =1, i=2, i=4, i=8
		}
		bindarySearch(num, i/2, Math.min(i, leng-1), key);						// start 4 , end 7
	}
	public static void main(String[] args) {
		int num[]={4,1,6,9,7,3,2,5};
		System.out.println("Element in array ");
		for(int n:num) {
			System.out.print(n+" ");
		}
//		int result = linearSearch(num, num.length, 10);
//		System.out.println();
//		if(result==-1) {
//			System.out.println("Element not present");
//		}else {
//			System.out.println("Element present in position as "+result);
//		}
		Arrays.sort(num);
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		//bindarySearch(num, 0, num.length-1, 7);
		exponentialSearch(num, num.length, 5);
	}

}
