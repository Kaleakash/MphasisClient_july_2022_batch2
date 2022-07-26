package service;

import java.util.Stack;

public class StackService {
			Stack ss = new Stack();
			
			public String push(String name) {
							if(ss.size()<5) {
								ss.push(name);
								return "Element pushed in stack succesfully";
							}else {
								return "Stack is overflow";
							}
			}
			public String pop() {
						if(ss.size()>0) {
							return (String)ss.pop();
						}else {
							return "Stack is underflow";
						}
			}
			public int size() {
				return ss.size();
			}
}
