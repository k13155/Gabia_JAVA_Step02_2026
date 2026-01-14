package chapter07;

import java.util.Scanner;

public class Guest_Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int n = scan.nextInt();

		// 초기화를 통해서 참조 메모리 확보(Guide의 객체 갯수)
		// guide.guest[0] ~ guide.guest[4]
		Guest_Guide guide = new Guest_Guide(n);

		System.out.println();
		System.out.print("관광객 등록");

		// 이름 성별
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". 이름 : ");
			String name = scan.next();
			guide.guest[i].setName(name);

			System.out.print((i + 1) + ". 성별 : ");
			String gender = scan.next();
			guide.guest[i].setGender(gender);
		}

		/*
		 * for(int lang : guide.guest[i]) // 줄인거는 배열만 가능(위에서 배열은 guide.guest가 배열 {
		 * System.out.println("관광객 이름 : "); String name = scan.next();
		 * guide.guest[i].setName(name);
		 * 
		 * System.out.println("관광객 성별 : "); String gender = scan.next();
		 * guide.guest[i].setGender(gender); }
		 */

		System.out.println();

		// whlie문
		outer:while (true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");

			int select = scan.nextInt();

			switch (select) {
			case 1: 
				for (int i = 0; i < n; i++) 
				{
					System.out.println((i + 1) + ". 이름 : " + guide.guest[i].getName());
					System.out.println((i + 1) + ". 성별 : " + guide.guest[i].getGender());
					System.out.println((i + 1) + ". 목적지 : " + Guest_Guide.getPoint());
					System.out.println();
				}
				break;
			
			case 2:
				System.out.println("어디로 변경하시겠습니까? ");
				Guest_Guide.point = scan.next();
				System.out.println(Guest_Guide.point + "로 목적지가 변경되었습니다.");
				System.out.println("---------------------------");
				break;
				
			case 3:
				System.out.println();
				System.out.println("종료");
				break outer;
			}
		} // while
	}

}
