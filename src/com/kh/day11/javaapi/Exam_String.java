package com.kh.day11.javaapi;

public class Exam_String {
	public static void main(String [] args) {
		String msg = "Hello Java";
		msg = new String("Hello J");	//������ �̷� ����� ���ļ� �����ǵ� ������ �Ѱ�
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1 + "�� ���̴� " + data1.length());
		System.out.println(data2 + "�� ���̴� " + data2.length());
		System.out.println("#�� �ִ°�? : " + data1.contains("#"));
		//contains�޼ҵ�� ������ ���ڰ� ����ִ��� �ƴ��� true/false�� �˷��ش�.
		
		//���ڿ� ����
		data1 = data1.concat(data2);	//C#,C++
		System.out.println("����� ���ڿ� : " + data1);
		
		//��������
		data1 = data1.trim();
		System.out.println("���� ���� Ȯ�� : " + data1);
		
		//c# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("���ڿ� ��ü : " + data1);
		
		//���ڿ� �и�(�ڡڡڡڡ�)
		//�� �ڵ���� ����ǰ� ���� data1�� JAVA,C++�� ����
		String [] words = data1.split(",");		//,�� ������ �迭�� ��������
		for(int i = 0; i < words.length; i++) {
			System.out.println("�и��� ���ڿ� : " + i + " : " + words[i]);
		}
		
		//���ڿ� �ڸ���
		//JAVA,C++���� 5��° ���� �߶� ���°�
//		data1 = data1.substring(5);
//		System.out.println("���ڿ� �ڸ��� : " + data1);
		//1���ε������� 4������ 3���ε������� �߶�´�.
		data1 = data1.substring(1, 4);
		System.out.println("������ �ڸ��� : " + data1);
		
		char word = data1.charAt(0);
		System.out.println("���� �ڸ��� : " + word);
	}
}
