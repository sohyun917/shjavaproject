package com.kh.day07.student;
//StudentFunction과 상호작용한다.(얘는 Student가 있는지 없는지도 몰라)
public class StudentRun {
	public static void main(String [] args) {
		StudentFunction sFunc = new StudentFunction();
		End :
			while(true) {
				int input = sFunc.printMenu();
				switch(input) {
					case 1 :
						sFunc.inputScore();
						break;
					case 2 :
						sFunc.printScore();
						break;
					case 3 :
						break End;
					default : 
						break;
				}
			}
		
	}
}
