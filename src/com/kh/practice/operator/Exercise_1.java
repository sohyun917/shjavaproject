package com.kh.practice.operator;

import java.util.Scanner;

public class Exercise_1 {
	public static void main(String [] args) {
		//Q. 정수판별1
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“
//		양수가 아닌 경우 중에서 0이면 “0이다“
//		0이 아니면 “음수다”를 출력하세요.
//
//		ex.
//		정수 : -9
//		음수다
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 : ");
		int Num = sc.nextInt();
		
		if(Num > 0) {
			System.out.println("양수다");
		}
		else if(Num == 0) {
			System.out.println("0이다");
		}
		else if(Num < 0) {
			System.out.println("음수다");
		}
	
		
	}

}
