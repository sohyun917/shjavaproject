package com.kh.day09.point;

public class ColorPointEx {
	public static void main(String [] args) {
		//ColorPoint cp = new ColorPoint();
		//The constructor ColorPoint() is undefined
		//(ColorPoint�� �Ű����������ڰ� �ְ� �⺻�����ڰ� ��� �׷��ž�.)
//		cp.set(3, 4);	//Point�� set() ȣ��
//		cp.setColor("red");	//ColorPoint�� setColor() ȣ��
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint(); //�÷��� ��ǥ ���
	}
}
