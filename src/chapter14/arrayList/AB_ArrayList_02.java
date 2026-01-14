package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AB_ArrayList_02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size: " + list.size());
		
		list.add(100);
		list.add(50);
		list.add(30);
		list.add(10);
		System.out.println("list.size: " + list.size());
		
		System.out.println();

		for(int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("-------Iterator-------");
		// list.iterator(): 일반데이터를 반복구조로 형변환 -> hasNext() 사용
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext()) // hasNext가 boolean(블린) list에 있는걸 다 돌면 알아서 false로 빠져나가서 while문 종료.
		{
			int v = it.next(); //unBoxing
			System.out.println(v);
		}
		
	}

}
