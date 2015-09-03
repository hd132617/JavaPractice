package org.dimigo.inheritance;

public class SmartTv extends Tv{
	
	public SmartTv(){
		
	}
	public SmartTv(String model, String company){
		super(model, company);
	}
	
	public void startService(){
		System.out.println("인터넷을 시작합니다.");
	}
	
	public void searchInternet(){
		System.out.println("인터넷을 검색합니다.");
	}
	
	public void stopService(){
		System.out.println("인터넷을 종료합니다.");
	}
}
