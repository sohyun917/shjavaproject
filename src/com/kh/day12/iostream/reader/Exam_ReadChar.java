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
			char [] cbuf = new char[2];	//2개씩 읽는다
			String data = "";
			while(true) {
				readCharNo = reader.read(cbuf);	//읽은거의 수No, 읽은거
				if(readCharNo == -1) break;
				data += new String(cbuf, 0, readCharNo);	//cbuf에서 0번째부터 readCharNo만큼 읽은걸 String으로 변환한다				
				//+=가 아니라 = 라고 쓰면 읽은 값들이 누적되지 않아서 제일 마지막만 출력된다.
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
