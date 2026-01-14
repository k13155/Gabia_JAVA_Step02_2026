package chapter14.linkedList;

import java.util.LinkedList;

public class LinkedList_02 {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1,"D"); // D가 C를 밀어내고 1번 자리로 들어감
		System.out.println(myList);
		
		myList.addFirst("S"); // S를 첫번째 자리로 들어감
		System.out.println(myList);

		System.out.println(myList.removeLast()); // 마지막 정보를 안보여준다
		System.out.println(myList);

	}

}
