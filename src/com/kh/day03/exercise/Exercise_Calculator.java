package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args) {
		// 두 개의 정수를 입력받고 연산자를 입력받아서
		// 계산하는 계산기 프로그램을 작성하세요!
		// 정수를 입력해주세요 : 11
		// 정수를 한번 더 입력해주세요 : 22
		// 연산자를 입력해주세요(+,-,*,/,%) : %
		// 결과 : 11 % 22 = 11
		
		// 1.정수 하나 입력
		// 2.정수 하나 더 입력받음
		// 3.연산자 입력 받음
		// 4. 연산자 판별 후 연산 수행 후 결과 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 한번 더 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0; //오류가 발생할 수 있기 때문에 초기화를 꼭 해줘야해
		if (operator == '+') {
			result = num1+num2;
		}
		else if (operator == '-') {
			result = num1-num2;
		}
		else if (operator == '*') {
			result = num1*num2;
		}
		else if (operator == '/') {
			result = num1/num2;
		}
		else if (operator == '%') {
			result = num1%num2;
		}		
		System.out.println("결과 : " + num1 + operator + num2 + "=" + result);
	}

}
