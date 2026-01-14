package chapter09;

public class Wizard extends GameCharacter{

	@Override
	protected void atack() {
		System.out.println("마법사가 공격합니다.");
		
	}

	@Override
	protected void useUItimate() {
		System.out.println("마법사가 지팡이를 휘두릅니다.");
		
	}

}
