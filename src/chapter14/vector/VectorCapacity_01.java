package chapter14.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorCapacity_01 {

	public static void main(String[] args) {
		// Vector 방식: 동기화 즉 멀티스레드에서 사용
		// a와 b가 얘기하다 c가 a한테 말을걸면 다운(b와 c랑 얘기를 안해버림)됬었는데
		// 동기화는 a와 b가 얘기하다 c가 말을걸면 b와 얘기를 다하고나서 c랑 얘기할 수 있게 해줌
		// 최근에는 ArrayList를 기본으로 사용하고 synchronizedList를 추가해서 사용
		// List<String> sysList = Collections.synchronizedList(new ArrayList<>());

		// 구버전(기본용량 10)
		Vector<String> vector = new Vector<String>();

		System.out.println("----------기본크기----------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

		// 데이터 추가
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");

		System.out.println("----------데이터 3개 증가 후 크기----------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

		// 10개 이상의 데이터 추가
		for (int i = 0; i < 8; i++) {
			vector.add("Fruit" + (i + 1));
		}

		// 용량 초과 시 기존 크기 2배 증가
		System.out.println("------------데이터 11개 증가 후 크기------------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

	}

}
