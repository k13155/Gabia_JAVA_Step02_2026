package chapter07;

import java.util.Scanner;

public class Guest_Guide {

		// 멤버변수
		static String point; // static은 메타 스페이스 영역
		Guest_04[] guest; // String[] str = new String[5];
 		Scanner scan; // 입력을 받을때 스캐너 사용
 		
 		// 생성자
 		private Guest_Guide() {
			// TODO Auto-generated method stub

		}
 		
 		public Guest_Guide(int n) {
 			// 목적지
 			point = "발리";
 			
 			// 관광객수 만큼 메모리 참조공간 확보
 			/*Guest[] String = new Guest[n]; */
 			guest = new Guest_04[n]; // null
 			
 			// null 대신 객체 선언
 			for(int i=0; i<n; i++)
 			{
 				guest[i] = new Guest_04();
 			}//for
 			
 		}//Guide
 		
 		public static String getPoint() {
			return point;
		}
 		

}
/* int나 false는 초기화하지 않으면 0또는 0.0으로 들어가지만
   String은 초기화 하지 않는다면 null값으로 뜬다*/
