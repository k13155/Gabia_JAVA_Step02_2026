package chapter08;

public class Parent_Child extends Parent_06{

	@Override //부모걸 덮어쓰기(우선권을 가짐)
	public void method2() {
		System.out.println("Child-method2()");
	} 
	
	// Override(X)
	public void method3() {
		System.out.println("Child-method3()");
	} 
	
}
