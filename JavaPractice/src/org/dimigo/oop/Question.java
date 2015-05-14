package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		String a1= "빅뱅";
		String a2= "조인성";
		String a3= "자바";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		
		if(a1.equals(answer)) {
			System.out.println("정답입니다!!");
		} else {
			System.out.println("틀렸습니다.");
		}

		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		
		if(a2.equals(answer2)) {
			System.out.println("정답입니다!!");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		String answer3 = scanner.nextLine();
		
		if(a3.equals(answer3)) {
			System.out.println("정답입니다!!");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		scanner.close();
	}

}
