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
			System.out.println("연결요청");
			socket = new Socket("127.0.0.1", 8507);
			System.out.println("연결성공!!!");	//(2)
			
			byte [] bytes = null;
			os = socket.getOutputStream();	//outputstream의 객체를 os에 넣음
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Server");  	//문자를 바이트로 변환해서 넣어줄 필요없이 바로 넣어주는방법.
//			bytes = "Hello Server".getBytes();
//			os.write(bytes);	//outputstream은 바이트계열 따라서 문자를 바로 받을 수 없음
			System.out.println("데이터 전송 완료");	//(3)
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println("데이터 받기 완료 : " + message); 	//(6)
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
