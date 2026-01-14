package chapter15.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
	
	// 생성자(HashMap 참조 메모리 확보)
	private HashMap<Integer, String> hashMap = new HashMap<>();
			
	// addMember
	public void addMember(Member a) {
		hashMap.put(a.memberId(), a.memberName());
	}
	/*		
	// removeMember: hashMap.containsKey(memberId)
	public boolean removeMember(int i) {
		
		while(hashMap.containsKey(i))
		{
			hashMap.remove(i);
			return true;
		}// while
		System.out.println(i + "가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAllMember() {
		Iterator<Integer> ir =hashMap.keySet().iterator();
		
		while(ir.hasNext()) 
		{
			int key = ir.next();
			String member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}*/
	
	// HashMap<Integer, String>에서 String(value)에서는 중복되어도 상관없지만 Integer(key)는 중복되선 안됨
	public void removeMember(int i) 
	{
		if (hashMap.containsKey(i)) // containsKey(i): HashMap<Integer, String>여기서 Integer(key)가 겹치는게 있는지 없는지 확인
		{
			hashMap.remove(i); // 겹치는게 있으면 삭제
			System.out.println(i + " - 해당하는 아이디가 삭제되었습니다.");
		} 
		
		else 
		{
			System.out.println("해당하는 아이디가 없습니다."); 
		}
		
	}
	
	public void showAllMember() 
	{
		for (Integer hashmap:hashMap.keySet()) 
		{
			System.out.println(hashmap + " : " + hashMap.get(hashmap));
		}
	}
	

}
