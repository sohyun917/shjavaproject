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
					String memberId = view.inputMemberId("검색");
					int index = mCon.findMemberId(memberId);
					if(index == -1) {
						//없습니다 메세지 출력
					}
					Member mOne = mCon.printOneByIndex(index);
					view.showOneMember(mOne);
					break;
				case 3 : 
					String memberName = view.inputMemberName();	//view의 메소드를 호출해 memberName을 받아준다.
					Member memberOne = mCon.findMemberName(memberName);
					view.showOneMember(memberOne);
					break;
				case 4 : 
					Member member = view.inputMember();
					mCon.registerMember(member); 	//입력받은 정보를 가져다가 저장한다.
					view.displaySuccess("가입이 완료되었습니다.");	//일일이 sysout으로 적지 않고 사용하는방법
					break;
				case 5 : 
					member = view.modifyMember();
					mCon.updateMember(member);
					view.displaySuccess("수정이 완료되었습니다.");
					break;
				case 6 :
					memberId = view.inputMemberId("삭제");
					index = mCon.findMemberIndex(memberId);
					mCon.removeMember(index);
					view.displaySuccess("계정이 삭제되었습니다.");
					break;
				case 0 : break done;
			}
		}
	}
}
