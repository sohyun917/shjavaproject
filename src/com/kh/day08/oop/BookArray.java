package com.kh.day08.oop;

import java.util.Scanner;

class Book{
	String title, author;
	//�Ű����� �ִ� ������
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String [] args) {
		Book [] book = new Book[2];	//Book�迭����
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < book.length; i++) {
			System.out.print("���� >> ");
			String title = sc.nextLine();
			System.out.print("���� >> ");
			String author = sc.nextLine();
			book[i] = new Book(title, author);	//��ü������ �ʱ�ȭ. ȭ��ǥ ������.
		}
		for(int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].title + "," + book[i].author + ")");
		}
	}

}
