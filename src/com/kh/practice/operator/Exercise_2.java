package com.kh.practice.operator;

import java.util.Scanner;

public class Exercise_2 {
	public static void main(String [] args) {
//		Q.¦Ȧ�Ǻ�1
//		Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
//
//		ex.
//		���� : 5
//		Ȧ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦����");
		}
		else {
			System.out.println("Ȧ����");
		}

	}
	

}
