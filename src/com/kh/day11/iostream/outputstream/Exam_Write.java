package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String [] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");	//����Ǹ� �� ��η� txt������ �����ɰž�.
			byte [] data = "Hello I/O".getBytes();	//Hello I/O�� ����Ʈ�迭�� �����ؼ� �ִ°ž�. �ٷ� ���� �� ���.(��, ���ڰ����� �����Ѵٴ� �ǹ�)
			for(int i = 0; i < data.length; i++)	//Hello I/O�� ���� �� �ֱ� ���ؼ�
			os.write(data[i]);
			os.flush();//buffer������ �������ؼ�
			System.out.println("����Ϸ�!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//�����ϰ� ���� iostream�� outputStream.txt������ �����Ǵµ� �ű⿣ 'H'�� �ԷµǾ��ִ�.(os.write(data[0]);�� ���)

//Hello I/O�� 0�� �ε����� �߶�����ϱ�
