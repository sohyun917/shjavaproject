package com.kh.day16.mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day16.setcollection.Student;

public class MapRun {
	public static void main(String [] args) {
		Map<String, Student> stdMap = new HashMap<String ,Student>();
		stdMap.put("1", new Student("�տ���", 44, 66));
		stdMap.put("2", new Student("����", 55, 100));
		
		System.out.println("ù��° �л� : " + stdMap.get("1").toString());
	}
	
	public void mapExample1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "����");
		map.put("031", "��⵵");
		map.put("061", "����");
		map.put("053", "�뱸");
		
		System.out.println("����� �������� �� : " + map.size());
		System.out.println("02�� ������ ������ ���ɴϴ� : " + map.get("02"));
		System.out.println("031�� ������ ������ ���ɴϴ� : " + map.get("031"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ȣ �Է� : ");
		String regionCode = sc.next();
		
		System.out.println("�Է��Ͻ� ������ȣ�� ���� ������ : " + map.get(regionCode));
	}
	
	public void mapExample2() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "����");
		objMap.put("price", 1500);
		objMap.put("isGood", true);
		System.out.println("��ǰ �̸��� " + objMap.get("name"));
		System.out.println("��ǰ ������ " + objMap.get("price") + "��");
		String result = (boolean)objMap.get("isGood") ? "��õ" : "����õ";	//���׿�����
		System.out.println("��õ���δ� " + result);	
	}
}
