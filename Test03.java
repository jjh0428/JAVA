package com.java.chapter01;

public class Test03 {

	public static void main(String[] args) {

		int a=3, b=7;
		
		if(a==b)
			System.out.printf("a�� b�� �����ϴ�. a=b=%d", a);
		else {
			System.out.println("a�� b�� ���� �ʽ��ϴ�.");
			if(a>b) {
				System.out.printf("a�� b���� %d��ŭ �� Ů�ϴ�.", a-b);
			} else {
				System.out.printf("b�� a���� %d��ŭ �� Ů�ϴ�.", b-a);
			}
		}
		
	}

}
