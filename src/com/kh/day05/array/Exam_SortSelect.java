package com.kh.day05.array;

public class Exam_SortSelect {
	public static void main(String [] args) {
		//�˰��� ����
		//1. ��������
		//2. ��������
		//3. ��������
		//���������̶�?
		//�迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		//Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����������
		//������ ���� ���� �� �ް��� ���� ���ϸ� ����.
		//�迭�� n�� �ε������� n+1�� ~ ������ �ε������� ����.
		int [] arrs = {2, 5, 4, 1, 3};
		int min; //�ε����� ����
		for(int i = 0; i < arrs.length; i++) {
			min = i; //���� ���� �� �ε��� ��(�� �ε������� ���� �����Ŷ�� �����ϰ� ���ϴ°���)
			for(int j = i+1; j < arrs.length; j++ ) {
				//������ �ε��������ϱ� arrs.length, n+1���� �񱳴ϱ� i+1, ��� �����ϱ� j++
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		/* 2, 5, 4, 1, 3(�ʱⰪ) 
		 * i=0
		 * 1, 5, 4, 2, 3
		 * i=1
		 * 1, 4, 5, 2, 3
		 * 1, 2, 4, 5, 3
		 * i=2		
		 * 1, 2, 3, 5, 4
		 * i=3
		 * 1, 2, 3, 4, 5
		*/
	}

}
