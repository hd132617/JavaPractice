package org.dimigo.inheritance;

public class Tv {
	private String model;
	private String company;
	
	public Tv(){
		
	}
	public Tv(String model, String company){
		this.model =model;
		this.company = company;
	}
	
	public void turnOn(){
		System.out.println(company + " " + model + "의 전원을 켭니다.");
		this.startService();
	}
	public void turnOff(){
		System.out.println(company + " " + model + "의 전원을 끕니다.");
		this.stopService();
	}
	protected void startService(){
		System.out.println("서비스를 시작합니다.");
	}
	protected void stopService(){
		System.out.println("서비스를 종료합니다. ");
	}
	
}
