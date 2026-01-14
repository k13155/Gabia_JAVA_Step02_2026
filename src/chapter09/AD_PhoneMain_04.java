package chapter09;

public class AD_PhoneMain_04 {

	public static void main(String[] args) {
		
		// Phone이 추상 클래스이므로 객체생성 불가능
		// Phone p = new Phone();

		// 방법 1
		SmartPhone smartPhone = new SmartPhone("김자반");
		
		System.out.println(smartPhone.owner + "님");
		smartPhone.turnOn();
		smartPhone.inetersearch();
		smartPhone.turnOff();
		
		// 방법 2 메서드 이용
		ph(new SmartPhone("김재형"));		
	}

	public static void ph(SmartPhone tell) {
		System.out.println(tell.owner + "님");
		tell.turnOn();
		tell.inetersearch();
		tell.turnOff();
	}
}
