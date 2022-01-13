package com.java.chapter01;

public class Test03 {

	public static void main(String[] args) {

		int a=3, b=7;
		
		if(a==b)
			System.out.printf("a와 b가 같습니다. a=b=%d", a);
		else {
			System.out.println("a와 b가 같지 않습니다.");
			if(a>b) {
				System.out.printf("a가 b보다 %d만큼 더 큽니다.", a-b);
			} else {
				System.out.printf("b가 a보다 %d만큼 더 큽니다.", b-a);
			}
		}
		
	}

}
