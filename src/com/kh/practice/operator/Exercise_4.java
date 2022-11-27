package com.kh.practice.operator;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String [] args) {
//		Q.조건판별1
//		키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)
//
//		ex.
//		정수1 : 4
//		정수2 : 11
//		입력 : 13
//		true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1) || (num3 > num2);
		System.out.println(result);
		
	}

}
