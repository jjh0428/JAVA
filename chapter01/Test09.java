package com.java.chapter01;

public class Test09 {

	public static void main(String[] args) {
		
		int n = 1260;
		int cnt = 0;
		int temp = 0;
		
		int[] coinTypes = {50, 100, 10, 500};
		
		for(int i=0; i<coinTypes.length; i++) {
			for(int j=i+1; j<coinTypes.length; j++) {
				if(coinTypes[i]<coinTypes[j]) {
					temp = coinTypes[i];
					coinTypes[i] = coinTypes[j];
					coinTypes[j] = temp;
				}
			}
		}
		for(int i=0; i<coinTypes.length; i++) {
			int coin = coinTypes[i];
			cnt = cnt + (n/coin);
			n = n % coin;
		}
		
		System.out.println(cnt);

	}

}
