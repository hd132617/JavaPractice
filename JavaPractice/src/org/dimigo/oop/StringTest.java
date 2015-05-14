package org.dimigo.oop;

public class StringTest {

	public static void main(String[] args) {
		//1. 문자열 리터럴 방식 
		String dog1 = "멍멍이";
		String dog2 = "멍멍이";
		
		//2. new 객체 생성 방식 
		String cat1 = new String("야옹이");
		String cat2 = new String("야옹이");
		
		System.out.println(dog1 == dog2);
		System.out.println(cat1 == cat2);
		System.out.println(dog1 == "멍멍이");
		
		
		System.out.println(dog1.equals(dog2));
		System.out.println(cat1.equals(cat2));
		
		String id =null;
		
		if("admin".equals(id)) {
			System.out.println("관리자입니다!!");
		} else {
			System.out.println("일반 사용자입니다!!");
		}
	}

}
