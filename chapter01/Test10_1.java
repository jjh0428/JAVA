package com.java.chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Test10_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);
		
		int first = nums[n-1];
		int secound = nums[n-2];
		int cnt = 0;
		int result = 0;

		
		for(int j=0; j<m; j++) {
			if(cnt<k) {
				result += first;
				cnt++;
			} else {
				result += secound;
				cnt = 0;
			}
		}
		System.out.println(result);
	}

}
