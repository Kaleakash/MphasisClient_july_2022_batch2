package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println(ss.pop());    // it is use to remove last element 
		System.out.println(ss);
		System.out.println(ss.peek());    // it will display last element but doesnt' remove from stack 
		System.out.println(ss);
		System.out.println(ss.search(100));			// position from top to bottom and start from 1 
		System.out.println(ss.search(1000));		// -1 not present 
		
	}

}
