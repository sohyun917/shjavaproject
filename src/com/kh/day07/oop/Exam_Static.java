package com.kh.day07.oop;

class StaticSample{
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	public void goodMethod() {
		input = 30;
	}
	
	public static int input;	//static���� �Ǿ��ֱ� ������ input������ ������ ���Ǿ ������ ���� �ʴ´�.
	public static void originMethod() {
		input = 5;
	}
}
public class Exam_Static {
	public static void main(String [] args) {
//		new StaticSample().num = 10;  ->num�� static�� �ƴ϶� new�� �ٿ��� ����ؾ���.
		StaticSample.input = 10;
		
		StaticSample s1;
		s1 = new StaticSample();	//static�̶�� new���� �ٷ� ����� �����ϴ�.
		System.out.println(s1.input);
		StaticSample.originMethod();	//Ŭ�������� �ٷ� �ҷ��ͼ� ��.
		System.out.println(s1.input);
		
		int value =  Math.abs(-5);	//abs = ���밪���ϱ�~
		System.out.println("�� : " + value);
	}

}
