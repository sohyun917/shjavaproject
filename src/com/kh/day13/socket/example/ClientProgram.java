package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String [] args) {
		Socket socket = null;
		//데이터 보낼 때 사용해야 하는 스트림 -> 출력스트림
		OutputStream os = null;
		InputStream is = null;
		
		try {
			System.out.println("연결요청");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결성공!!");
			////////////// 데이터보내기 ////////////////
			byte [] buf = null;
			String message = "";
			os = socket.getOutputStream();//outputstream의 객체를 os에 넣음
			message = "Hello Server";	
			buf = message.getBytes();//outputstream은 바이트계열 따라서 문자를 바로 받을 수 없음
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			/////////////////////////////////////////////
			
			//////////////데이터 받기 //////////////
			buf = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			/////////////////////////////////////////////////////
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
