package com.kh.day09.overriding;

public class Line extends Shape{
	//�������̵� �ϰڽ��ϴ�
	@Override
	public void draw() {	//��� ���� �Ȱ��� �������
		System.out.println("Line");	//�긦 ����������
	}
}
