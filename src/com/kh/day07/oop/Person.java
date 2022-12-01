package com.kh.day07.oop;

public class Person {
	//객체
	private String name;	//이름 사용 불가능.(캡슐화) private은 같은 클래스 내에서만 사용 가능.
	String jobName;			//직업
	int age;				//나이 같은 패키지내에서만 사용가능.(private, public둘 다 없는경우.)
	char gender;			//성별
	String bloodType;		//혈액형
	
	public Person() {}
	//메소드
	public void eat() {}	//사람의 행동들
	
	public void sleep() {}
	
	public void speak() {}
	
	public void walking() {}

}
