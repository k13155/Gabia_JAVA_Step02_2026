package chapter11;

class OutterRun{
	
	// 익명의 클래스(Runnable)
	Runnable getRunnable(int i) { //Runnable은 매개변수랑 지역변수가 고정된(final)값을 가지게 된다
		int num = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				//num = 200;
				//i = 10;
				
				System.out.println(i);
				System.out.println(num);
				
			}// run
		};
		
	}// Runnable
	
}// OutterRun

public class AE_AnonyMousInnerMain_05 {

	public static void main(String[] args) {
		
		OutterRun out = new OutterRun();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
	}

}
