package com.kh.day10.abstractex;

class Line extends Shape{	//추상메소드를 오버라이드하거나 아니면 Line클래스를 추상클래스로 만들어줘야해.

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

public abstract class Shape {
	public Shape() {}	//생성자
	public void paint() {}
	abstract public void draw();
//	The abstract method draw in type Shape 
//	can only be defined by an abstract class
	//추상메소드를 포함하고 있으니 클래스도 추상클래스로 바꿔줘야해.
}
