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
		
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("����: %d�� %d�� %d��\n", year, month, day);
		System.out.printf("�������: %b\n", emp);
		System.out.printf("ȸ��: %s\n", cname);

	}


}
