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
//		**********(10개)
		int num = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < num; j++) { //이미 위에서 증가하는 값이 있기 때문에 따로 num이라는 변수를 사용하지 않고 i+1를 사용가능.
				System.out.print("*");				
			}
			System.out.println("");
			num++;
		}
	}
}
