package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		int a = 1;
		int sum = 0;
		while (a < 100) {
			sum += 1;
			a += 2;
		}
		System.out.print("�հ� : " + sum);

	}

}
