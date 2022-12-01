package com.kh.day07.oop;

class Sample{	//(패키지 뉴 클래스) 하는거랑 똑같은 과정
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String [] args) {
		Sample aClass = new Sample();	//샘플 객체가 aClass라는 변수에 들어간다.
		aClass.a = 10; //접근 가능하다. public이니까
//		aClass.b = 10; //is not visible. 불가능하다. private이니까
		aClass.c = 10; //접근 가능하다. default니까
	}

}
