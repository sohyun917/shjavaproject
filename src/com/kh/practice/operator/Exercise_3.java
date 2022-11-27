package com.kh.practice.operator;

import java.util.Scanner;

public class Exercise_3 {
	public static void main(String [] args) {
//		Q.양음판별1
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“
//		양수가 아니면 “양수가 아니다“를 출력하세요.
//
//		ex.
//		정수 : -9
//		양수가 아니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		else {
			System.out.println("양수가 아니다");
		}
		
	}

}
