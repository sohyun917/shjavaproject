package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		//Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		Integer i = Integer.valueOf(1123);//Ŭ����
		int e = i.intValue();	//�⺻��
		//��ü�� ���� ����ϴٰ� �⺻������ ��ȯ�����ϴ�.
		Integer f = null;	//�����α׷����Ҷ� null���� �� �� �ִٴ°� �߿��ϴ�.
//		int m = null;	//null�� int���� �� �� ����.
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		//��ü�� ���� ����ϴٰ� �⺻������ ��ȯ�����ϴ�.
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		//��ü�� ���� ����ϴٰ� �⺻������ ��ȯ�����ϴ�.
		
		//���ڿ��� �⺻ ������Ÿ��(int, boolean, double)
		//���� ��ȯ
		int num = Integer.parseInt("123");
		System.out.println("��ȯ�� �� : " + num);
		boolean isYn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		//�⺻ ������ Ÿ��(int, double, char)��
		//���ڿ��� ��ȯ
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); //16���� 7b�� ��ȯ
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
	}
}
