package chapter15.hashmap;

public class AF_MemberHashMapMain_06 {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();

		memberHashMap.addMember(new Member(1001, "이수정"));
		memberHashMap.addMember(new Member(1002, "박진영"));
		memberHashMap.addMember(new Member(1003, "김우진"));

		Member memberJung = new Member(1004, "정하나");
		memberHashMap.addMember(memberJung);

		memberHashMap.showAllMember();

		memberHashMap.removeMember(1002);
		memberHashMap.removeMember(1005);
		memberHashMap.addMember(new Member(1005,"김재형"));
		
		// 중복이 안됨
		memberHashMap.addMember(new Member(1003, "김우진"));
		memberHashMap.showAllMember();

	}

}
