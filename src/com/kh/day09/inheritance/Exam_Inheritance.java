package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPoint extends Point{
	void set() {	//부모의 멤버변수는 메소드 안에서!
//		pub = 1;
//		def = 2;	The field Point.def is not visible 디폴트는 다른 패키지에서는 보이지 않음.
//		pro = 3;
//		pri = 4;	The field Point.pri is not visible
	}
}

class Child extends Parent{
	void set() {
		pub = 1;
		def = 2;
		pro = 4;	//부모의 것을 갖고있기 때문에 접근이 가능.
//		pri = 5;	private은 다른 클래스에선 사용이 불가능하다.
	}
}

class Parent{
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int money = 2000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
}

public class Exam_Inheritance {
	public static void main(String [] args) {
		Child child = new Child();
		child.setMoney(3000);
		System.out.println("Parent money : " + child.getMoney());
	}
}
