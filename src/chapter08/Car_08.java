package chapter08;

public class Car_08 {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() { //final = 상속값(값이 변하지 않음)
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
		
	}

}
