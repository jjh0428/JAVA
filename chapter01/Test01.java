package com.java.chapter01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		boolean emp = input.nextBoolean();
		String cname = input.next();
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("생일: %d년 %d월 %d일\n", year, month, day);
		System.out.printf("취업여부: %b\n", emp);
		System.out.printf("회사: %s\n", cname);

	}


}
