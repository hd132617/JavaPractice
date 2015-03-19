package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		long pay = 1700000L;
		int employee = 3;
		long store =1500;
		
		long totalpay = pay*employee*store*12;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여:" + String.format("%,d", pay));
		System.out.println("점포 내 직원 수:" + String.format("%,d", employee));

		System.out.println("점포 :" + String.format("%,d", store));

		System.out.println("\n연간 인건비:" + String.format("%,d", totalpay));
		
	}

}
