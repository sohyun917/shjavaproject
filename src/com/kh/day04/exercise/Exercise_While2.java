package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] args) {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9������ ���� ����
		// �� ���� �������� ����ϼ���.
		// ��, ������ ���� ������ "1 ~ 9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		if((num >= 1) && (num <= 9)) {
			int i = 1;
			while (i <=9) {
				System.out.println(num + " * " + i + " = " + num*i);
				i++;  //�ڡڡ��߿�ڡڡ�
			}
		}
		else {
			System.out.println("1 ~ 9������ ����� �Է��Ͽ��� �մϴ�.");
		}
		
	}

}
