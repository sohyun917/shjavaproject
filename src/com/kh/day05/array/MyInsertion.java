package com.kh.day05.array;

public class MyInsertion {
	public static void main(String [] args) {
				//{2, 5, 4, 1, 3}
				/*
				 * i = 1 
				 * 2, 5, 4, 1, 3 ->1번째 결과
				 * i = 2
				 * 2, 4, 5, 1, 3
				 * 2, 4, 5, 1, 3 ->2번째 결과
				 * i = 3
				 * 2, 4, 1, 5, 3
				 * 2, 1, 4, 5, 3
				 * 1, 2, 4, 5, 3 ->3번째 결과
				 * i = 4
				 * 1, 2, 4, 3, 5 
				 * 1, 2, 3, 4, 5
				 * 1, 2, 3, 4, 5 
				 * 1, 2, 3, 4, 5 ->4번째 결과
				 */
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = (i-1); j < i; j--) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
