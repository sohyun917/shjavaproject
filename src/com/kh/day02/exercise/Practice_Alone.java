package com.kh.day02.exercise;

import java.util.Random;
import java.util.Scanner;

public class Practice_Alone {
	public static void main(String [] args) {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				sum = sum + i;
			}
		}System.out.println(sum);
	}

}
