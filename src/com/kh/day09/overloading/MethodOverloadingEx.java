package com.kh.day09.overloading;

class Weapon{
	
	//�����ڵ� �����ε��Ȱ��̾���
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
	//�����ε�(������ �ڱ��ڽſ��� �ϵ� �Ű������� Ÿ���̳� ������ �ٸ��� �Ѵ�)
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
	//�������̵�
	protected int fire() {
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String [] args) {
	}
}
