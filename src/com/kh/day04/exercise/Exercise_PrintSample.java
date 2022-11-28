package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main(String [] args) {
		//System.out.println에서 정수 + 문자열 -> 문자열
		System.out.println(1 + "1");
		//문자 + 문자 -> 문자
		System.out.println('1' + '1');
		//정수 + 정수 + 문자열 + 정수 -> 최종적으로는 문자열
		System.out.println(10 + 20 + "Hello" + 10);
		
		//printf에 대하여 알아보자
		//println, print -> 줄바꿈의 차이
		System.out.print("정수 입력 : "); //바로 옆에 입력받음.
		System.out.println("정수 입력 : "); //줄 바꾸고 입력받음.
		System.out.printf("정수 출력 : %d", 1); //콤마 써야하고 뒤에는 출력할 값을 적어야해
												//정수인 경우 %d를 적어줘야해
												//printf는 개행이 없다.
		System.out.printf("정수 출력 : %d \n", 1); //개행하려면 \n을 적어줘
		System.out.printf("문자열 출력 : %s", "Hello World"); //문자열인 경우 %s를 적어줘
		
			
			
	}

}
