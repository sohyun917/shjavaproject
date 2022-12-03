package shproject;

import java.util.Scanner;

public class CafeInventory {
	Cafe [] cafes;
	
	public CafeInventory() {
		cafes = new Cafe[3];
	}
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ī�� ������ ���α׷� ======");
		System.out.println("1. �������");
		System.out.println("2. �����Ȯ��");
		System.out.println("3. �������α׷�");
		System.out.println("4. ���α׷� ����");
		System.out.println("� �޴��� ���ðڽ��ϱ�? ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inOutStock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ������� ======");
		for(int i = 0; i < cafes.length; i++) {
//			System.out.println("�޴�ȭ������ ���ư��÷��� �԰��� 100�� �����ּ���.");
			System.out.print("��ǰ�� �Է� : ");
			String name = sc.next();
			System.out.print("��,��� �Է� : ");
			int inoutStock = sc.nextInt();
//			if(inoutStock == 100) break;
			cafes[i] = new Cafe();
			cafes[i].setName(name);
			cafes[i].setInoutStock(inoutStock);
			
		}
	}
	
	public void stock() {
		System.out.println("====== �����Ȯ�� ======");
		for(int i = 0; i < cafes.length; i++) {
			System.out.println("��ǰ�� : " + cafes[i].getName());
			System.out.println("��� : " + cafes[i].getInoutStock());			
		}
	}
	
	public void checkOrder() {
		System.out.println("====== �������α׷� ======");
		for(int i = 0; i < cafes.length; i++) {
			int num = cafes[i].getInoutStock();
			String name = cafes[i].getName();
			if(num <= 3) {
				System.out.println(name + "��/�� " + num + "�� ���ҽ��ϴ�.");
				System.out.println(name + "��/�� �������ּ���.");
			}
			
		}
	}
	
	public void printGoodBye() {
		System.out.println("====== ���α׷� ���� ======");
	}
	
	public void printException() {
		System.out.println("�޴��� �������ּ���.");
	}
	}
