package com.kh.day07.oop;

public class Circle { 	//Ŭ���� ����(class Circle), Ŭ���� ���� ����(public)
	public int radius; 	//��������, Ŭ��������
	public String name; //�� �Ʒ��� ����ʵ��� �θ�.(CircleŬ������ �ʵ�)
	
	//Ŭ������� �̸��� ���� �޼ҵ� ->�����ڶ�� �θ���.
	//2.��ü ����
	//3.�ʵ� �ʱ�ȭ(�ʱ�ȭ�� �����ڿ���)
	public Circle() {
		this.radius = 1;
		this.name = "��";	//�̰� �ʱ�ȭ�ϴ� ����
	}
	
	public double getArea() {	//()������ �޼ҵ��� �����ϸ� �ȴ�.
		return 3.14*radius*radius; 	//��ȯ���� �ִ� ����
									//(return�̶�� ���������� ���� void��� ������ �ȵȴ�.
//		double area = 3.14*radius*radius;//return���� �ڷ����� void��ġ�� �����ִ°ž�.)
//		return area;	//�� ó�� ��� �ǰ� �Ʒ�ó�� ��� �ȴ�.
	}

}
