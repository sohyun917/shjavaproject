package com.kh.day07.oop;

class StaticSample{
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	public void goodMethod() {
		input = 30;
	}
	
	public static int input;	//static으로 되어있기 때문에 input변수가 위에서 사용되어도 오류가 나지 않는다.
	public static void originMethod() {
		input = 5;
	}
}
public class Exam_Static {
	public static void main(String [] args) {
//		new StaticSample().num = 10;  ->num은 static이 아니라 new를 붙여서 사용해야해.
		StaticSample.input = 10;
		
		StaticSample s1;
		s1 = new StaticSample();	//static이라면 new없이 바로 사용이 가능하다.
		System.out.println(s1.input);
		StaticSample.originMethod();	//클래스에서 바로 불러와서 씀.
		System.out.println(s1.input);
		
		int value =  Math.abs(-5);	//abs = 절대값구하기~
		System.out.println("값 : " + value);
	}

}
