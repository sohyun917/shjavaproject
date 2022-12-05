package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String [] args) {
		Person p;
		Student s = new Student("일용자");
//		p = new Person("");
		p = s; //업캐스팅
		
		System.out.println(p.name); 
		
		// 자식클래스인 Student클래스의 값들은 사용할 수 없다.
//		System.out.println(p.grade);
//		System.out.println(p.department);
		
		// 다운캐스팅
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		// Student객체를 꺼내서 사용합니다.
	}
}
