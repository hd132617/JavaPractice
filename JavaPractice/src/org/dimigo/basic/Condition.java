package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int price=0;
		int fprice=0;
		int distance =10;
		String vehicle = "그 외";
		
		if(vehicle == "고속버스") {
			price =850;
		} else if(vehicle == "경차") {
			price =300;
		} else if(vehicle == "그 외") {
			price = 600;
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		
		if(vehicle =="고속버스") {
			if(0<distance && distance<=10) {
				fprice =price;
			} else if(10<distance && distance<=20) {
				fprice =price+300;
			} else if(20<distance && distance<=30) {
				fprice =price+600;
			}
		} else if (vehicle =="경차" || vehicle =="그 외") {
			if(0<distance && distance<=10) {
				fprice =price;
			} else if(10<distance && distance<=20) {
				fprice =price+200;
			} else if(20<distance && distance<=30) {
				fprice =price+400;
			}
		}
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 :"+ distance +"km");
		System.out.println("차종 :" + vehicle);
		System.out.println("통행료 :" + fprice);
		
		
		/*
	switch(vehicle) {
		case "고속버스":
			int fee=850;
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 :"+ distance +"km");
			System.out.println("차종 :" + vehicle);
			if(0<distance && distance<=10) {
				System.out.println("통행료 :" + fee);
			} else if(10<distance && distance<=20) {
				System.out.println("통행료 :" + (fee+300));
			} else if(20<distance && distance<=30) {
				System.out.println("통행료 :" + (fee+600));
			}
			break;
		
		case "경차":
			int fee1=300;
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 :"+ distance +"km");
			System.out.println("차종 :" + vehicle);
			if(0<distance && distance<=10) {
				System.out.println("통행료 :" + fee1);
			} else if(10<distance && distance<=20) {
				System.out.println("통행료 :" + (fee1+200));
			} else if(20<distance && distance<=30) {
				System.out.println("통행료 :" + (fee1+400));
			}
			break;
			
		case "그 외":
			int fee2 =600;
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 :"+ distance +"km");
			System.out.println("차종 :" + vehicle);
			if(0<distance && distance<=10) {
				System.out.println("통행료 :" + fee2);
			} else if(10<distance && distance<=20) {
				System.out.println("통행료 :" + (fee2+200));
			} else if(20<distance && distance<=30) {
				System.out.println("통행료 :" + (fee2+400));
			}
			break;
		default :
			System.out.println("잘 못 입력하셨습니다.");
		} */
		
		
		
	}
}
