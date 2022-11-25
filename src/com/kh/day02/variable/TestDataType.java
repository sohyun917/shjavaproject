package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		// 정수part
		byte bNum = 127; //-128~127
		short sNum = 32767; //-32768~32767
		int iNum = 2147483647; //-2147483648~2147483647
		long lNum = 2147483649l; //접미사 l을 붙여야함.
		short num = 128;
		// 실수part
		float fNum = 22.1123f; //접미사 f를 붙여야함.
		double dNum = 23.502;
		// 문자part
		 char fChar= 'A'; //홑따옴표 안에는 1개의 문자
		String sChar = "Hello Java"; //쌍따옴표 안에는 여러개의 문자.
		// Boolean형
		boolean result = false;
		// 1>0, 2<1
		
		System.out.println("정수의값 :" + iNum);
		System.out.println("정수의값(9999억) :" + lNum);
		System.out.println("실수의값 : " + fNum);
		System.out.println("실수의값 :" + dNum);
		System.out.println("문자의값 :" + fChar);
		System.out.println("문자의값 :" + sChar);
		System.out.println("논리의값 :" + result);
		
		fChar = 66;
		System.out.println("문자에 숫자 :" + fChar);
		fChar = 75;
		System.out.println("문자에 숫자2 :" + fChar);
		//문자(char)는 숫자를 저장할 수 있고 ASCII코드에
		//매핑되어있는 문자로 출력이 가능하다.
		
		
		
	}
}
