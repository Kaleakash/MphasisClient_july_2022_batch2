package com;
class Info implements Runnable {
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i =0;i<10;i++) {
		try {
			System.out.println( name+" "+i);
			Thread.sleep(500);
			if(i==5 && name.equals("Ravi")) {
				wait();
			}
			if(i==4 && name.equals("Vijay")) {					// at this point of time waited thread resume it. 
				notify();
				wait();
			}
		} catch (Exception e) {}
	}
	}
}
public class InnerThreadCommunication {
	public static void main(String[] args) {
	Info obj = new Info();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj);
	Thread t3 = new Thread(obj);
	t1.setName("Ravi");
	t2.setName("Ajay");
	t3.setName("Vijay");
	t1.start();
	t2.start();
	t3.start();
	
	}

}
