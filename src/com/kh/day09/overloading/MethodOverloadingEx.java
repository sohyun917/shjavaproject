package com.kh.day09.overloading;

class Weapon{
	
	//생성자도 오버로딩된것이었다
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	
	protected int fire() {
		return 1;
	}
	//오버로딩(복붙을 자기자신에게 하되 매개변수의 타입이나 갯수를 다르게 한다)
	protected int fire(int steampack) {
		return steampack*100;
	}
	protected int fire(int steampack, int medicine) {
		return steampack+medicine;
	}
	protected int fire(String steampack) {
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon{
	//오버라이딩
	protected int fire() {
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String [] args) {
	}
}
