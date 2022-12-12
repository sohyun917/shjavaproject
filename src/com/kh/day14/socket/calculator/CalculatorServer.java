package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int port = 8989;
		
		try {
			System.out.println("���� �������Դϴ�.");
			Thread.sleep(1000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�...");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			while(true) {
				//���� �޽��� : 12 + 1
				String msg = dis.readUTF();
				if(msg.equalsIgnoreCase("bye")) {	//bye�� ��ҹ��� ���о��� �޾��ش�.
					System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
					break;
				}
				System.out.println("���� �޽��� : " + msg);
				//������ ������
				String [] msgArrs = msg.split(" ");
				if(msgArrs.length != 3) {
					msg ="end";
//					System.out.println("�߸��Է��ϼ̽��ϴ�. ���Ŀ� �°� �Է����ּ���.");
					dos.writeUTF(msg);
					continue;	//���� �ڵ带 �������� �ʰ� ���� �ٽ� �ö󰣴ٴ� �ǹ�.
				}
				int num1 = Integer.parseInt(msgArrs[0]);
				String operator = msgArrs[1];
				int num2 = Integer.parseInt(msgArrs[2]);
				String result = "";
//				if(msgArrs[1] == "+") {
//					result = num1 + num2;
//				}else if(msgArrs[1] == "-") {
//					result = (Integer.parseInt(msgArrs[0]) - Integer.parseInt(msgArrs[2]));
//				}else if(msgArrs[1] == "*") {
//					result = (Integer.parseInt(msgArrs[0]) * Integer.parseInt(msgArrs[2]));
//				}else if(msgArrs[1] == "/") {
//					result = (Integer.parseInt(msgArrs[0]) / Integer.parseInt(msgArrs[2]));
//				}
				switch(operator) {
				case "+" : result = num1 + num2 + ""; break;	//���ڰ� ���ڿ��� ������ ���ڿ��� ��.
				case "-" : result = String.valueOf(num1 - num2); break;
				case "*" : result = String.valueOf(num1 * num2); break;
				case "/" : result = String.valueOf(num1 / num2); break;
				case "%" : result = String.valueOf(num1 % num2); break;
				default : result = "�����ڸ� �߸��Է��ϼ̽��ϴ�."; break;
				}
				dos.writeUTF(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
