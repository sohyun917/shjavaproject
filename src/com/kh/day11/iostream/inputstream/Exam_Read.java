package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		InputStream is = null;
		
		//Unhandled exception type FileNotFoundException -> Checked Exception
		//->반드시 try ~ catch 해줘야 하는 Exception
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");	//저 파일에 있는 걸 가져와서 출력하고싶은경우
			
			int readByte;
			while(true) {
				readByte = is.read();
				//없으면 그만 읽으라고 멈춰주는 애가 필요해
				if (readByte == -1) break;	//-1이 없다는걸 의미함
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
