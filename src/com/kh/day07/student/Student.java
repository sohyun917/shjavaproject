package com.kh.day07.student;
//값을 저장하는 용도로 만든 클래스
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//위의 방법도 있고 밑의 set방식도 있다.
	//setter메소드
	//멤버변수 각각 초기화
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	//getter메소드
	//멤버변수 값 리턴
	public String getName() {
		return this.name;
	}	//private되어있는 값을 가져오는 역할
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}

	
}
