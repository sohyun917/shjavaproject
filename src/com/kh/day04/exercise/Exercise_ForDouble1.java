package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		//2�� ���� 3��, 3�� ���� 4��, 4�� ���� 5���� �ǵ��� �ۼ��Ͻÿ�.
		//2 * 1 = 2	    3 * 1 = 3     4 * 1 = 4
		//2 * 2 = 4     3 * 2 = 6     4 * 2 = 8
		for(int j = 1; j < 10; j++) { //�� �ٰ�
			for(int i = 2; i < 10; i++) { //�� ���� ������ �ٲ�� ��°��� �ٲ��.
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}

}
