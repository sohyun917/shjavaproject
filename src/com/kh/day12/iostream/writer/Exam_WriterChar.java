package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterChar {
	public static void main(String [] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char [] cbuf = "자바...".toCharArray();
			writer.write(cbuf);
			writer.flush();
			System.out.println("write(char[]) 동작 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
