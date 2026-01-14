package chapter08;

public class Appliance_Main {

	public static void main(String[] args) {

		Appliance_05 tv = new Appliance_TV("Samsung");
		
		tv.turnOn();
		System.out.println("---------------");

		Appliance_Washer washer = new Appliance_Washer("LG");
		
		washer.turnOn();
		System.out.println("---------------");
		
		Appliance_05[] list = new Appliance_05[3]; // 참조공간 확보
		list[0] = new Appliance_Washer("LG");
		list[1] = new Appliance_TV("Samsung");
		list[2] = new Appliance_Washer("Daewoo");
		
		for(Appliance_05 a:list) {
			a.turnOff();
		}
		
	}

}
