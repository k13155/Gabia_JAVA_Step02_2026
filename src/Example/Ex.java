package Example;

import java.util.Scanner;

public class Ex {
	
	public enum Item { //enum타입에 구애받지않고 배열처럼 묶어놓을 수 있다
		Start, Pause, Exit // static final 생략 Start:0, Pause:1, Exit:2 -> 배열 처리됨
	}
/*
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");
		
		int n = scan.nextInt(); // 0,1,2
		
		if(n == Item.Start.ordinal()) {
			System.out.println("게임을 시작함");
		}
		
		else if(n == Item.Pause.ordinal()) {
			System.out.println("게임이 일시정지됨");
		}
		
		else if(n == Item.Exit.ordinal()) {
			System.out.println("게임종료");
			return;
		}
		else {
			System.out.println("서비스 지원이 없는 번호입니다.");
		}// if
		
		}// while*/
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("Start / Pause / Exit : ");
			
			String a = scan.nextLine();
			//boolean b = a.equals(Item.Start);
			
			if(a.equals(Item.Start.name())) {
				System.out.println("게임을 시작함");
			}
			
			else if(a.equals(Item.Pause.name())) {
				System.out.println("게임이 일시정지됨");
			}
			
			else if(a.equals(Item.Exit.name())) {
				System.out.println("게임종료");
				return;
			}
			else {
				System.out.println("서비스 지원이 없는 번호입니다.");
			}// if
			
			}// while
			
			
		}
	
		
	}// main


