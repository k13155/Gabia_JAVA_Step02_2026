package chapter09;

public class Warrior extends GameCharacter{

	@Override
	protected void atack() {
		System.out.println("전사 캐릭터로 공격합니다.");
		
	}

	@Override
	protected void useUItimate() {
		System.out.println("검을 사용해서 공격합니다.");
		
	}

}
