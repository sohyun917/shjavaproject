package com.kh.practice.operator;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String [] args) {
//		Q.�����Ǻ�1
//		Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
//		�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ� �ƴϸ� false�� ����ϼ���. (��, num1�� num2���� �۾ƾ� ��)
//
//		ex.
//		����1 : 4
//		����2 : 11
//		�Է� : 13
//		true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1) || (num3 > num2);
		System.out.println(result);
		
	}

}
