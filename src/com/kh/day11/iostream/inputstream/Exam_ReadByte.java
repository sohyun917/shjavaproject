package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String [] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");	//��ĳ����
			int readByteNo;
			byte [] readBytes = new byte[3];
			String data = "";
			while(true) {
				readByteNo = is.read(readBytes);	//readBytes�� ABC�� ���ִ�. 
				if (readByteNo == -1) break;	//���������� �о�
				data += new String(readBytes, 0, readByteNo);	//�����ϴ� ��ġ, ������ �ǹ���			
			}
//			System.out.print(readByteNo);  //readByteNo�� ���� ������ ������ ��Ÿ���Ե�. �׷��� 3�� ��µǴ°ž�.
			System.out.print(data);	//����ؼ� ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
