package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0; //��װ� while�� �ȿ� ������ �Է��ߴ� ���� �ٽ� �ʱ�ȭ�ż� ��°��� �ٽ� 0�̵ȴ�.
		int choice = 0;
		ESCAPE : 
		while(choice < 3) { //(�ڡڡڡڡ�)
			System.out.println("====== ���� �޴� =======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("====== ���� �Է� =======");
				System.out.print("���� : ");
				kor = sc.nextInt();
				System.out.print("���� : ");
				eng = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				break;
			case 2 :
				int sum = kor + eng + math; //sum���� case2������ ����ϴϱ� ���⼭ �����ص���.
				double avg = (double)sum / 3;
				System.out.println("====== ���� ��� ======");
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println();
				System.out.println("���� : " + sum);
				System.out.printf("��� : %.2f \n" , avg); //.2�� �Ҽ��� ���ڸ������� �ǹ���
				break;
			case 3 :
				System.out.println("Good Bye~");
				break ESCAPE; // break ���� �ܾ �Ȱ��� �ִ� ������ �ö󰡴°�.
							//while���� �ƿ� ����°�.
				default :
					System.out.println("1 ~ 3 ������ ���� �Է����ּ���~");
					break;
			}
		}
	}
}
