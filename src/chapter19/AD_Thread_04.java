package chapter19;

class Counter {
	
	private int count = 0;
	
	// synchronized: 공유 자원에 대해 한 번에 하나의 스레드만 접근하게 함
	synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
}

public class AD_Thread_04 {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		Runnable task = () -> {
			for(int i = 0; i < 1000; i++)
			{
				counter.increment();
			}
		}; // Runnable
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		// 동시 실행이 되어도 충돌이 없음
		thread1.start(); // Runnable task
		thread2.start();
		
		try 
		{
			thread1.join(); // thread1이 끝날때 까지 기다림
			thread2.join();
		} 
		
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		System.out.println(counter.getCount());
		
	}

}
