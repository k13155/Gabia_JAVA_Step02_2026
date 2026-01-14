package chapter08;

public class CellPhone_Dmb_Main {

	public static void main(String[] args) {

		// 11 Java폰 블랙
		CellPhone_DmbCellPhone phone = new CellPhone_DmbCellPhone(11, "Java폰", "블랙");
		
		
		// 상속받은 필드
		System.out.println("모델: " + phone.model);
		System.out.println("컬러: " + phone.color);
		
		// 자식클래스 필드
		System.out.println("채널: " + phone.channel);
		System.out.println();
		
		// 전화통화 구현
		phone.powerOn();
		phone.bell();
		phone.sendVoice("안녕하세요");
		phone.receiveVoice("반갑습니다");
		phone.hangUp();
		System.out.println();
		
		phone.turnOnDmb();
		phone.changeChannelDmb(21);
		phone.turnOnDmb();
		phone.turnOffDmb();
		
	}

}
