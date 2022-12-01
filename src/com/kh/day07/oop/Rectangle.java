package com.kh.day07.oop;

public class Rectangle {
	public int width;		//너비
	public int height;		//높이
	
	public Rectangle() {}	//생성자(객체생성, 객체초기화를 담당)
	
	//매개변수 있는 생성자(전달값을 받을 수 있는 생성자)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//반환형이 있는 메소드(void를 int로 바꿔줌)
	//getArea를 호출한 곳으로 값을 보낸다(리턴한다)
	public int getArea() {
		int area = width*height;	//값이 사라지지 않게 변수에 넣어줌
		return area;
	}

}
