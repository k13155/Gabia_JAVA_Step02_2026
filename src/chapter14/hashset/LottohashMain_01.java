package chapter14.hashset;

import java.util.HashSet;
import java.util.Random;

public class LottohashMain_01 {

	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>(); // hashset -> 중복 불가
		//TreeSet<Integer> lotto = new TreeSet<Integer>(); // 중복 불가,S정렬? 앞에 숫자랑 비교해서 크면 오른쪽 작으면 왼쪽
		
		while(true) 
		{
			int v = new Random().nextInt(45)+1;
		
			lotto.add(v);
			
			if(lotto.size() >= 6) 
			{
				break;
			}// if
		
		}// while
		
		System.out.println(lotto); // hashset 때문에 중복된 숫자는 나오지 않는다

	}

}
