package com.kh.day10.interfaceex;

//구현하고나서 오버라이딩해줘야해.
public class SamsungPhone implements PhoneInterface{

	//추상메소드들을 오버라이딩해줬다.
	@Override
	public void sendCall() {
		System.out.println("뚜루루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야");
	}

	@Override
	public void printLogo() {
		System.out.println("====== Samsung ======");
	}

	@Override
	public void displayNumber() {
		System.out.println("내 휴대전화 정보 : xxx-xxxx-xxxx");
	}	//interface를 구현해서 만들 클래스
	
	public void flash() {
		System.out.println("반짝반짝 불이 켜졌습니다.");
	}
	
}
