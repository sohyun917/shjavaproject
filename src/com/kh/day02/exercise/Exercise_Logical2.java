package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main (String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 단, A라는 문자는 변수 word에 초기화해주세요.
		// 영어 대문자 확인 : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		char word = sc.next().charAt(0);
		// 65 <= word <= 90이면 대문자(ASCII코드를 이용해야 풀 수 있는 문제)
		boolean result = (65 <= word) && (word <= 90);
		System.out.println("영어 대문자 확인 : " + result);
		
	}

}
