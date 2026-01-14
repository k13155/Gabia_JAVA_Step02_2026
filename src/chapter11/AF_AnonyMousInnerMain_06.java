package chapter11;

// 방법 1
class OutterRunnable {
	
	// class(heap)
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
			
		}
	};
	
}// OutterRunnable

public class AF_AnonyMousInnerMain_06 {

	public static void main(String[] args) {
		OutterRunnable out = new OutterRunnable();
		out.runner.run();

	}

}

//방법 2 객체 생략
//class OutterRunnable {
//
//	public void run() {
//
//		// class(heap)
//		/*Runnable runner = */new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Runnable이 구현된 익명의 클래스 변수");
//
//			}
//		}.run();
//
//	}// OutterRunnable
//}
//
//
//public class AF_AnonyMousInnerMain_06 {
//
//	public static void main(String[] args) {
//		OutterRunnable out = new OutterRunnable();
//		out.run();
//
//	}
//
//}

