package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {
	public static void main(String [] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Real I/O".getBytes();
			os.write(data);
			os.flush();
			System.out.println("����Ϸ�~!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
