package com.kh.day05.array;

public class Exam_SortBubble {
	public static void main(String [] args) {
		//���� �˰���
		//1. ��������
		//2. ��������
		//3. ��������
		//���������̶�?
		//������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ���
		//������ ���ٴ� ������ �ְ�, �̹� ���ĵ� �����͸� ������ �� ���� ����.
		//�⺻������ �ٸ� ���Ŀ� ���� ���ļӵ��� ������, �������� ������ ��
		//���� ����.
		//{2, 5, 4, 1, 3}
		/* i=0
		 * 2, 5, 4, 1, 3 ->ó���� (�迭�� ũ��-1)��ŭ ����
		 * 2, 4, 5, 1, 3
		 * 2, 4, 1, 5, 3
		 * 2, 4, 1, 3, 5
		 * i=1
		 * 2, 4, 1, 3, 5
		 * 2, 1, 4, 3, 5
		 * 2, 1, 3, 4, 5
		 * i=2
		 * 1, 2, 3, 4, 5
		 * 1, 2, 3, 4, 5 ->��Ƚ���� ���� �پ���
		*/	
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 0; i < arrs.length-1; i++) {//ó���� (�迭��ũ��-1)��ŭ ���ϴϱ�
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
//			for(int j = (arrs.length-1)-i; j >= 0; j--) //ó���� 4��ŭ ��, �״��� 3��ŭ ��... ������ 1��ŭ ��
//				if(arrs[j] > arrs[j+1]) {
//					int temp = arrs[j+1];
//					arrs[j+1] = arrs[j];
//					arrs[j] =  temp;
//				}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
