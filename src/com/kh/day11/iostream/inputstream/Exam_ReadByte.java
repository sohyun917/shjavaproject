package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String [] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");	//업캐스팅
			int readByteNo;
			byte [] readBytes = new byte[3];
			String data = "";
			while(true) {
				readByteNo = is.read(readBytes);	//readBytes에 ABC가 들어가있다. 
				if (readByteNo == -1) break;	//없을때까지 읽어
				data += new String(readBytes, 0, readByteNo);	//시작하는 위치, 갯수를 의미해			
			}
//			System.out.print(readByteNo);  //readByteNo는 읽은 문자의 갯수를 나타내게됨. 그래서 3이 출력되는거야.
			System.out.print(data);	//출력해서 끝
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
