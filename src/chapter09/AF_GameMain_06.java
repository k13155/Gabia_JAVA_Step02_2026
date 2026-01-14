package chapter09;

public class AF_GameMain_06 {

	public static void main(String[] args) {
		
		System.out.println("====전사 전투====");
		at(new Warrior());
		System.out.println("\n====마법사 전투====");
		at(new Wizard());
	}
	
	public static void at(GameCharacter atk) {
		atk.fight();
	}

}
