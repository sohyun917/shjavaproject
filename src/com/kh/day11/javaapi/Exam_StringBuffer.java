package com.kh.day11.javaapi;

public class Exam_StringBuffer {
	public static void main(String [] args) {
		//StringBuffer : 문자열을 연결해주는 클래스
		//문자열 연결해주는 또다른 메소드 : concat
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		//toString으로 문자를 만들어준 다음에 출력하는거야
		System.out.println("연결된 문자열 : " + sb.toString());
		
		StringBuffer stb = new StringBuffer().append("KH").append(" Java Class").append(" F Class").append(" Hot");
		System.out.println("연결된 문자열 : " + stb.toString());
	}
}
