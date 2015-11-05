package org.dimigo.thread;

public class Race2 {
	public static void main(String[] args) {
		
		
		System.out.println("main Thread start");
		
		
		
		Thread t1 = new Thread(new Runner("승항"));
		Thread t2 = new Thread(new Runner("ㅁㅁ"));
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}

	
}
