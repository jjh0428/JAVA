package com.java.bankAccount;

public class ex01 {

	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		ex01 e = new ex01();
		
		System.out.println(e.add(10, 50));
		System.out.println(e.add(10, 50, 60));
		System.out.println(e.add(10.0, 15.9));

	}

}
