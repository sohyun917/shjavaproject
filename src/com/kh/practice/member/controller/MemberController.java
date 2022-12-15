package com.kh.practice.member.controller;
//멤버저장소

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;
	
	public MemberController() {
		mList = new ArrayList<Member>();	//공간할당
	}
	
	public void registerMember(Member member) {	//9개의 정보를 가진 member를 받은거야.(어떤걸 받았는지 쓰기위해 괄호안에 매개변수를 넣어줘야해)
		mList.add(member);	//객체연결
	}
	
	public List<Member> printAllMember() {
		return mList;
	}
	//같은 값이 있을 때 인덱스를 리턴
	//인덱스값을 바로 MemberView로 보내면 MemberView클래스엔mList가 없기 때문에 바로 받을 수 없다.
	//따라서 밑에서 받아서 다른변수로 MemberView에 보내야해
	public int findMemberId(String memberId) {	//변수명이 동일할 필요는 없지만 저기에 String이 온다는게 중요해
		for(int i = 0; i < mList.size(); i++) {
			//memberId와 같은 데이터가
			//mList에 있는지 찾아보기!
			Member mOne = mList.get(i);
			//넘겨받은 memberId가 mOne에 있는지 확인
			if(memberId.equals(mOne.getMemberId())) {
				return i;	//인덱스값을 MemberView쪽으로 보내준다.
			}
		}
		return -1;
	}
	//위에서 리턴한 인덱스값을 이용하여 데이터찾기
	public Member printOneByIndex(int index) {
		Member member = mList.get(index);	//멤버변수값에 넣어서 리턴한다.
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
