package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "�� ���� ����Ʈ �Դϴ�.------");
		File [] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];	//�� �ϳ��� ���ϰ�ü�� fOne�� �־��ش�.
			long time = fOne.lastModified();
			System.out.printf("%30s",fOne.getName());
			System.out.printf("%5s","\t���� ũ�� : " + fOne.length());
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n",time,time,time,time);
		}
	}
	
	public static void main(String [] args) {
		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
	}
}
