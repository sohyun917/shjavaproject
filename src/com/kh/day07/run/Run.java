package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {
	public static void main(String [] args) {
		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.lottoProgram();
		Person person = new Person(); //new에 생성자를 같이 적으면 객체를 생성해준다?
//		person.eat();
//		person.sleep();
//		person.walking();
//		person.speak();
//		person.name = "일용자";
		
		Scanner sc = new Scanner(System.in);
		//레퍼런스 변수 선언(주소가 저장되는 변수)(Rectangle rect)
		Rectangle rect = new Rectangle();	//객체생성, 반드시 new키워드 이용
											//new는 객체의 생성자 호출
		System.out.print("너비를 입력해주세요 : ");
		//객체(rect)의 멤버 접근(멤버의 종류로는 멤버변수와 멤버메소드)
		//인스턴스(Rectangle 클래스의 객체)라고도 함
		rect.width = sc.nextInt();	//객체의 멤버 접근은 .으로 한다.(얘는 멤버변수 접근)
		System.out.print("높이를 입력해주세요 : ");
		rect.height = sc.nextInt();	//멤버변수 접근
		int result = rect.getArea();//멤버메소드 접근
		System.out.println("사각형의 면적은 : " + result);		
	}

}
