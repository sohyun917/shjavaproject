package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile {
	public static void main(String [] args) {
		//�Է��� ���� -1�� �� ������ ��� �Է��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}while(num != -1);
	}

}
