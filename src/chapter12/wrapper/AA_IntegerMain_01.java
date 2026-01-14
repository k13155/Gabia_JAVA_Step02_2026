package chapter12.wrapper;

public class AA_IntegerMain_01 {

	public static void main(String[] args) {

		// int : 기본형 , Integer : 참조형
		Integer i = new Integer(100); // int i = 100;
		
		Integer num = 100; // 참조형 변수(오토박싱)
		
		int iNum1 = 100; // 언박싱
		int iNum2 = num.intValue(); //언박싱: 클래스(참조형) -> 일반형
		
		int jNum = 200;
		
		// 언박싱(Integer -> int)
		int sum = iNum2 + jNum;
		System.out.println(sum);
		
		int total = num.intValue() + jNum;
		System.out.println(total);
		
		// 오토박싱(int -> Integer)
		Integer x = jNum;
		Integer y = Integer.valueOf(jNum);
		System.out.println(x);
		System.out.println(y);
		
	}

}
