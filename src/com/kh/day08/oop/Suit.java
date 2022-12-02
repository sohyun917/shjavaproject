package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) ȣ��!"); //1
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) ȣ��"); //2
	}
	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,String,int) ȣ��"); //3
	}

}	//3->2->1������ ȣ��ȴ�.
//
//20��° ���� ����ʰ� ���ÿ� 13�� ������ ����
//13�� ������ �����鼭 14���� ����ǰ� ���ÿ� 9�������� ����
//9�� ������ �����鼭 10�� ������ �����.
