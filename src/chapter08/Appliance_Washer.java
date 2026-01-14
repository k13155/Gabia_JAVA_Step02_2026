package chapter08;

public class Appliance_Washer extends Appliance_05{
	
	public Appliance_Washer(String brand) {
		super (brand);
	}

	@Override // 덮어쓰기
	void turnOn() {
		super.turnOn();
		System.out.println("세탁기를 돌립니다.");
	}
	
	
	
	
}
