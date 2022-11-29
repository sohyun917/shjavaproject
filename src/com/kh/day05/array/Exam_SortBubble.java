package com.kh.day05.array;

public class Exam_SortBubble {
	public static void main(String [] args) {
		//정렬 알고리즘
		//1. 삽입정렬
		//2. 선택정렬
		//3. 버블정렬
		//버블정렬이란?
		//인접한 두개의 원소를 검사하여 정렬하는 방법
		//구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름.
		//기본적으로 다른 정렬에 비해 정렬속도가 느리며, 역순으로 정렬할 때
		//가장 느림.
		//{2, 5, 4, 1, 3}
		/* i=0
		 * 2, 5, 4, 1, 3 ->처음은 (배열의 크기-1)만큼 비교해
		 * 2, 4, 5, 1, 3
		 * 2, 4, 1, 5, 3
		 * 2, 4, 1, 3, 5
		 * i=1
		 * 2, 4, 1, 3, 5
		 * 2, 1, 4, 3, 5
		 * 2, 1, 3, 4, 5
		 * i=2
		 * 1, 2, 3, 4, 5
		 * 1, 2, 3, 4, 5 ->비교횟수가 점점 줄어든다
		*/	
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 0; i < arrs.length-1; i++) {//처음에 (배열의크기-1)만큼 비교하니까
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
//			for(int j = (arrs.length-1)-i; j >= 0; j--) //처음에 4만큼 비교, 그다음 3만큼 비교... 마지막 1만큼 비교
//				if(arrs[j] > arrs[j+1]) {
//					int temp = arrs[j+1];
//					arrs[j+1] = arrs[j];
//					arrs[j] =  temp;
//				}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
