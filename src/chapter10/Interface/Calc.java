package chapter10.Interface;

public interface Calc { // interface에서 public을 사용하지 못하지만, 추상메서드(중괄호가없는 메서드)에서는 사용가능
	
	// 멤버변수
	public static final double PI = 3.14;
	int ERROR = -9999999;
	
	// 추상메서드
	int add(int num1, int num2); 
	
	int substaract(int num1, int num2);

	int times(int num1, int num2);
	
	int divide(int num1, int num2);
	
	/* 인터페이스에선 일반 메서드가 못쓰고 추상 메서드만 사용할 수 있다
	public void display() {
		
	}
	*/
	
	// 자바 8부터 제공 -> 기본 수행문을 구현할떄 사용(재정의 가능)
	default void description() {
		myMethod(); // 같은 heap이라 사용가능
		System.out.println("정수 계산기"); 
	}
	
	// 자바 8부터 제공
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		mystaticMethod(); // 같은 메타 스페이스라 사용가능
		return total;
	}//total
	
	// 자바 9부터 제공 -> private 메서드는 현재의 클래스에서만 사용가능
	private void myMethod() {
		System.out.println("private 메서드");
	}
	
	// 정적메서드 -> 객체 생성과 상관없이 클래스명으로 사용가능
	private static void mystaticMethod() {
		System.out.println("private static 메서드");
	}
	
}
