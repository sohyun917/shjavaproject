package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {
	public static void main(String [] args) {
		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.lottoProgram();
		Person person = new Person(); //new�� �����ڸ� ���� ������ ��ü�� �������ش�?
//		person.eat();
//		person.sleep();
//		person.walking();
//		person.speak();
//		person.name = "�Ͽ���";
		
		Scanner sc = new Scanner(System.in);
		//���۷��� ���� ����(�ּҰ� ����Ǵ� ����)(Rectangle rect)
		Rectangle rect = new Rectangle();	//��ü����, �ݵ�� newŰ���� �̿�
											//new�� ��ü�� ������ ȣ��
		System.out.print("�ʺ� �Է����ּ��� : ");
		//��ü(rect)�� ��� ����(����� �����δ� ��������� ����޼ҵ�)
		//�ν��Ͻ�(Rectangle Ŭ������ ��ü)��� ��
		rect.width = sc.nextInt();	//��ü�� ��� ������ .���� �Ѵ�.(��� ������� ����)
		System.out.print("���̸� �Է����ּ��� : ");
		rect.height = sc.nextInt();	//������� ����
		int result = rect.getArea();//����޼ҵ� ����
		System.out.println("�簢���� ������ : " + result);		
	}

}
