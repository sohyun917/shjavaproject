package com.kh.day11.javaapi;

public class Exam_StringBuffer {
	public static void main(String [] args) {
		//StringBuffer : ���ڿ��� �������ִ� Ŭ����
		//���ڿ� �������ִ� �Ǵٸ� �޼ҵ� : concat
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		//toString���� ���ڸ� ������� ������ ����ϴ°ž�
		System.out.println("����� ���ڿ� : " + sb.toString());
		
		StringBuffer stb = new StringBuffer().append("KH").append(" Java Class").append(" F Class").append(" Hot");
		System.out.println("����� ���ڿ� : " + stb.toString());
	}
}
