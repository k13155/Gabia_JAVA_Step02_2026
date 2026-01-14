package chapter14.hashset;

public class SolDeskMember {

	private int memberId;
	private String memberName;
	
	public SolDeskMember() {
		
	}
	
	public SolDeskMember(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// getter & setter
	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() { // toString -> 커마
		//return "SolDeskMember [memberId=" + memberId + ", memberName=" + memberName + "]";
		return memberName + "님의 아이디는" + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof SolDeskMember) 
		{
			SolDeskMember member = (SolDeskMember) obj;
			return this.memberId == member.memberId || this.memberName.equals(member.memberName);
		}
		return false;
	}


	
	
	
	
}
