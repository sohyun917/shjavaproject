package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		 *  �ڵ��ּ�(���� �� �Ѳ����� �� ��)
		 * ���׿�����
		 * �׸��� 3��
		 * (���ǽ�) ? ���� �� : ������ ��
		 * -���ǽ��� �ݵ�� true of false�� ��ȯ
		 * -��/�������� �ַ� ���
		 */
//		(num1 > num2) ? "��" : "����";
		//������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷� �ۼ��ϱ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		//¦���Ǻ�
		String result = (input % 2 == 0) ? "¦��" : "Ȧ��"; //����� ���� ���ͷ��� �����ϱ����� ��������
		//�Ǻ� �� ���
		System.out.println(input + "��/��" + result + "�Դϴ�.");
		
		//���� �ϳ� �Է� : 34
		//34��/�� ¦���Դϴ�.
	}

}
