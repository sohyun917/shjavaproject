package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 50; i++) {
			// nextInt(n) -> 0���� n-1������ ������ �� ����!
//			System.out.println(rand.nextInt(10));
			//1���� 10������ �� �߿��� ������ ���� �̰� ������
			//nextInt(10)+1, �� +1�� ������ �����Ѵ�!
			//ex. 20���� 35������ �� �߿��� ������ ���� �̰�ʹٸ�?
			//���� -20�� �ϸ� 0���� 15�� �ȴ�.(�������� 0���� �����ϴ°ͺ��� �����ϴ°ž�)
			//-> nextInt(16)+20
			//ex2. 10���� 23������ �� �߿��� ������ ���� �̰�ʹٸ�?
			//-> nextInt(14)+10
			System.out.println(rand.nextInt(16)+20);
		}
	}

}
