package com.kh.day10.zoointerface;

public class ZooKeeper {	//똑같은 애들이 너무 많으니까 인터페이스로 묶어줘
	public void feed() {
		System.out.println("feed meat");
	}
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood()); //밑의 세줄을 이 한 줄로 줄인거야.
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
