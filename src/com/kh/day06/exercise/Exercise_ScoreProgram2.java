package com.kh.day06.exercise;

import java.util.Scanner;
//������ ���α׷���, ���α׷��� �� ���� �ľ� ����!!
public class Exercise_ScoreProgram2 {
	static int kor = 0;
	static int eng = 0; //��������, Ŭ��������(Ŭ���������� ���� ���� �ö�� ����)
	static int math = 0; //�������� inputScore������ ����, printScore������ ������ �����ٰ� ���ž�.
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in); //�ؿ� sc�ѹ� �� ���ִ��� �ƴϸ� �긦 main���� ���� �ø���ȴ�.
		ESCAPE :
		while(true) {
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					inputScore(); //��Ʈ�� ������ �޼ҵ� ������ �ٷ� �� �� �ִ�.
					break;
				case 2 : 
					printScore();
					break;
				case 3 : 
					goodByeMsg();
					break ESCAPE;
				default : 
					printException();
					break;
			}
		}
		
	}
	public static void printMenu() { //�޼ҵ带 �ڱ� �ڽ��� �ٷ� ������ static�� �ٿ������.
		System.out.println("====== ���� �޴� =======");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ���� �Է� =======");
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
	}
	public static void printScore() {
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		System.out.println("====== ���� ��� ======");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f \n" , avg);
	}
	public static void goodByeMsg() {
		System.out.println("Good Bye~");
	}
	public static void printException() {
		System.out.println("1 ~ 3 ������ ���� �Է����ּ���!");
	}
}
