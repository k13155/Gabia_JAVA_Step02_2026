package chapter08;

public class Car_Main extends Car_08{
	
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: " + speed);
	}

	/* 
	final은 오버로드가 안된다.
	@Override
	public void stop() { 
		System.out.println("자동차가 멈춥니다.");
		speed = 0;	
	}
	*/
	
	public static void main(String[] args) {
	
		Car_Main ac = new Car_Main();
		ac.speedUp();
		ac.stop(); // 부모 클래스 메서드
	}

}
