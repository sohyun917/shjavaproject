package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main (String [] args) {
		// �Է¹��� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���!
		// ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		// ���� �빮�� Ȯ�� : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		char word = sc.next().charAt(0);
		// 65 <= word <= 90�̸� �빮��(ASCII�ڵ带 �̿��ؾ� Ǯ �� �ִ� ����)
		boolean result = (65 <= word) && (word <= 90);
		System.out.println("���� �빮�� Ȯ�� : " + result);
		
	}

}
