package chapter08;

public class Driver_Bus extends Driver_Vehicle{
	
	private int busNum = 1004;

	@Override
	public void run() {
		System.out.println(busNum + "번 버스가 달립니다.");
	}

}
