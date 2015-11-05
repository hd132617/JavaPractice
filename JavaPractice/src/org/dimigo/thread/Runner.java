package org.dimigo.thread;

public class Runner extends Thread{
	private String name;
	
	public Runner(){
		
	}
	public Runner(String name){
		this.name = name;
	}
	
	public void run(){
		int meter = 100;
		System.out.println(name +"출발");
		for(int i=0; i<=10; i++) {
			System.out.println(name + (meter-(i*10)));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(name +"골인");
		
	}

}
