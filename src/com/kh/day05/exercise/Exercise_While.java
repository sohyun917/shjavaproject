package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	
	public void exercise1() {//for랑은 클래스가 다르니까 exercise1을 같이 써도 무방함.
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int a = 1;
		int sum = 0;
		while (a < 100) {
			sum += 1;
			a += 2;
		}
		System.out.print("합계 : " + sum);
	}
	
	public void exercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if((num >= 1) && (num <= 9)) {
			int i = 1;
			while (i <=9) {
				System.out.println(num + " * " + i + " = " + num*i);
				i++;  //★★★중요★★★
			}
		}
		else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}
	
	public void exercise3() {
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
//		-1이 입력되면 입력한 수의 합을 출력하시오.
//		정수 하나 입력 : 3
//		정수 하나 입력 : 4
//		정수 하나 입력 : 7
//		정수 하나 입력 : -1
//		입력하신 수의 합은 : 14
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 하나 입력 : ");
//		int input = sc.nextInt();
		int input = 0;
		int sum = 0;
		while(true) {
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
			//입력한 값을 더하고, 
			//입력한 값이 -1이면 더하지 않고 무한반복 빠져나오기!
			if(input == -1) break;
			sum += input;
		}
		System.out.println("입력하신 수의 합은 : " + sum);
		
//		while (input != -1) { // num이 -1이 아니면 true -> -1이 입력되기 전까지 돈다
//			System.out.print("정수 하나 입력 : ");
//			input = sc.nextInt();
//			if(input != -1) {
//			sum += input;
//			}
//		}
//		System.out.println("입력하신 수의 합은 : " + sum);
	}
}
