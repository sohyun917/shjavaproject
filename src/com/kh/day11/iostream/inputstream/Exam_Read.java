package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		InputStream is = null;
		
		//Unhandled exception type FileNotFoundException -> Checked Exception
		//->�ݵ�� try ~ catch ����� �ϴ� Exception
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");	//�� ���Ͽ� �ִ� �� �����ͼ� ����ϰ�������
			
			int readByte;
			while(true) {
				readByte = is.read();
				//������ �׸� ������� �����ִ� �ְ� �ʿ���
				if (readByte == -1) break;	//-1�� ���ٴ°� �ǹ���
				System.out.print((char)readByte);
			}
//			for(int i = 0; i < 4; i++) {
//				readByte = is.read();
//				System.out.print((char)readByte);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
