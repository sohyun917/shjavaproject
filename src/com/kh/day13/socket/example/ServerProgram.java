package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		//(���α׷��� ��������)�����͸� ���� �� ����ؾ� �ϴ� ��Ʈ�� -> �Է½�Ʈ��
		//client�� �����͸� ������ ������ ������ server���� �ؾ���
		InputStream is = null;
		OutputStream os = null;
		
		try {
			System.out.println("���� ��ٸ�...");
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept();
			System.out.println("���� ������!");
			
			////////////// ������ �ޱ� //////////////
			byte [] bytes = new byte[100];
			is = socket.getInputStream();
			
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);
			/////////////////////////////////////////////////////
			
			//////////////�����ͺ����� ////////////////
			os = socket.getOutputStream();
			message = "Hello Client";	//�������� �ϴ� �޼���
			bytes = message.getBytes();	//write �޼ҵ� ���ް� : ����Ʈ �迭�� ��ȯ
			os.write(bytes);
			os.flush();
			System.out.println("������ ������ ����");
			/////////////////////////////////////////////
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
