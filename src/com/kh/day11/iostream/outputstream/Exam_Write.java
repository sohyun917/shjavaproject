package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String [] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");	//실행되면 저 경로로 txt파일이 생성될거야.
			byte [] data = "Hello I/O".getBytes();	//Hello I/O를 바이트배열로 변경해서 넣는거야. 바로 넣을 수 없어서.(즉, 숫자값으로 저장한다는 의미)
			for(int i = 0; i < data.length; i++)	//Hello I/O를 전부 다 넣기 위해서
			os.write(data[i]);
			os.flush();//buffer공간을 비워줘야해서
			System.out.println("쓰기완료!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//실행하고 나면 iostream에 outputStream.txt파일이 생성되는데 거기엔 'H'가 입력되어있다.(os.write(data[0]);인 경우)

//Hello I/O의 0번 인덱스만 잘라냈으니까
