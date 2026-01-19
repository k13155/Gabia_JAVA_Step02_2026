package chapter19;

public class AA_Thread_01 {

	public static void main(String[] args) {
		
		Thread_01 t = new Thread_01();
		t.start(); // run(), 동시 실행
		//t.run(); // 독립적인 공간은 있지만 스레드 역할은 할 수 없다.
		
		System.out.println("main 종료");

	}

}
