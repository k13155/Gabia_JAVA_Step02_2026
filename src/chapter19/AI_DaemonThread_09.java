package chapter19;

public class AI_DaemonThread_09 implements Runnable{
	
	static boolean autoSave = false;

	public static void main(String[] args) {

		AI_DaemonThread_09 dm = new AI_DaemonThread_09(); // 일반객체
		Thread t = new Thread(dm); // 일반 객체를 스레드로 변환 -> run()을 start()로 변경
		t.setDaemon(true); // 데몬 스레드로 변환(메인이 종료되면 자동 종료)
		t.start(); // 데몬스레드 실행
		
		for(int i = 0; i < 15; i++)
		{
			// 메인 스레드
			try 
			{
				Thread.sleep(1000); // 1c
			} 
			
			catch (Exception e) 
			
			{
				e.printStackTrace();
			}
			
			System.out.println(i); // 메인
			if(i==3)
			{
				autoSave = true;
			}
		}

	}
	
	//--------------------------------------------

	@Override
	public void run() {
		
		while(true) 
		{
			try 
			{
				Thread.sleep(3000); // 3c
			} 
			
			catch (Exception e) 
			{
				e.printStackTrace();
			}//
			
			if(autoSave)
			{
				System.out.println("자동 저장됩니다.");
			}
			
		}// while
		
	}// run
	

}
