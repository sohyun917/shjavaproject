package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		//ȫ�浿/��ȭ/ȫ��/����/���� �� ���ڿ� �����͸�
		// /�������� �߶� ȫ�ø� ����Ͻÿ�~
		String query = "ȫ�浿/��ȭ/ȫ��/����/����";
		StringTokenizer st = new StringTokenizer(query, "/");
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals("ȫ��"))
			System.out.println("ȫ��");			
		}
		}
}
