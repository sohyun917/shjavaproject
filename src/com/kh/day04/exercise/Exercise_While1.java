package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int a = 1;
		int sum = 0;
		while (a < 100) {
			sum += a;
			a += 2;
		}
		System.out.print("합계 : " + sum);

	}

}
