package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		// 입력한 정수가 1~100사이의 숫자인지 확인하세요!
		// 50이라는 숫자는 변수 num에 초기화해주세요
		// 1부터 100사이의 숫자인가? : true
		
		//int num = 50;
		//boolean result;
		//result = (num > 1) && (num < 100);
		//System.out.println("1부터 100사이의 숫자인가? : " + result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int iNum = sc.nextInt();
		boolean result = (iNum > 1) && (iNum < 100);
		System.out.println("1부터 100사이의 숫자인가? : " + result);
		
		
		
		
	}

}
