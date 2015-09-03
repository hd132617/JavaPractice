package org.dimigo.inheritance;

public class ThreeDTv extends Tv{
	
	public ThreeDTv(){
		
	}
	public ThreeDTv(String model, String company){
		super(model, company);
	}
	
	public void startService(){
		System.out.println("3D 입체 영상을 시작합니다.");
	}
	
	public void watch3D(){
		System.out.println("3D 입체 영상을 봅니다.");
	}
	
	public void stopService(){
		System.out.println("3D 입체 영상을 종료합니다.");
	}

}
