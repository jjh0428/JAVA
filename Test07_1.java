package com.java.chapter01;

public class Test07_1 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1; //arr1 = arr2 �ϳ��� �ٲ�� ���� ���� �ٲ�
		int[] arr3 = arr1.clone(); //arr1 != arr3 arr1�� �迭�� �״�� ������
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[4] = 100;
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println(arr1[4]);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
