package com.kh.day04.exercise;

import java.util.Scanner;

public class Execise_CalculatorFor {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); // �� �غ��� �ݺ��� ����
		int count = 0;
		for(;;) { //���ѹݺ��� ���� �Լ�
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
			count++; //��¿� �������� �� ī��Ʈ ��!�ϰ�
			if(count == 3)
				break; //3�� �ݺ��ϰ� �����ڴ�.
		}
						//���ڿ��� �� �־���� �ȳ����� operator�� �ڵ�����ȯ�ż�
						//�ڵ����� ����� �Ͼ��.
						//ex)num1 + operator + num2��� ����
				
	
		
		
		
	}

}
