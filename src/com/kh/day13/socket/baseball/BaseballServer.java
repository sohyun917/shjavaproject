package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			Date date = new Date();
			System.out.println(trans.format(date));
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			//�ߺ����� ��ȣ 3���� ���� �Ŀ� ������ �غ��ؾ���.
			for(int i = 0; i < numbers.length; i++) {
				Random rand = new Random();
				numbers[i] = rand.nextInt(9)+1;
				for(int e = 0; e < i; e++) {
					if(numbers[i] == numbers[e]) {
						i--;
						break;
					}
				}
			}
			System.out.println("���� ���� -> " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("���� �غ� �Ϸ�");
			
			while(true) {
				//�� �ޱ�
				String readNum = dis.readUTF();
				System.out.println("�ޱ� : " + readNum);
				
				//���� ���� numbers�� ���� ������ ��
				//���ڰ� �°� ��ġ�� �´���
				//���ڴ� �´µ� ��ġ�� Ʋ����
				//�ƹ��͵� ���� �ʾҴ�����
				//��Ʈ����ũ, ���� ������ش�.
				int strike = 0;
				int ball = 0;
				
				//1. �迭�� �迭�� ��. numbers�� int�迭�̶�
				//�Է¹��� ���� ���ڰ� ����Ǵ� �迭�� ����(split()���) ->String�迭
				String []  readNums = readNum.split(" ");	//���⸦ �������� �ڸ���.
				for(int i = 0; i < numbers.length; i++) {
					for(int e = 0; e < readNums.length; e++) {
						if(numbers[i] == Integer.parseInt(readNums[e])) {
							//���� ���� ������ �񱳸� ��.
							//�׸��� ��ġ�� ������ �񱳸� ��.
							//�ε������� ��.
							if(i == e) {
								strike++;
							}else {
								ball++;
							}
						}
					}
				}
				String result = strike + "��Ʈ����ũ" + ball + "��";
				System.out.println(result);
				//Ŭ���̾�Ʈ�� ����� �����ֱ�!
				dos.writeUTF(result);
				//��Ʈ����ũ�� 3�̸� ���������ϱ�!
				if(strike == 3) {
					System.out.println("�ƿ�! ��������!");
					break;
				}
			}
			//��� ����Ŭ������ ����Ŭ������ Exception�̴�.
			//���ܰ�ü�� ��ĳ�����Ͽ� ó���� �� �ִ�.
			//try~catch���� Exception�� �̿��ؼ� ����ó���ϸ� �ڵ尡 �پ���.
			//������ ���ܺ� �޼����� ����ϱ� ��ƴ�.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
				dos.close();
				dis.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
