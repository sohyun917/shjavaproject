package com.kh.day07.student;
//���� �����ϴ� �뵵�� ���� Ŭ����
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
	//���� ����� �ְ� ���� set��ĵ� �ִ�.
	//setter�޼ҵ�
	//������� ���� �ʱ�ȭ
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
	//getter�޼ҵ�
	//������� �� ����
	public String getName() {
		return this.name;
	}	//private�Ǿ��ִ� ���� �������� ����
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
