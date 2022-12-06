package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = "";	//public(static final)String 저렇게 생략된것.
//	name = "Hello World"; //상수값이라서 바뀌지 않음.(고정된 값)
	public static final int TIME_OUT = 10000;	//글씨가 기울어진 이유는 static이라서
	public abstract void sendCall();
	public abstract void receiveCall();
	abstract void printLogo() ;	//public이나 abstract는 생략가능.
	void displayNumber();
	public default void showLogo() {	//디폴트 메소드
		//하위호환성을 위해서 작성한다.
		//즉, 하위호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
