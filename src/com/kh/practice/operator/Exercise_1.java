package com.kh.practice.operator;

import java.util.Scanner;

public class Exercise_1 {
	public static void main(String [] args) {
		//Q. �����Ǻ�1
//		Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�
//		����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�
//		0�� �ƴϸ� �������١��� ����ϼ���.
//
//		ex.
//		���� : -9
//		������
		Scanner sc = new Scanner (System.in);
		System.out.print("���� : ");
		int Num = sc.nextInt();
		
		if(Num > 0) {
			System.out.println("�����");
		}
		else if(Num == 0) {
			System.out.println("0�̴�");
		}
		else if(Num < 0) {
			System.out.println("������");
		}
	
		
	}

}
