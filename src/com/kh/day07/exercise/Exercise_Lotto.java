package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		//�ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�!
		//��, ����� ������������ ����
		//�ζ� ��ȣ�� �? 6��!
		//�ζ� ��ȣ�� ������ 1 ~ 45
		int [] lottos = new int [6];
		Random rand = new Random();
		//��ȣ�� �̴´�.
		for (int i = 0; i < lottos.length; i ++) {
			lottos [i] = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				//�񱳸� �Ѵ�. ���ϴ� Ƚ���� ���� ��������.
				//�񱳴� �̹� ���� �Ͱ� ù��°���� �ٷ� �ձ���
				if(lottos[i] == lottos[e]) {
					//������ i--�� �Ѵ�.
					i--;
					break;
				}				
			}
		}	
		//��������
		for(int i = 0; i < lottos.length-1; i++) {
			for(int e = 0; e < (lottos.length-1); e++) {
				if(lottos[e] > lottos[e+1]) {
					int temp = lottos[e+1];
					lottos[e+1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}
		//���
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}

}
