package com;
class Bike {
	public void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	public void color() {
		System.out.println("Black");
	}
}
class Pulsar extends Bike {
	public void speed() {
		System.out.println("90km/hr");
	}
	public void color() {
		System.out.println("Red");
	}
}
class Tvs extends Bike {
	public void color() {
		System.out.println("Gray");
	}
	public void speed() {
		super.speed();                      // calling super class speed method 
		System.out.println("20km/hr");
	}
}
public class RuntimePolymoprhism {
	public static void main(String[] args) {
		Honda hh = new Honda();		hh.color();        hh.speed();			// 60 km/hr
		Pulsar pu = new Pulsar();	pu.color();			pu.speed();			// 90 km/hr
		Tvs tvs = new Tvs();		tvs.color();		tvs.speed();		// 60 km/hr 20 km/hr 
	}
}
