package org.dimigo.thread;

public class Race {
	public static void main(String[] args) {
		
		
		System.out.println("main Thread start");
		
		
		
		Thread t1 = new Runner("승항");
		Thread t2 = new Runner("ㅁㅁ");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}

	
}
