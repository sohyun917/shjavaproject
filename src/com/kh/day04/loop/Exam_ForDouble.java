package com.kh.day04.loop;

public class Exam_ForDouble {
	//구구단을 2단부터 9단까지 전부 출력해라.
	public static void main(String [] args) {
		for(int j =2; j < 10; j++) {
			for(int i =1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + j*i);
			}
		}
	}
}
