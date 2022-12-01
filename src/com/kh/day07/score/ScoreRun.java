package com.kh.day07.score;
//다른 클래스에 만들어 둔 걸 가져와서 쓴다.
import java.util.Scanner;

public class ScoreRun {
	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
		ScoreFunction sFunc = new ScoreFunction();	//얘를 while안에 넣으면 계속 new되기 때문에 값이 계속 0으로 초기화됨.
													//따라서 while안에 넣으면 안돼.
		ByeBye :
		while(true) {
			int choice = sFunc.printMenu();	//반환값이 있는 메소드
			switch(choice) {
			case 1 :
				sFunc.inputScore();
				break;
			case 2 :
				sFunc.printScore();
				break;
			case 3 :
				sFunc.goodByeMsg();
				break ByeBye;
			default : 
				sFunc.exceptionMsg();
				break;
			}
		}
	}
}
