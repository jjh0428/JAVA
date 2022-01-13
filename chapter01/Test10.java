package com.java.chapter01;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int[] nums = new int[n];
//	/	Integer[] nums = new Integer[];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);
//	/	Arrays.sort(nums, Collections.reverseOrder());
		
//		int temp;
//		for(int i=0; i<nums.length; i++) {
//			for(int j=i+1; j<nums.length; j++) {
//				if(nums[i]<nums[j]) {
//					temp = nums[i];
//					nums[i] = nums[j];
//					nums[j] = temp;
//				}
//			}
//		}
		

		int first = nums[n-1];
		int secound = nums[n-2];
//		int cnt = 0;
		int cnt = (m/(k+1))*k;
		cnt = cnt + m%(k+1);
		int result = 0;
		
		result += cnt * first;
		result += (m-cnt) * secound;
		
//		for(int j=0; j<m; j++) {
//			if(cnt<k) {
//				result += first;
//				cnt++;
//			} else {
//				result += secound;
//				cnt = 0;
//			}
//		}
		System.out.println(result);
	}

}
