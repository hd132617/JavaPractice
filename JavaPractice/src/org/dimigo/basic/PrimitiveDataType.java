package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name1 ="아이유";
		boolean isfemale = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char BloodType = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " +name1);
		if(isfemale) {
			System.out.println("성별 : 여자");
		} else {
			System.out.println("성별 : 남자");
		}
		System.out.println("나이 : " +age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " +weight);
		System.out.println("혈액형 : " +BloodType);
		
		

	}

}
