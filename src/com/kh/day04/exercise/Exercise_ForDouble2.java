package com.kh.day04.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) {
		//0�� 0�к��� 23�� 59�б��� ����ϱ�!
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {				
				//System.out.println(i + "�� " + j + "��");
				System.out.printf("%d�� %d��\n",i,j);
			}
		}
	}
}
