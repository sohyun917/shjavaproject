package com.kh.day10.abstractex;

class Line extends Shape{	//�߻�޼ҵ带 �������̵��ϰų� �ƴϸ� LineŬ������ �߻�Ŭ������ ����������.

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

public abstract class Shape {
	public Shape() {}	//������
	public void paint() {}
	abstract public void draw();
//	The abstract method draw in type Shape 
//	can only be defined by an abstract class
	//�߻�޼ҵ带 �����ϰ� ������ Ŭ������ �߻�Ŭ������ �ٲ������.
}
