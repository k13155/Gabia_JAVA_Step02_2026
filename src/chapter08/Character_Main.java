package chapter08;

import java.util.Scanner;

public class Character_Main {

	public static void main(String[] args) {
		
		// 
		Scanner scan = new Scanner(System.in);
		
		Character[] demege = {new Warrior(), new Mage()}; 
		
		for(Character de : demege) {
			System.out.print(de.getClass().getSimpleName() + " 데미지를 입력하시오: ");
			int a = scan.nextInt();
			System.out.println(de.getClass().getSimpleName() + " 공격력 : " + de.attack(a));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("기본 공격력 입력: ");
		int power = sc.nextInt();
		
		Character[] characters = {new Warrior(), new Mage()};
		
		for (Character c : characters) {
			System.out.println(c.getClass().getSimpleName() + " 공격력 : " + c.attack(power));
		}
	}

}
