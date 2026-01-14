package chapter08;

public class Driver_Main {

	public static void main(String[] args) {

		Driver_10 driver = new Driver_10();
		//Driver_Vehicle vehicleBus = new Driver_Bus();
		//driver.drive(vehicleBus); -> Java 8 밑에 버전때 주로 사용
		driver.drive(null);;
		
		driver.drive(new Driver_Taxi());
		

	}

}
