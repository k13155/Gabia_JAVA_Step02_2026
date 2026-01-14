package chapter14.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList와 LinkedList의 처리속도 비교

public class LinkedList_01 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime1;
		long endTime1;
		
		startTime1 = System.nanoTime();
		
		// ArrayList의 작업실
		for(int i = 0; i < 10000; i++)
		{
			list1.add(0, String.valueOf(i)); // ArrayList
			//System.out.println(i); -> 1~10000까지 정상적으로 작동하나 확인
		}
		
		endTime1 = System.nanoTime();
		
		System.out.println("ArrayList 작업시간: " + (endTime1 - startTime1) + "ns");

		System.out.println("---------------------------");
		
		long startTime2;
		long endTime2;
		
		startTime2 = System.nanoTime();
		
		// LinkedList의 작업실
		for(int i = 0; i < 10000; i++)
		{
			list2.add(0, String.valueOf(i)); // LinkedList
			//System.out.println(i); -> 1~10000까지 정상적으로 작동하나 확인
		}
		
		endTime2 = System.nanoTime();
		
		System.out.println("ArrayList 작업시간: " + (endTime2 - startTime2) + "ns");

	}

}
