package com.kh.day04.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
//		**********(10��)
		int num = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < num; j++) { //�̹� ������ �����ϴ� ���� �ֱ� ������ ���� num�̶�� ������ ������� �ʰ� i+1�� ��밡��.
				System.out.print("*");				
			}
			System.out.println("");
			num++;
		}
		
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		} ->���� ���� �ڵ�(�̰͵� �Ȱ��� ����)
	}
}
