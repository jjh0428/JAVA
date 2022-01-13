package com.java.chapter01;

public class Test07 {

	public static void main(String[] args) {
		
		int[] intArray = new int[30];
		String[] remainders = {"Zero", "One", "Two", "Three"};
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = i+1001;
			
			switch (intArray[i]%4) {
				case 0: System.out.println(remainders[0]); break;
				case 1: System.out.println(remainders[1]); break;
				case 2: System.out.println(remainders[2]); break;
				case 3: System.out.println(remainders[3]); break;
			}
		}
		/*for(int i=0; i<intArray.length; i++) {
		  	System.out.println(remainders[i%4]);
		  }
		*/
		
		/*for(int i : intArray) {
		  	System.out.println(remainders[i%4]);
		  }
		 */

	}

}
