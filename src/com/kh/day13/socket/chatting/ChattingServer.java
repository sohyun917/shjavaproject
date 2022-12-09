package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(8507);
			System.out.println("���� ��ٸ�...");
			Socket socket = serverSocket.accept();	//�̰� ����� ��ٸ�����(1)
			System.out.println("���� ������!");
			
//			byte [] bytes = new byte[100];
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF(); 
//			int readByteNo = is.read(bytes);
//			String message = new String(bytes, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);	//(4)
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Client");
			System.out.println("������ ���� �Ϸ�!");	//(5)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
