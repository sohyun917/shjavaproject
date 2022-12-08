package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String [] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo;
			char [] cbuf = new char[2];	//2���� �д´�
			String data = "";
			while(true) {
				readCharNo = reader.read(cbuf);	//�������� ��No, ������
				if(readCharNo == -1) break;
				data += new String(cbuf, 0, readCharNo);	//cbuf���� 0��°���� readCharNo��ŭ ������ String���� ��ȯ�Ѵ�				
				//+=�� �ƴ϶� = ��� ���� ���� ������ �������� �ʾƼ� ���� �������� ��µȴ�.
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
