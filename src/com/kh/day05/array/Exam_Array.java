package com.kh.day05.array;

public class Exam_Array {
	public static void main(String [] args) {
//		int num;
		//★선언     =   할당
		int [] nums = new int[10];
		//배열은 여러개를 다루니까 복수형 쓰고 가운데 괄호넣기
		//new를 만나면 메모리에 []개만큼 할당된다.
		System.out.println(nums[0]);
		//만든 직후 값을 할당하지 않으면 0으로 초기화되어있음.
		//★초기화
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println("첫번째 값 : " + nums[0]);
		System.out.println("두번째 값 : " + nums[1]);
		System.out.println("세번째 값 : " + nums[2]);
		System.out.println("배열의 크기 : " + nums.length);
		
		for(int i = 0; i <nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = 100; //nums값을 100으로 통일
			System.out.print(nums[i]);
		}
	}

}
