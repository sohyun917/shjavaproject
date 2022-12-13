package com.kh.day15.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GuestFunction {
	Guest guest;
	public GuestFunction() {
		 guest = new Guest();
	}

	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������(save �� �Է¹��� �̸��� ���ϸ�)");
		System.out.println("4. �����ҷ�����(load �� 2������ ���)");
		System.out.println("0. ����");
		System.out.print("�޴��Է� : ");
		int select = sc.nextInt();
		return select;
	}
	
	static void insert() {
		System.out.println("=== === === === === ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();
		String address = sc.nextLine();
//		guest = new Guest(name, age, address);
		System.out.println("=== === === === === ===");
	}
	
	static void print() {
		System.out.println("====== ���� ��� ======");
		System.out.println("�̸� : " );
		System.out.println("���� : " );
		System.out.println("�ּ� : " );
		System.out.println("=== === === === === ===");
	}
	
	static void save() {
		Writer os = null;
		
			try {
//				String result = name + "/" + age + "/" + address;
//				os = new FileWriter("src/iostream/" + name + ".txt");
//				os.write(result);
				os.flush(); 
				System.out.println("����Ϸ�Ǿ����ϴ�.");
				System.out.println("=== === === === === ===");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	static void load() {	
		Reader reader = null;
		BufferedReader bfReader = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ� �Է� : ");
		String fileName = sc.next();
		String result = "";
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
			result = bfReader.readLine();
			StringTokenizer st = new StringTokenizer(result, "/");
//			name = st.nextToken();
//			age = Integer.parseInt(st.nextToken());	//StringTokenizer�� �߶����ϱ� String���� �Ǿ��־� ��ȯ�� �ʿ���
//			address = st.nextToken();
			System.out.println("�ε尡 �Ϸ�Ǿ����ϴ�.");
			System.out.println("������°����մϴ�. 2���� �����ּ���");
			System.out.println("=== === === === === ===");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
