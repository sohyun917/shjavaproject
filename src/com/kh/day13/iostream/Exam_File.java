package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String [] args) {
		File file = new File("D:\\Temp\\moomeok.png");
		String fileName = file.getName();	//������ �������� �ҷ����� �޼ҵ��
		String path 	= file.getPath();
		String parent 	= file.getParent();
		
		System.out.println("���� �̸� : " + fileName);
		System.out.println("���� ��� : " + path);
		System.out.println("�θ� ���� : " + parent);
				
		try {
			File fileMake = new File("src/iostream/fileOne.txt");
			fileMake.createNewFile();
			File folderMake = new File("src/file");
			folderMake.mkdir();
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();
			
			System.out.println("������ �����ϴ°�? : " + fileMake.exists());
			System.out.println("fileOne.txt�� ������ �´°�? : " + fileMake.isFile());
			System.out.println("file������ ������ �´°�? : " + folderMake.isDirectory());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
