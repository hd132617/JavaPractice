package org.dimigo.inheritance;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tvs = {
				new Tv("옛날 TV", "GoldStar"),
				new SmartTv("스마트 TV", "삼성"),
				new ThreeDTv("3D TV", "LG")
		};
		
		for(Tv tv :tvs){
			tv.turnOn();
			
			if(tv instanceof SmartTv){
				((SmartTv) tv).searchInternet();
			}
			if(tv instanceof ThreeDTv){
				((ThreeDTv)tv).watch3D();
			}
			
			tv.turnOff();
			System.out.println();
		}

	}

}
