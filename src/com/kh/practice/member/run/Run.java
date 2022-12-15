package com.kh.practice.member.run;

import java.util.List;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

public class Run {
	public static void main(String [] args) {
		MemberView view = new MemberView();
		MemberController mCon = new MemberController();
		done :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
				case 1 : 
					List<Member> mList = mCon.printAllMember();
					view.showAllMember(mList);
					break;
				case 2 :
					String memberId = view.inputMemberId();
					int index = mCon.findMemberId(memberId);
					if(index == -1) {
						//�����ϴ� �޼��� ���
					}
					Member mOne = mCon.printOneByIndex(index);
					view.printOneById(mOne);
					break;
				case 3 : 
					String memberName = view.inputMemberName();
					int index1 = mCon.findMemberName(memberName);
					if(index1 == -1) {
						//�����ϴ� �޼��� ���
					}
					Member mOne1 = mCon.printNameByIndex(index1);
					view.printOneByName(mOne1);
					break;
				case 4 : 
					Member member = view.inputMember();
					mCon.registerMember(member); 	//�Է¹��� ������ �����ٰ� �����Ѵ�.
					break;
				case 5 : break;
				case 6 : break;
				case 0 : break done;
			}
		}
	}
}
