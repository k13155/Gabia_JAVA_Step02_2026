package chapter08;

public class Parent_Child_Main {

	public static void main(String[] args) {

		Parent_Child child = new Parent_Child(); // -> 자식것도 자식것, 부모것도 자식것
		
		child.method1(); // 부모꺼
		child.method2(); // 자식꺼
		child.method3(); // 자식꺼
		System.out.println();
		
		// Parent_Child를 거치고 Parent_06가는거?
		Parent_06 parent1 = child; // == Parent_06 parent1 = new Parent_Child;
		parent1.method1(); // 부모꺼
		parent1.method2(); // 자식꺼
		System.out.println();
		
		// Parent_Child를 거치지 않고 Parent_06불러오는거?
		Parent_06 parent2 = new Parent_06();
		parent2.method1(); // 부모꺼
		parent2.method2(); // 자식꺼
	}

}
