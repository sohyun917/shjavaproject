package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main (String [] args) {
		//�̸��� �Է����ּ���.
		//�κ���
		//�¾ ���� �Է����ּ���.
		//9
		//Ű�� �Է����ּ���.
		//180.0
		//������ �Է����ּ���.
		//��
		//�ּҸ� �Է����ּ���.
		//����� ���α�
		Scanner sc = new Scanner (System.in);
		System.out.println("�̸��� �Է����ּ���. ");
		String name = sc.next(); //��� ������ �Է¹��� �ʾ�. �׷��� ����� ���α� ��� ���� ����ñ����� ����.
		
		System.out.println("�¾ ���� �Է����ּ���. ");
		int month = sc.nextInt();
		
		System.out.println("Ű�� �Է����ּ���. ");
		double height = sc.nextDouble();
		
		System.out.println("������ �Է����ּ���. ");
		char gender = sc.next().charAt(0);
		
		System.out.println("�ּҸ� �Է����ּ���. ");
		sc.nextLine(); //���͸� �����ϱ� ����.
		String address = sc.nextLine(); //���͸� �Է¹޾Ƽ� ȥ�� ����Ǵ°�.(�길 ���͸� �Է¹޴´�)
		
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + month + "�Դϴ�.");
		System.out.println("Ű�� " + height + "�Դϴ�.");
		System.out.println("������ " + gender + "�Դϴ�.");
		System.out.println ("�ּҴ� " + address + "�Դϴ�.");
		
	}
	
}
