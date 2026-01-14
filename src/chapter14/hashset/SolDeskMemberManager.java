package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class SolDeskMemberManager {
	
	// HashSet 공간을 이용해서 멤버정보를 관리
	private Set<SolDeskMember> members; 
	// Set(Collection)이 어떤 타입의 객체만 담을 수 있는지 알려주는 것
	
	// 생성자를 통해서 객체의 메모리 확보
	public SolDeskMemberManager() {
		
		members = new HashSet<SolDeskMember>();
		
	}
	
	// 회원가입
	public void addMember(SolDeskMember member) {
		if(members.add(member)) 
		{
			System.out.println(member.getMemberId() + "님 회원가입 완료");
		}
		else 
		{
			System.out.println(member.getMemberId() + "은(는) 이미 존재하는 아이디 입니다.");
			
		}
	}// addMember
	
	// 출력
	public void showAllMember() {
		for(SolDeskMember member : members)
		{
			System.out.println(member);
		}
	}// showAllMember

}
