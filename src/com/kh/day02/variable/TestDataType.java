package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		// ����part
		byte bNum = 127; //-128~127
		short sNum = 32767; //-32768~32767
		int iNum = 2147483647; //-2147483648~2147483647
		long lNum = 2147483649l; //���̻� l�� �ٿ�����.
		short num = 128;
		// �Ǽ�part
		float fNum = 22.1123f; //���̻� f�� �ٿ�����.
		double dNum = 23.502;
		// ����part
		 char fChar= 'A'; //Ȭ����ǥ �ȿ��� 1���� ����
		String sChar = "Hello Java"; //�ֵ���ǥ �ȿ��� �������� ����.
		// Boolean��
		boolean result = false;
		// 1>0, 2<1
		
		System.out.println("�����ǰ� :" + iNum);
		System.out.println("�����ǰ�(9999��) :" + lNum);
		System.out.println("�Ǽ��ǰ� : " + fNum);
		System.out.println("�Ǽ��ǰ� :" + dNum);
		System.out.println("�����ǰ� :" + fChar);
		System.out.println("�����ǰ� :" + sChar);
		System.out.println("���ǰ� :" + result);
		
		fChar = 66;
		System.out.println("���ڿ� ���� :" + fChar);
		fChar = 75;
		System.out.println("���ڿ� ����2 :" + fChar);
		//����(char)�� ���ڸ� ������ �� �ְ� ASCII�ڵ忡
		//���εǾ��ִ� ���ڷ� ����� �����ϴ�.
		
		
		
	}
}
