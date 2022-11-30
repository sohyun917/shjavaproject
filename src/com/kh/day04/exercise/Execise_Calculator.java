package com.kh.day04.exercise;

import java.util.Scanner;

public class Execise_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		//연산자 판별 후 연산 수행 그리고 결과 저장
		
		switch(operator){
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '%' :
				result = num1 % num2;
				break;
		}
		System.out.println("결과 : " + num1 + operator + num2 + "=" + result);
						//문자열을 꼭 넣어야해 안넣으면 operator가 자동형변환돼서
						//자동으로 계산이 일어난다.
						//ex)num1 + operator + num2라고만 쓰면
				
	
		
		
		
	}

}
