package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		//Shape p = new Line;
		p.draw();	//������ �θ�Ŭ������ ����Ǿ�� ������
	}
	
	public static void main(String [] args) {
		Line line = new Line();	//������ �����Ȱ� Line��ü�� ������
//		line.draw();
		paint(line);	//�������ε��ż�
		paint(new Rect());
		paint(new Circle());
	}
}
