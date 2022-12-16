package com.kh.practice.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

//��±��
public class MemberView {
//	======= ȸ������ ���α׷� =======
//			1. ȸ������ ��ü��ȸ
//			2. ȸ�� ���̵�� ��ȸ
//			3. ȸ�� �̸����� ��ȸ
//			4. ȸ������
//			5. ȸ������ ����
//			6. ȸ��Ż��
//			0. ���α׷� ����
//			�޴� ���� :
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === ȸ������ ���α׷� === === ===");
		System.out.println("1. ȸ������ ��ü��ȸ");
		System.out.println("2. ȸ�� ���̵�� ��ȸ");
		System.out.println("3. ȸ�� �̸����� ��ȸ");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. ȸ��Ż��");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ���� : ");
		int value = sc.nextInt();
		return value;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String memberId = sc.next();
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.print("�̸� : ");
		String memberName = sc.next();
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		System.out.print("���� : ");
		String memberGender = sc.next();
		System.out.print("�̸��� : ");
		String memberEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();	//���͹޾��ֱ�
		String memberAddress = sc.nextLine();
		System.out.print("��� : ");
		String memberHobby = sc.next();
		Member member = new Member();	//9���� ������ ���� member������ �����ؼ� �ٸ�Ŭ������ ����
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;	//���� ������� �ʰ� �Ϸ��� return�� �����Ͽ� �ٸ� Ŭ�������� ��밡���ϰ���.
	}
	
	public void displaySuccess(String message) {
		System.out.println("[ó�� ���] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[���� �߻�] : " + message);
	}
	
	public String inputMemberId(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "�� ���̵� �Է� : ");
		String memberId = sc.next();
		return memberId;
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� �Է� : ");
		String memberName = sc.next();
		return memberName;
	}
	
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === ȸ������ ��ü��ȸ === === ===");
		for(Member mOne : mList) {
//			System.out.println(mOne.toString()); toString�� �׳� Ȯ���Ϸ��� �ẻ��.
			System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
			System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
			System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
			System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
			System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
			System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
			System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
			System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");

		}
	}
	
//	public void printOneById(Member mOne) {
//		System.out.println(mOne.toString());
//	}
	public void showOneMember(Member mOne) {
		System.out.println("=== === === ȸ������ ����ȸ === === ===");
		System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
		System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
		System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
		System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
		System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
		System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
		System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
		System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
		System.out.println("=== === === === === === === === === ===");	
//			System.out.println(mOne.toString()); toString�� �׳� Ȯ���Ϸ��� �ẻ��.
			}
	
	public Member modifyMember() {
		Scanner sc = new Scanner(System.in);	//�Է��ϴºκ�
		System.out.print("���̵� : ");
		String memberId = sc.next();
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.print("�̸��� : ");
		String memberEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("��� : ");
		String memberHobby = sc.next();
		Member member = new Member();	//�����ϴºκ�
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;
	}
	


}
