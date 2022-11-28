package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		//2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		//2 * 1 = 2	    3 * 1 = 3     4 * 1 = 4
		//2 * 2 = 4     3 * 2 = 6     4 * 2 = 8
		for(int j = 1; j < 10; j++) { //이 줄과
			for(int i = 2; i < 10; i++) { //이 줄의 순서가 바뀌면 출력값도 바뀐다.
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}

}
