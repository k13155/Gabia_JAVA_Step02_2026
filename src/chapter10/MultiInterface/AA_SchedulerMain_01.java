package chapter10.MultiInterface;

import java.util.Scanner;

public class AA_SchedulerMain_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.println("전화 상담 방식을 선택하세요 : ");

			// toUpperCase(): 대소문자 구분하지 않음
			// 방법1(char)
			char input = scan.next().toUpperCase().charAt(0); 
			int ch = (int) input;
			
			/*
			if(ch == 'R' || ch == 'r') {
			Scheduler ro = new RoundRobin();
			ro.getNextCall();
			ro.sendCallToAgent();
			}
			
			else if(ch == 'L' || ch == 'l') {
			Scheduler le = new LeastJob();
			le.getNextCall();
			le.sendCallToAgent();
			}
			
			else if(ch == 'P' || ch == 'p') {
			Scheduler pr = new PriorityAllocation();
			pr.getNextCall();
			pr.sendCallToAgent();
			}
			
			else if(ch == 'S' || ch == 's') {
				System.out.println("종료 합니다.");
				break;
			}
			else {
				System.out.println("지원하지 않는 서비스 입니다.");
			}*/
			
			// 귤쌤 풀이
			Scheduler scheduler = null; 
			
			// 객체를 생성
			if (ch == 'R' || ch =='r') 
			{
				scheduler = new RoundRobin();
			}
			
			else if (ch == 'L' || ch == 'l')
			{
				scheduler = new LeastJob();
			}
			else if (ch == 'P' || ch == 'p')
			{
				scheduler = new PriorityAllocation();
			}
			else if (ch == 'S' || ch == 's')
			{
				System.out.println("업무를 종료합니다.");
				break;
			}
			else {
				System.out.println("지원하지 않는 서비스 입니다.");
				break; // 
			}

			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
	}

}
