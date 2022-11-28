package com.kh.day04.loop;

public class Exam_While {
	public static void main(String [] args) {
		int i = 0; //while문은 안에서 변수선언 안됨
		while(i < 10) {
			System.out.print(i);
			i++;
		}
		System.out.println(); //개행을 위해 씀
		int j = 9;
		while(j >= 0) {
			System.out.print(j);
			j--;
		}
	}

}
