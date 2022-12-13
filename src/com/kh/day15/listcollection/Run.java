package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String [] args) {
		//★★★★★★★★★★★★★
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());	//이런식으로 활용한다.
		
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
		//★★★★★★★★★★★★★ 저런식으로 활용하게 되므로 중요함!
		
		List<Integer> list = null;
		
		list = new ArrayList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);
		
		int size = list.size();
		System.out.println("size : " + size);
		
		System.out.println("1번째 값 : " + list.get(0));
		
		list.add(2023);
		System.out.println("size : " + list.size());
//		list.clear();
//		System.out.println("size : " + list.size());
		
		System.out.println("==== 출력하겠습니다 ====");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + list.get(i));
		}
		list.add(2, 2022);	//2번인덱스(3번째값)에 값을 추가하겠단의미
		System.out.println("==== Foreach로 출력하겠습니다 ====");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		list.set(4, 7);	//4번인덱스값을 저걸로 변경하겠다는 의미
		System.out.println("==== 다시한번 출력하겠습니다 ====");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
	}
	
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		
		int num = list.get(0);	//값을 꺼낼 때 형변환이 필요하지 않다.
		num = list.get(1);
		
		System.out.println("num : " + num);
	}
	
	public void objectExample() {
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("월");
		list.add(new Student()); //객체
		int num = (int)list.get(0);	//강제형변환해준다.(다운캐스팅해준것)
		String word = (String)list.get(1);	//꺼낼때는 반드시 다운캐스팅을 해줘야한다.
		Student sOne = (Student)list.get(2);
	}
	
	public void intExample() {
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("첫번째 : " + list.get(0));
		System.out.println("두번재 : " + list.get(1));
		System.out.println("세번째 : " + list.get(2));
		System.out.println("크기 : " + list.size());
		//삭제하기
		list.clear();
		System.out.println("크기 : " + list.size());
	}
}
