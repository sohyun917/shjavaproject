package com.kh.day06.exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �ϳ� �Է����ּ��� : ");
			int num1 = sc.nextInt();
			System.out.print("���� �ϳ� �� �Է����ּ��� : ");
			int num2 = sc.nextInt();
			System.out.println("�����帱�Կ�^^ ");
			int result = num1 / num2; //���ܰ� �߻��ϴ� �ָ� try�ȿ� �־ ��.
			System.out.println("���� " + result + "�Դϴ�");		
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵſ�!");
		}
	}

}
