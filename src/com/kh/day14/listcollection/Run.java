package com.kh.day14.listcollection;

public class Run {
	public static void main(String [] args) {
		ObjectList objList = new ObjectList();
		objList.add(11);
		objList.add("��");
		objList.add(23);
//		objList.add("��");
		Student std = new Student();
		objList.add(std);
		int num = (int)objList.get(0);	//�� ���� �ִ� 11�̶������� Ÿ���� objectŸ���̾�.
		String str = (String)objList.get(1);
		Student sOne = (Student)objList.get(2);
		
		//�پ��� �ڷ����� ����� �� ������
		//������ �� ������ �ٿ�ĳ����(����ȯ)
		//���־�� �Ѵ�!!
	}
	public void intExample() {
		//int [] nums = new int[3];
		IntList nums = new IntList();
		nums.add(1);	//�ε����� �Ű澲�� �ʰ� �ְ���� ���� �ִ´�.
		nums.add(2);
		nums.add(3);
		nums.add('A');
//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
		//Index 3 out of bounds for length 3(�迭�� ũ�Ⱑ3������ ���� 4���� ����.
//		nums[3] = 4;
		System.out.println("1��° �� : " + nums.get(0));
		System.out.println("2��° �� : " + nums.get(1));
		System.out.println("3��° �� : " + nums.get(2));
		System.out.println("4��° �� : " + nums.get(3));
		System.out.println("ũ�� : " + nums.size());
		//����
		//nums[0] = nums[1] = nums[2] = 0;
		nums.clear();
		System.out.println("���� �� ũ�� : " + nums.size());
	}
}
