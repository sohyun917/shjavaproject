package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String [] args) {
		//바이트기반 스트림
		InputStream is = null;
		//문자기반 스트림
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				int readData = reader.read();	//여기서 오류가 발생하면 close를 실행시키지 않을수도 있다.
				if(readData == -1) break;
				System.out.print((char)readData);
			}
//			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	
			//반드시 실행되어야 하는 코드 작성
			try {
				reader.close();//만약 close가 실행되지 않으면 자원낭비. 그래서 무조건 실행되게 하기위해 여기에 적는다.
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
	}

}
