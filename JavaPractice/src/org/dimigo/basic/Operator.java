package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		double aa = (9+10)*5.8/2;  //사다리꼴 넓이
		double bb = 9*5.4;   //평행사변형 넓
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : "+aa);
		System.out.println("평행사변형 넓 : " +bb);
		
		if (aa>bb) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (aa-bb)+ "더 큽니다.");
		} else {
			System.out.println(" 평행사변형이 사다리꼴 보다 " + (bb-aa)+ "더 큽니다.");

			
		}
	}

}
