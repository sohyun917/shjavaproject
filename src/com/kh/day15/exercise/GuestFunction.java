package com.kh.day15.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GuestFunction {
	Guest guest;
	public GuestFunction() {
		 guest = new Guest();
	}

	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장(save 후 입력받은 이름이 파일명)");
		System.out.println("4. 정보불러오기(load 후 2번으로 출력)");
		System.out.println("0. 종료");
		System.out.print("메뉴입력 : ");
		int select = sc.nextInt();
		return select;
	}
	
	static void insert() {
		System.out.println("=== === === === === ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String address = sc.nextLine();
//		guest = new Guest(name, age, address);
		System.out.println("=== === === === === ===");
	}
	
	static void print() {
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " );
		System.out.println("나이 : " );
		System.out.println("주소 : " );
		System.out.println("=== === === === === ===");
	}
	
	static void save() {
		Writer os = null;
		
			try {
//				String result = name + "/" + age + "/" + address;
//				os = new FileWriter("src/iostream/" + name + ".txt");
//				os.write(result);
				os.flush(); 
				System.out.println("저장완료되었습니다.");
				System.out.println("=== === === === === ===");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	static void load() {	
		Reader reader = null;
		BufferedReader bfReader = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String fileName = sc.next();
		String result = "";
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
			result = bfReader.readLine();
			StringTokenizer st = new StringTokenizer(result, "/");
//			name = st.nextToken();
//			age = Integer.parseInt(st.nextToken());	//StringTokenizer로 잘랐으니까 String값이 되어있어 변환이 필요함
//			address = st.nextToken();
			System.out.println("로드가 완료되었습니다.");
			System.out.println("정보출력가능합니다. 2번을 눌러주세요");
			System.out.println("=== === === === === ===");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
