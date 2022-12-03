package shproject;

import java.util.Scanner;

public class CafeInventory {
	Cafe [] cafes;
	
	public CafeInventory() {
		cafes = new Cafe[3];
	}
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 카페 재고관리 프로그램 ======");
		System.out.println("1. 입출고내역");
		System.out.println("2. 재고내역확인");
		System.out.println("3. 발주프로그램");
		System.out.println("4. 프로그램 종료");
		System.out.println("어떤 메뉴로 들어가시겠습니까? ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inOutStock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 입출고내역 ======");
		for(int i = 0; i < cafes.length; i++) {
//			System.out.println("메뉴화면으로 돌아가시려면 입고량에 100을 적어주세요.");
			System.out.print("제품명 입력 : ");
			String name = sc.next();
			System.out.print("입,출고량 입력 : ");
			int inoutStock = sc.nextInt();
//			if(inoutStock == 100) break;
			cafes[i] = new Cafe();
			cafes[i].setName(name);
			cafes[i].setInoutStock(inoutStock);
			
		}
	}
	
	public void stock() {
		System.out.println("====== 재고내역확인 ======");
		for(int i = 0; i < cafes.length; i++) {
			System.out.println("제품명 : " + cafes[i].getName());
			System.out.println("재고량 : " + cafes[i].getInoutStock());			
		}
	}
	
	public void checkOrder() {
		System.out.println("====== 발주프로그램 ======");
		for(int i = 0; i < cafes.length; i++) {
			int num = cafes[i].getInoutStock();
			String name = cafes[i].getName();
			if(num <= 3) {
				System.out.println(name + "이/가 " + num + "개 남았습니다.");
				System.out.println(name + "을/를 발주해주세요.");
			}
			
		}
	}
	
	public void printGoodBye() {
		System.out.println("====== 프로그램 종료 ======");
	}
	
	public void printException() {
		System.out.println("메뉴를 선택해주세요.");
	}
	}
