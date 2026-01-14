package chapter08;

import java.util.Scanner;

public class Example_Main {

	public static void main(String[] args) {
		
//		Example add = new Example_CalPlus();
//		System.out.println("CalPlus : " + add.getResult(20, 10));
//		
//		Example min = new Example_CalMinus();
//		System.out.println("CalMinuse : " + min.getResult(20, 10));

		// 방법1
		Scanner s = new Scanner(System.in);
		
		Example[] calculators = { new Example_CalPlus(), new Example_CalMinus() }; //[] 배열, () 함수
		
		
		System.out.print("정수 A를 입력하세요: ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요: ");
		int b = s.nextInt();
		
		/*
		 * Example calculators1 = new CalPlus();
		 * Example calculators2 = new CalMinus();
		 */
		/*
		 * calculators1.getResult(a, b);
		 * calculators2.getResult(a, b);
		 */
		
		for(Example ca : calculators) {
			System.out.println(ca.getClass().getSimpleName() + ": " + ca.getResult(a, b));
			
		}
		System.out.println();
		
		// 방법2: 메서스 활용
		int plus = calc(new Example_CalPlus(), a, b);
		System.out.println("두 수의 합: " + plus);
		int minus = calc(new Example_CalMinus(), a, b);
		System.out.println("두 수의 차: " + minus);
		
		System.out.println();
//		public static int                 calc(Example c1, int a, int b)
		//System.out.println("두 수의 합: " + calc2(new Example_CalPlus(), a, b));
		//System.out.println("두 수의 차: " + calc2(new Example_CalMinus(), a, b));
		
		// 방법3
		
		calc2(new Example_CalMinus(), a, b);
		calc2(new Example_CalPlus(), a, b);
		
	}

	public static int calc(Example c1, int a, int b) {
		
		return c1.getResult(a, b);
	}
	public static void calc2(Example c1, int a, int b) {
		System.out.println(c1.getClass().getSimpleName() + ": " + c1.getResult(a, b));
	}
	
	
}













