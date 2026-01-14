package chapter08;

// 상속 키워드: extends
public class Fruit_Berry extends Fruit_01{ // extends Fruit_01을 적어두면 Fruit_01에 있는게 담겨져있다
	
	private String name;
	private String size;
	
	// 초기화 메서드
		public void Set2(String a, String b) {
			name = a;
			size = b;
			
		}

		public void Disp2() {
			System.out.println("과일이름: " + name);
			System.out.println("크기: " + size);
		}
	
}
