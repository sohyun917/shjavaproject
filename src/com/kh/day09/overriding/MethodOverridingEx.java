package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		//Shape p = new Line;
		p.draw();	//원래는 부모클래스가 실행되어야 하지만
	}
	
	public static void main(String [] args) {
		Line line = new Line();	//실제로 생성된건 Line객체기 때문에
//		line.draw();
		paint(line);	//동적바인딩돼서
		paint(new Rect());
		paint(new Circle());
	}
}
