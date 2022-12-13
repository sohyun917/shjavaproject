package com.kh.day14.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {
	private static String name;
	private static int age;
	private static String address;	//값을 저장하기 위해 선언해줌.
	
	public static void main(String [] args) {
		end :
		while(true) {
			int choice = printMenu();
			switch(choice) {
				case 1 : insert(); break;
				case 2 : print(); break;
				case 3 : save(); break;
				case 4 : load(); break;
				case 0 : break end;
				default : System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
			}
		}
		/*
		 * 1. 정보입력
		 * 2. 정보출력
		 * 3. 정보저장(save)
		 * 4. 정보불러오기(load)
		 * 0.종료
		 * 메뉴입력 : 1
		 * 
		 * 이름입력 : 일용자
		 * 나이입력 : 33
		 * 주소입력 : 서울시 종로구
		 * 
		 * 1. 정보입력
		 * 2. 정보출력
		 * 3. 정보저장(save)
		 * 4. 정보불러오기(load)
		 * 0.종료
		 * 메뉴입력 : 2
		 * 
		 * 이름 : 일용자
		 * 나이 : 33
		 * 주소 : 서울시 종로구
		 * 
		 * 3을 선택해서 저장 후 파일을 열어보면
		 * 일용자/33/서울시 종로구 라고 저장되어있게
		 * 
		 * 단, 파일의 이름은 이름으로 한다.(일용자.txt)
		 * 
		 * 4. 선택 후 파일의 제목을 입력하여 로드한 후에
		 * 2. 선택하면 정보가 출력됨
		*/

		
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
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("주소 입력 : ");
		//	sc.nextLine()쓸 때 주의해야할 점은? -> 위에서 입력한 엔터값이 다음값까지 입력되기 때문에
		//	엔터값을 받아줄 아이를 적어줘야한다.
		sc.nextLine();	//ㄴ그게 이거
		address = sc.nextLine();
		System.out.println("=== === === === === ===");
	}
	
	static void print() {
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("=== === === === === ===");
	}
	
	static void save() {	//프로그램기준으로 데이터를 내보내는거니까 출력스트림사용
		Writer os = null;
		
			try {
				String result = name + "/" + age + "/" + address;
				os = new FileWriter("src/iostream/" + name + ".txt");
				os.write(result);
				os.flush(); 	//이게 없으면 파일에 내용이 적히지 않을때도 있다.
				System.out.println("저장완료되었습니다.");
				System.out.println("=== === === === === ===");
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
	
	static void load() {	//프로그램을 기준으로 데이터가 들어오니까 입력스트림사용
		Reader reader = null;
		BufferedReader bfReader = null;	//좀 더 빨리 읽기 위한 보조스트림
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String fileName = sc.next();
		String result = "";
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
			result = bfReader.readLine();
			//result -> 일용자/22/서울시 중구
			///를 기준으로 자르는 방법 2가지
			//1. split메소드 사용하기 2. StringTokenizer사용하기
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());	//StringTokenizer로 잘랐으니까 String값이 되어있어 변환이 필요함
			address = st.nextToken();
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
