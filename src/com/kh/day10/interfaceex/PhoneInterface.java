package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = "";	//public(static final)String ������ �����Ȱ�.
//	name = "Hello World"; //������̶� �ٲ��� ����.(������ ��)
	public static final int TIME_OUT = 10000;	//�۾��� ������ ������ static�̶�
	public abstract void sendCall();
	public abstract void receiveCall();
	abstract void printLogo() ;	//public�̳� abstract�� ��������.
	void displayNumber();
	public default void showLogo() {	//����Ʈ �޼ҵ�
		//����ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		//��, ����ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}
}
