package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain_02 {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();
		
		// 요소 추가
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		
		hashSet.add("Apple");
		
		System.out.println("HashSet: " + hashSet);
		
		if(hashSet.contains("Banana")) // contains는 hashSet에 Banana가 포함되어 있냐 아니냐를 비교
		{
			System.out.println("Banana is in the HashSet");
		}
		
		// 요소 삭제
		hashSet.remove("Orange");
		
		System.out.println("HashSet: " + hashSet);

	}

}
