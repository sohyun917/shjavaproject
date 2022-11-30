package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0; //얘네가 while문 안에 있으면 입력했던 값이 다시 초기화돼서 출력값이 다시 0이된다.
		int choice = 0;
		ESCAPE : 
		while(choice < 3) { //(★★★★★)
			System.out.println("====== 메인 메뉴 =======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("====== 성적 입력 =======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2 :
				int sum = kor + eng + math; //sum값은 case2에서만 사용하니까 여기서 선언해도돼.
				double avg = (double)sum / 3;
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println();
				System.out.println("총점 : " + sum);
				System.out.printf("평균 : %.2f \n" , avg); //.2가 소숫점 두자리까지를 의미함
				break;
			case 3 :
				System.out.println("Good Bye~");
				break ESCAPE; // break 뒤의 단어가 똑같이 있는 곳까지 올라가는거.
							//while문을 아예 벗어나는거.
				default :
					System.out.println("1 ~ 3 사이의 수를 입력해주세요~");
					break;
			}
		}
	}
}
