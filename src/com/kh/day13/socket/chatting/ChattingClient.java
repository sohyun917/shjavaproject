package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {
	public static void main(String [] args) {
		Socket socket = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;
		try {
			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 8507);
			System.out.println("���Ἲ��!!!");	//(2)
			
			byte [] bytes = null;
			os = socket.getOutputStream();	//outputstream�� ��ü�� os�� ����
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Server");  	//���ڸ� ����Ʈ�� ��ȯ�ؼ� �־��� �ʿ���� �ٷ� �־��ִ¹��.
//			bytes = "Hello Server".getBytes();
//			os.write(bytes);	//outputstream�� ����Ʈ�迭 ���� ���ڸ� �ٷ� ���� �� ����
			System.out.println("������ ���� �Ϸ�");	//(3)
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println("������ �ޱ� �Ϸ� : " + message); 	//(6)
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
