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
			System.out.println("연결 기다림...");
			Socket socket = serverSocket.accept();	//이걸 적어야 기다림시작(1)
			System.out.println("연결 수락됨!");
			
//			byte [] bytes = new byte[100];
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF(); 
//			int readByteNo = is.read(bytes);
//			String message = new String(bytes, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);	//(4)
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Client");
			System.out.println("데이터 전송 완료!");	//(5)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
