package com.kh.day10.zoointerface;

public class ZooKeeper {	//�Ȱ��� �ֵ��� �ʹ� �����ϱ� �������̽��� ������
	public void feed() {
		System.out.println("feed meat");
	}
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood()); //���� ������ �� �� �ٷ� ���ΰž�.
	}
//	public void feed(Tiger tiger) {
//		System.out.println("feed beef");
//	}
//	public void feed(Lion lion) {
//		System.out.println("feed gazel");
//	}
//	public void feed(Bear bear) {
//		System.out.println("feed salmon");
//	}
}
