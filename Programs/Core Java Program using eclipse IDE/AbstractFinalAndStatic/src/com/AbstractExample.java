package com;
abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("55km/hr");
	}
}
class Honda extends Bike {
	void color() {
		System.out.println("Black");
	}
	void speed() {
		System.out.println("50km/hr");
	}
}
public class AbstractExample {
	public static void main(String[] args) {
	//Bike bb = new Bike();	
		Honda hh = new Honda();
		hh.speed();
		hh.color();
		hh.mailage();
	}
}
