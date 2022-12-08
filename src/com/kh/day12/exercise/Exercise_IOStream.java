package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {		
	public void fileCopy() {
		//�̹��� ���� ����
		//C:\\img\\moomeokpan.png\\ -> D:\\moomeok.png
		//����Ʈ ��� �Է½�Ʈ��
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\img\\moomeokpan.png");
			os = new FileOutputStream("D:\\moomeok.png");
			byte [] readBytes = new byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) {	//���� �б� ����
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void memoFileMake() {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		Writer writer = null;
//		Reader reader = null;
		
		try {
			writer = new FileWriter("src/iostream/" + fileName );
			System.out.println("'" + fileName + "' ���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");
			sc.nextLine();	//������ �Էµ� ���� ���ſ�
			int i = 1;	//i���� ������Ű�� ���� while�� ������ ���´�.
			String input = "";
			while(true) {
				System.out.print(i + " : ");
				input = sc.nextLine();
				if ("exit".equals(input))  break;	//�̰� ���� ��¹����� �ؿ� ��ġ�ϸ� exit������ ��µ�. ���� �÷�����.
				writer.write(i + " : " + input + "\n");
				i++;				
			}
//			reader = new FileReader("src/iostream/" + fileName);
//			while(true) {
//				int readData = reader.read();
//				if(readData == -1) break;
//				System.out.print((char)readData);
//			}
			System.out.print("���� ���� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
