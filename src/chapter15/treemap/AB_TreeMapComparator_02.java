package chapter15.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class AB_TreeMapComparator_02 {

	public static void main(String[] args) {

		// Comparator.reverseOrder: key 내림차순
		TreeMap<Integer, Integer> scoreMap = new TreeMap<>(Comparator.reverseOrder()); 
		
		scoreMap.put(1003, 85);
		scoreMap.put(1001, 90);
		scoreMap.put(1002, 88);
		
		System.out.println("전체 출력: " + scoreMap);
		
		// TreeMap 메서드
		System.out.println("가장 큰 학생 번호: " + scoreMap.firstKey());
		System.out.println("가장 작은 학생 번호: " + scoreMap.lastKey());

	}

}
