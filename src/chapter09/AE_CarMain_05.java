package chapter09;

public class AE_CarMain_05 {

	public static void main(String[] args) {
		
		/*// 방법 1
		AICar mycar = new AICar();
		
		mycar.run(); -> 밑에 있는걸 모두 포함되어있음
		
		mycar.startCar();
		mycar.drive();
		mycar.stop();
		mycar.turnOff();
		
		Car hiscar = new ManualCar();
		hiscar.run();
		*/
		
		System.out.println("---------------자율주행---------------");
		move(new AICar()); 
		System.out.println("---------사람이 운전하는 자동차----------");
		move(new ManualCar());

	}
	
	public static void move(Car a) {
		a.run();
	}

}
