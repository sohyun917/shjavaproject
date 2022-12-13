package com.kh.day15.exercise;

public class GuestRun {
	public static void main(String [] args) {
		GuestFunction gFunc = new GuestFunction();
		end :
			while(true) {
				int choice = gFunc.printMenu();
				switch(choice) {
					case 1 : gFunc.insert();break;
					case 2 : gFunc.print();break;
					case 3 : gFunc.print();break;
					case 4 : gFunc.load();break;
					case 0 : break end;
					default : System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
				}
			}
	}
}
