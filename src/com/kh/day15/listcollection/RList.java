package com.kh.day15.listcollection;

public class RList<T> {	//제네릭 : 아무거나 다 들어간다는 의미. Object리스트처럼.
	private Object [] objects;
	private int size;
	
	public RList() {
		objects = new Object [3];
		size = 0;
	}
	
	public void add(T input) {
		objects[size] = input;
		size++;
	}
	//리턴값이 있으면 리턴값의 자료형을
	//메소드 반환형에 적어줌.
	public T get(int index) {
		return (T) objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
