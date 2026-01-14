package chapter15.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AB_HashMapMaim_02 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		// id: key | 비번: value
		
		map.put("Spring", "123"); // Spring = 123
		map.put("summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("아이디와 비밀번호를 입력하세요!");
			System.out.print("아이디: ");
			String id = scan.next();
			
			// 입력한 아이디 존재 여부
			if(map.containsKey(id))
			{
				System.out.print("비밀번호: ");
				String pw = scan.next();
				
				// 비번 일치여부
				if(map.get(id).equals(pw)) 
				// 비밀번호를 기입하면 map.containsKey(id)안에 map.get(id)에 있는 비밀번호랑 같은지 비교
				{
					System.out.println("로그인 성공!");
					break;
				}
				
				else
				{
					System.out.println("비밀번호가 일치 하지 않습니다.");
					continue;
				}
			}
			
			else
			{
				System.out.println("입력하신 아이디는 존재하지 않습니다.");
			}
		}

	}

}
