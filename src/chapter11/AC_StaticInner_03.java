package chapter11;

import java.security.PrivateKey;

public class AC_StaticInner_03 {

	// 멤버변수
	int a = 10; // stack 영역
	private int b = 100; // class 내부에서만 사용가능
	static int c = 200; // Metaspace 영역
	
	// 생성자
	
	// 메서드
	
	// 내부 클래스(Metaspace) 
	static class Inner{
		
		// 필드
		static int d = 1000;
		
		public void printData() {
			
			//System.out.println("Metaspace 영역이 아니므로 사용 불가능: " + a);
			//System.out.println("Metaspace 영역이 아니므로 사용 불가능: " + b);
			System.out.println("같은 Metaspace 영역이므로 사용 가능: " + c);
			System.out.println("같은 Metaspace 영역이므로 사용 가능: " + d);
			
		}// printData
		
	}

	public static void main(String[] args) {
		
		Inner inner = new Inner();
		inner.printData();

	}// main

}
