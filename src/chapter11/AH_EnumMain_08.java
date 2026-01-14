package chapter11;

import java.util.Scanner;

public class AH_EnumMain_08 {
	
	public enum Item { //enum타입에 구애받지않고 배열처럼 묶어놓을 수 있다, 찾기 쉽다는 장점이 있음
		Start, Pause, Exit // static final 생략 Start:0, Pause:1, Exit:2 -> 배열 처리됨
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");
		
		//syso ("start / pause / exit") : start
		int n = scan.nextInt(); // 0,1,2
		
		Item start = Item.Start; // start를 0으로 정의
		Item pause = Item.Pause; // pause를 1으로 정의
		Item exit = Item.Exit; // exit를 2으로 정의
		
		if(n == start.ordinal()) {
			System.out.println("게임을 시작함");
		}
		
		else if(n == pause.ordinal()) {
			System.out.println("게임이 일시정지됨");
		}
		
		else if(n == exit.ordinal()) {
			System.out.println("게임종료");
			return;
		}
		else {
			System.out.println("서비스 지원이 없는 번호입니다.");
		}// if
		
		}// while
		
	}// main

}
