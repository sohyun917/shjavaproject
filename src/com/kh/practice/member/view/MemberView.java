package com.kh.practice.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

//출력기능
public class MemberView {
//	======= 회원관리 프로그램 =======
//			1. 회원정보 전체조회
//			2. 회원 아이디로 조회
//			3. 회원 이름으로 조회
//			4. 회원가입
//			5. 회원정보 변경
//			6. 회원탈퇴
//			0. 프로그램 종료
//			메뉴 선택 :
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === 회원관리 프로그램 === === ===");
		System.out.println("1. 회원정보 전체조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원정보 변경");
		System.out.println("6. 회원탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int value = sc.nextInt();
		return value;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("성별 : ");
		String memberGender = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();	//엔터받아주기
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member();	//9개의 정보를 가진 member변수를 생성해서 다른클래스로 보냄
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;	//값이 사라지지 않게 하려구 return을 선언하여 다른 클래스에서 사용가능하게함.
	}
	
	public void displaySuccess(String message) {
		System.out.println("[처리 결과] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[오류 발생] : " + message);
	}
	
	public String inputMemberId(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 아이디 입력 : ");
		String memberId = sc.next();
		return memberId;
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 입력 : ");
		String memberName = sc.next();
		return memberName;
	}
	
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === 회원정보 전체조회 === === ===");
		for(Member mOne : mList) {
//			System.out.println(mOne.toString()); toString은 그냥 확인하려고 써본다.
			System.out.println("회원 아이디 : " + mOne.getMemberId());
			System.out.println("회원 이름 : " + mOne.getMemberName());
			System.out.println("회원 성별 : " + mOne.getMemberGender());
			System.out.println("회원 나이 : " + mOne.getMemberAge());
			System.out.println("회원 이메일 : " + mOne.getMemberEmail());
			System.out.println("회원 폰번호 : " + mOne.getMemberPhone());
			System.out.println("회원 주소 : " + mOne.getMemberAddress());
			System.out.println("회원 취미 : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");

		}
	}
	
//	public void printOneById(Member mOne) {
//		System.out.println(mOne.toString());
//	}
	public void showOneMember(Member mOne) {
		System.out.println("=== === === 회원정보 상세조회 === === ===");
		System.out.println("회원 아이디 : " + mOne.getMemberId());
		System.out.println("회원 이름 : " + mOne.getMemberName());
		System.out.println("회원 성별 : " + mOne.getMemberGender());
		System.out.println("회원 나이 : " + mOne.getMemberAge());
		System.out.println("회원 이메일 : " + mOne.getMemberEmail());
		System.out.println("회원 폰번호 : " + mOne.getMemberPhone());
		System.out.println("회원 주소 : " + mOne.getMemberAddress());
		System.out.println("회원 취미 : " + mOne.getMemberHobby());
		System.out.println("=== === === === === === === === === ===");	
//			System.out.println(mOne.toString()); toString은 그냥 확인하려고 써본다.
			}
	
	public Member modifyMember() {
		Scanner sc = new Scanner(System.in);	//입력하는부분
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member();	//저장하는부분
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;
	}
}
