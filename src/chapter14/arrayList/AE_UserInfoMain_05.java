package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AE_UserInfoMain_05 {

	public static void main(String[] args) {

		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();

		UserInfo u = new UserInfo();

		while (true) 
		{
			Scanner scan = new Scanner(System.in);

			System.out.print("아이디 생성(exit 입력시 종료): ");
			u.setId(scan.next());

			System.out.print("패스워드 입력: ");
			u.setPwd(scan.nextInt());
			
			System.out.println(u.getId());
			System.out.println(u.getPwd());

			arr.add(u);
			
		}

	}

}
