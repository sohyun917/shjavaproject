package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String [] args) {
		//����Ʈ��� ��Ʈ��
		InputStream is = null;
		//���ڱ�� ��Ʈ��
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				int readData = reader.read();	//���⼭ ������ �߻��ϸ� close�� �����Ű�� �������� �ִ�.
				if(readData == -1) break;
				System.out.print((char)readData);
			}
//			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	
			//�ݵ�� ����Ǿ�� �ϴ� �ڵ� �ۼ�
			try {
				reader.close();//���� close�� ������� ������ �ڿ�����. �׷��� ������ ����ǰ� �ϱ����� ���⿡ ���´�.
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
	}

}
