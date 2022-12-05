package com.kh.day09.overriding;

public class Line extends Shape{
	//오버라이딩 하겠습니다
	@Override
	public void draw() {	//얘는 완전 똑같이 써줘야해
		System.out.println("Line");	//얘를 재정의해줌
	}
}
