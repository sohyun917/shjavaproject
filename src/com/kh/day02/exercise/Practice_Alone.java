package com.kh.day02.exercise;

import java.util.Random;
import java.util.Scanner;

public class Practice_Alone {
	public static void main(String [] args) {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				sum = sum + i;
			}
		}System.out.println(sum);
	}

}
