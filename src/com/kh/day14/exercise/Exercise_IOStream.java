package com.kh.day14.exercise;

import java.util.Scanner;

public class Exercise_IOStream {
	public static void main(String [] args) {
		/*
		 * 1. 정보입력
		 * 2. 정보출력
		 * 3. 정보저장(save)
		 * 4. 정보불러오기(load)
		 * 0.종료
		 * 메뉴입력 : 1
		 * 
		 * 이름입력 : 일용자
		 * 나이입력 : 33
		 * 주소입력 : 서울시 종로구
		 * 
		 * 1. 정보입력
		 * 2. 정보출력
		 * 3. 정보저장(save)
		 * 4. 정보불러오기(load)
		 * 0.종료
		 * 메뉴입력 : 2
		 * 
		 * 이름 : 일용자
		 * 나이 : 33
		 * 주소 : 서울시 종로구
		 * 
		 * 3을 선택해서 저장 후 파일을 열어보면
		 * 일용자/33/서울시 종로구 라고 저장되어있게
		 * 
		 * 단, 파일의 이름은 이름으로 한다.(일용자.txt)
		 * 
		 * 4. 선택 후 파일의 제목을 입력하여 로드한 후에
		 * 2. 선택하면 정보가 출력됨
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장(save)");
		System.out.println("4. 정보불러오기(load)");
		System.out.println("0. 종료");
		System.out.print("메뉴입력 : ");
		int input = sc.nextInt();
		
	}
	
	static void insert() {}
	
	static void print() {}
	
	static void save() {}
	
	static void load() {}
}
