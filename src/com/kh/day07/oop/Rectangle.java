package com.kh.day07.oop;

public class Rectangle {
	public int width;		//�ʺ�
	public int height;		//����
	
	public Rectangle() {}	//������(��ü����, ��ü�ʱ�ȭ�� ���)
	
	//�Ű����� �ִ� ������(���ް��� ���� �� �ִ� ������)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//��ȯ���� �ִ� �޼ҵ�(void�� int�� �ٲ���)
	//getArea�� ȣ���� ������ ���� ������(�����Ѵ�)
	public int getArea() {
		int area = width*height;	//���� ������� �ʰ� ������ �־���
		return area;
	}

}
