package com.kh.day09.insof;

public class InstanceOfEx {
	
	static void print(Person p) {
		//print는 Person객체를 만나야만 print됩니다.
//		if(p instanceof Person)
//			System.out.println("Person입니다!");
		if(p instanceof Student)
			System.out.println("Student입니다!");
		if(p instanceof Resercher)
			System.out.println("Resercher입니다!");
		if(p instanceof Professor)
			System.out.println("Professor입니다!");
	}
	
	public static void main(String [] args) {
		print(new Person());
		print(new Student());
		print(new Resercher());
		print(new Professor());
	}
}
