package chapter08;

public class Appliance_TV extends Appliance_05{
	
	
	public Appliance_TV(String brand){
	super (brand); // super는 부모(Appliance_05를 불러옮)
	}

	@Override
	void turnOn() {
		// System.out.println(brand + " 전원을 켭니다."); 
		super.turnOn(); // 부모 동작 유지
		System.out.println("TV 화면을 켭니다.");
	}
	
	
}
