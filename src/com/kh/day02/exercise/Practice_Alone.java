package com.kh.day02.exercise;

import java.util.Random;
import java.util.Scanner;

class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}

public class Practice_Alone{
	public static void main(String [] args) {
		Student s = new Student("�̼���");
		Person p = new Student("���繮"); //��ĳ����
		System.out.println(p.name);
		System.out.println(p.id);
		System.out.println(s.name);
		System.out.println(s.id);
		
		
//		Student s = (Student)p; //�ٿ�ĳ����
//		System.out.println(s.id);

	}
}
