package com.kh.day04.exercise;

import java.util.Scanner;

public class Execise_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("���� �ϳ� �� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		//������ �Ǻ� �� ���� ���� �׸��� ��� ����
		
		switch(operator) {
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
		System.out.println("��� : " + num1 + operator + num2 + "=" + result);
						//���ڿ��� �� �־���� �ȳ����� operator�� �ڵ�����ȯ�ż�
						//�ڵ����� ����� �Ͼ��.
						//ex)num1 + operator + num2��� ����
				
	
		
		
		
	}

}
