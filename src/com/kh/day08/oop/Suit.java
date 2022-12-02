package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) 호출!"); //1
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) 호출"); //2
	}
	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,String,int) 호출"); //3
	}

}	//3->2->1순으로 호출된다.
//
//20번째 줄이 실행됨과 동시에 13번 실행이 끝남
//13번 실행이 끝나면서 14번이 실행되고 동시에 9번실행이 끝남
//9번 실행이 끝나면서 10번 실행이 실행됨.
