package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
	public static void main(String [] args) {
		//버퍼크기를 5로 하고, 표준출력스트림(System.out)과 연결한
		//버퍼출력스트림을 생성하라
		//C:\Temp\text2.txt 파일을 저장된 영문 텍스트를 읽어
		//버퍼 출력 스트림을 통해 출력하라!
		//파일 입력용
		FileReader fir = null;
		int readChar;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");
			//콘솔 출력용
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
			while ((readChar = fir.read()) != -1) {
				bout.write(readChar);
			}
			new Scanner(System.in).nextLine();
			bout.flush();	//5개를 읽고 나서는 5개가 다 채워지지 않아서 한번에 출력X
			//엔터를 쳐주면 flush가 버퍼를 채워서 비우기 때문에 나머지가 출력된다.
			bout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
