package chapter08;

public class A_C extends A_03{
	
	public A_C() {
		super(); // A클래스 생성자
		this.field="value";
		this.method();
	}

	public static void main(String[] arge) {
		A_C c = new A_C(); // 자식
		c.method(); // 부모 클래스
	}
}
