package chapter08;

public class A_B {

	protected String field;
	
	// 생성자
	
	protected void method() {
		A_03 a = new A_03();
		a.field = "value";
		a.method();
	}
	
	public static void main(String[] args) {
		A_B b = new A_B(); // 객체
		b.method(); // 부모 클래스
	}
}
