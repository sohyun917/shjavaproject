package com.kh.day07.oop;

public class Circle { 	//클래스 선언(class Circle), 클래스 접근 권한(public)
	public int radius; 	//전역변수, 클래스변수
	public String name; //위 아랫줄 묶어서필드라고 부름.(Circle클래스의 필드)
	
	//클래스명과 이름이 같은 메소드 ->생성자라고 부른다.
	//2.객체 생성
	//3.필드 초기화(초기화는 생성자에서)
	public Circle() {
		this.radius = 1;
		this.name = "원";	//이게 초기화하는 과정
	}
	
	public double getArea() {	//()있으면 메소드라고 생각하면 된다.
		return 3.14*radius*radius; 	//반환형이 있는 형태
									//(return이라고 적혀있으면 위에 void라고 적으면 안된다.
//		double area = 3.14*radius*radius;//return값의 자료형을 void위치에 적어주는거야.)
//		return area;	//위 처럼 적어도 되고 아래처럼 적어도 된다.
	}

}
