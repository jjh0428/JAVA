package com.java.chapter01;

public class Test05 {

	public static void main(String[] args) {
		
		int num = 10000;
		int key = 153;
		int i=1, j=1;
		
		while(i<=num) {
			if(i%key==0) {
				j=i;
			}
			i++;
		}
		System.out.print(j);

	}

}
