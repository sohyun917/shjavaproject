package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("int값을 입력해 주세요 : "); //이 가이드메세지를 꼭 써야해
		int input1 = sc.nextInt(); //사용자가 입력한 값을 변수로 사용하는작업
		System.out.println("입력한 값 : " + input1);
		
		System.out.print("int 값을 한번 더 입력해주세요 : "); //println으로 쓰면 밑의줄에서 입력을 받게된다.
		int input2 = sc.nextInt();
		System.out.println("입력한 값 : " + input2);
		
		int result = input1 + input2;
		System.out.println("두 값의 합은 : " + result + "입니다.");
//		sc.close(); scanner를 닫는거야.
//		Scanner sc = sc.
		
		
	}

}
