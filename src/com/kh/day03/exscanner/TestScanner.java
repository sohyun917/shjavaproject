package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main (String [] args) {
		//이름을 입력해주세요.
		//민봉식
		//태어난 월을 입력해주세요.
		//9
		//키를 입력해주세요.
		//180.0
		//성별을 입력해주세요.
		//남
		//주소를 입력해주세요.
		//서울시 종로구
		Scanner sc = new Scanner (System.in);
		System.out.println("이름을 입력해주세요. ");
		String name = sc.next(); //얘는 공백을 입력받지 않아. 그래서 서울시 종로구 라고 쓰면 서울시까지만 나옴.
		
		System.out.println("태어난 월을 입력해주세요. ");
		int month = sc.nextInt();
		
		System.out.println("키를 입력해주세요. ");
		double height = sc.nextDouble();
		
		System.out.println("성별을 입력해주세요. ");
		char gender = sc.next().charAt(0);
		
		System.out.println("주소를 입력해주세요. ");
		sc.nextLine(); //엔터를 제거하기 위함.
		String address = sc.nextLine(); //엔터를 입력받아서 혼자 종료되는것.(얘만 엔터를 입력받는다)
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println ("주소는 " + address + "입니다.");
		
	}
	
}
