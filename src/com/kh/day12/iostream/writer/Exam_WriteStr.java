package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {
	public static void main(String [] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "����Ŭ�� ���� �������";
			writer.write(data);
			writer.flush();
			System.out.println("�ۼ��Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
