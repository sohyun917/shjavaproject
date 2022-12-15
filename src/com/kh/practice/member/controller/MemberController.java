package com.kh.practice.member.controller;
//��������

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;
	
	public MemberController() {
		mList = new ArrayList<Member>();	//�����Ҵ�
	}
	
	public void registerMember(Member member) {	//9���� ������ ���� member�� �����ž�.(��� �޾Ҵ��� �������� ��ȣ�ȿ� �Ű������� �־������)
		mList.add(member);	//��ü����
	}
	
	public List<Member> printAllMember() {
		return mList;
	}
	//���� ���� ���� �� �ε����� ����
	//�ε������� �ٷ� MemberView�� ������ MemberViewŬ������mList�� ���� ������ �ٷ� ���� �� ����.
	//���� �ؿ��� �޾Ƽ� �ٸ������� MemberView�� ��������
	public int findMemberId(String memberId) {	//�������� ������ �ʿ�� ������ ���⿡ String�� �´ٴ°� �߿���
		for(int i = 0; i < mList.size(); i++) {
			//memberId�� ���� �����Ͱ�
			//mList�� �ִ��� ã�ƺ���!
			Member mOne = mList.get(i);
			//�Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��
			if(memberId.equals(mOne.getMemberId())) {
				return i;	//�ε������� MemberView������ �����ش�.
			}
		}
		return -1;
	}
	//������ ������ �ε������� �̿��Ͽ� ������ã��
	public Member printOneByIndex(int index) {
		Member member = mList.get(index);	//����������� �־ �����Ѵ�.
		return member;
	}
	
	public int findMemberName(String memberName) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberName.equals(mOne.getMemberName())) {
				return i;
			}
		}
		return -1;
	}
	
	public Member printNameByIndex(int index) {
		Member member = mList.get(index);
		return member;
	}
}
