package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String [] args) {
		Socket socket = null;
		//������ ���� �� ����ؾ� �ϴ� ��Ʈ�� -> ��½�Ʈ��
		OutputStream os = null;
		InputStream is = null;
		
		try {
			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("���Ἲ��!!");
			////////////// �����ͺ����� ////////////////
			byte [] buf = null;
			String message = "";
			os = socket.getOutputStream();//outputstream�� ��ü�� os�� ����
			message = "Hello Server";	
			buf = message.getBytes();//outputstream�� ����Ʈ�迭 ���� ���ڸ� �ٷ� ���� �� ����
			os.write(buf);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			/////////////////////////////////////////////
			
			//////////////������ �ޱ� //////////////
			buf = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);
			/////////////////////////////////////////////////////
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
