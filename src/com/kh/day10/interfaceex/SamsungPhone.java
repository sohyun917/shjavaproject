package com.kh.day10.interfaceex;

//�����ϰ��� �������̵��������.
public class SamsungPhone implements PhoneInterface{

	//�߻�޼ҵ���� �������̵������.
	@Override
	public void sendCall() {
		System.out.println("�ѷ����");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������� ����");
	}

	@Override
	public void printLogo() {
		System.out.println("====== Samsung ======");
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : xxx-xxxx-xxxx");
	}	//interface�� �����ؼ� ���� Ŭ����
	
	public void flash() {
		System.out.println("��¦��¦ ���� �������ϴ�.");
	}
	
}
